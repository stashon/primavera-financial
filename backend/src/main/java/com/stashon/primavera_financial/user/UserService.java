package com.stashon.primavera_financial.user;

import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    // Manual Constructor Injection (Replaces @RequiredArgsConstructor)
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    
    // 1. CREATE (Register)
    public User registerUser(User user) {
        if (userRepository.existsByEmail(user.getEmail())) {
            throw new RuntimeException("Email already taken");
        }
        return userRepository.save(user);
    }
    
    // 2. READ (Get All Users)
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
    
    // 2b. READ (Get One User by ID)
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found"));
    }

    // 3. UPDATE (Change details)
    public User updateUser(Long id, User userDetails) {
        User user = getUserById(id); // Find the existing user first
        
        // Update the fields
        user.setFirstName(userDetails.getFirstName());
        user.setLastName(userDetails.getLastName());
        
        // Save the changes
        return userRepository.save(user);
    }

    // 4. DELETE (Remove user)
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}