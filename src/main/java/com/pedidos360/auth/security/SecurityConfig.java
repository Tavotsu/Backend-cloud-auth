package com.pedidos360.auth.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
            .csrf(csrf -> csrf.disable())
            .authorizeHttpRequests(authorize -> authorize
                .requestMatchers("/api/v1/auth/public").permitAll()
                .anyRequest().authenticated()
            )
            // Configuración para que actúe como cliente e inicie sesión con Azure AD
            .oauth2Login(oauth2 -> oauth2
                .defaultSuccessUrl("/api/v1/auth/me", true)
            );
        return http.build();
    }
}
