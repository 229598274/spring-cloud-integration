package com.example.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;

@EnableWebSecurity
public class OAuth2ResourceServerSecurityConfiguration {
    @Value("${spring.security.oauth2.resourceserver.jwt.jwk-set-uri}")
    String jwkSetUri;

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        // @formatter:off
        http.csrf().disable()
//                .authorizeHttpRequests((authorize) -> authorize
//                        .antMatchers(HttpMethod.GET, "/message/**").hasAuthority("SCOPE_message:read")
//                        .antMatchers(HttpMethod.POST, "/message/**").hasAuthority("SCOPE_message:write")
//                        .anyRequest().authenticated()
//                )

//                .authorizeRequests()
//                .antMatchers(HttpMethod.GET, "/message/**").
//                .antMatchers(HttpMethod.POST, "/message/**").hasAuthority("SCOPE_message:write")
//                .antMatchers("/a").anonymous()
//                .and()
                .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt);
        // @formatter:on
        return http.build();
    }

    @Bean
    JwtDecoder jwtDecoder() {
        System.out.println("this.jwkSetUri");
        System.out.println(this.jwkSetUri);
        return NimbusJwtDecoder.withJwkSetUri(this.jwkSetUri).build();
    }
}
