package com.stashon.primavera_financial.dto;

import java.math.BigDecimal;

//token (String), userId (Long), firstName (String), lastName (String), email (String), balance (BigDecimal)


public class AuthResponse {

    private Long userId;
    private String firstName;
    private String lastName;
    private String email;
    private String token;
    private BigDecimal balance;
    
    // --- CONSTRUCTORS ---
    public AuthResponse() {}

    public AuthResponse(Long userId, String firstName, String lastName, String email, String token, BigDecimal balance) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.token = token;
        this.balance = balance;
        this.userId = userId;
        
    }

    // --- GETTERS & SETTERS ---
    public Long getUserId(){ return userId; }
    public void setUserId(Long userId) { this.userId = userId; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getToken(){ return token; }
    public void setToken(String token){ this.token = token; }

    public BigDecimal getBalance() { return balance; }
    public void setBalance(BigDecimal balance) { this.balance = balance; }
}


