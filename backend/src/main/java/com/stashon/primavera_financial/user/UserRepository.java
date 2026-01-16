package com.stashon.primavera_financial.user;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

// JpaRepository<User, Long> speaks to Spring: manage 'User' objects that have a 'Long' ID.
public interface UserRepository extends JpaRepository<User, Long> {

    // Spring automatically writes the SQL: "SELECT * FROM users WHERE email = ?"
    Optional<User> findByEmail(String email);

    // Spring automatically writes: "SELECT COUNT(*) > 0 FROM users WHERE email = ?"
    boolean existsByEmail(String email);
}
