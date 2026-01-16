package com.stashon.primavera_financial.user;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final UserService userService;

    // Manual Constructor Injection
    public AuthController(UserService userService) {
        this.userService = userService;
    }

    // Endpoint: POST /api/auth/register
    // Receives JSON data and creates a new user
    @PostMapping("/register")
    public ResponseEntity<User> register(@RequestBody User user) {
        // Delegate to service layer
        User registeredUser = userService.registerUser(user);
        
        // Return 200 OK with the created user
        return ResponseEntity.ok(registeredUser);
    }
}
