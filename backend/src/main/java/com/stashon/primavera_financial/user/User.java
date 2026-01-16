package com.stashon.primavera_financial.user;

// 1. JAKARTA PERSISTENCE (JPA)
// Allows Java to talk to the SQL Database, without writing SQL queries
import jakarta.persistence.*;

// 2. LOMBOK
// The library generate code at compile time.
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

// 3. JAVA UTILITIES
// Standard Java tools for time and money.
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import java.math.BigDecimal;
import java.time.LocalDateTime;

// @Data: It automatically generates:
// - Getters (e.g., getFirstName())
// - Setters (e.g., setFirstName())
// - toString() (so you can print the object)
// - equals() and hashCode() (for comparing objects)
@Data 

// @Builder: Allows us to create objects in a readable way, like:
// User.builder().firstName("Sarah").email("s@test.com").build();
@Builder

// @NoArgsConstructor: Creates a constructor with NO arguments: public User() {}
// (Hibernate/JPA REQUIRES).
@NoArgsConstructor

// @AllArgsConstructor: Creates a constructor with ALL arguments.
// (for testing).
@AllArgsConstructor

// @Entity: Tells Hibernate "It represents a ROW in a database table."
@Entity

// @Table: By default, the table would be named "User". 
// Since "User" is a reserved keyword in Postgres (like "SELECT" or "WHERE")
// So we force the table name to be plural: "users".
@Table(name = "users")
public class User {

    // @Id: Primary Key
    // @GeneratedValue: choose the ID number automatically ('AUTO_INCREMENT' in SQL)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // @Column(nullable = false): Adds a 'NOT NULL' constraint to the SQL table.
    // If you try to save a user without a first name, the database will reject it.
    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    // unique = true: no two users can have the same email.
    @Column(unique = true, nullable = false)
    private String email;

    // Will eventually store the HASHED password (e.g., "$2a$10$D8..."), 
    // never the plain text "password123".
    @Column(nullable = false)
    private String password;

    // 💰 MONEY RULE: NEVER use 'Double' or 'Float' for money.
    // Floating point math has errors (e.g., 0.1 + 0.2 = 0.30000000000000004).
    // BigDecimal is exact.
    // precision = 19: Total digits allowed.
    // scale = 2: Digits allowed after the decimal (e.g., 12345.99).
    @Column(precision = 19, scale = 2)
    private BigDecimal balance;

    // @CreationTimestamp: the very first time the user is saved and then automatically
    // updatable = false: the creation date never changes.
    @CreationTimestamp
    @Column(updatable = false)
    private LocalDateTime createdAt;

    // @UpdateTimestamp: Hibernate will update this to "NOW()" every single time
    @UpdateTimestamp
    private LocalDateTime updatedAt; // helpful for auditing
}