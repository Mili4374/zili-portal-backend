package com.zili.portal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
            .csrf().disable() // Disables CSRF (necessary for APIs)
            .cors().and()     // Tells Security to use our WebConfiguration CORS settings
            .authorizeRequests()
            .antMatchers("/**").permitAll(); // Allows all requests to pass through
        
        return http.build();
    }
}