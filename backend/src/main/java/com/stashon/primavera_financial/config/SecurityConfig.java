package com.stashon.primavera_financial.config; // Make sure this matches your folder!

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(AbstractHttpConfigurer::disable)
            
            // 1. Allow the H2 Console to render in a frame (Required!)
            .headers(headers -> headers.frameOptions(frame -> frame.disable()))
            
            .authorizeHttpRequests(auth -> auth
                // 2. Allow access to H2 Console
                .requestMatchers("/h2-console/**").permitAll()
                
                // Existing rules...
                .requestMatchers(HttpMethod.POST, "/api/auth/register").permitAll()
                .requestMatchers("/api/users/**").permitAll()
                .anyRequest().authenticated()
            );
        
        return http.build();
    }
}