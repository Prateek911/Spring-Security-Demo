package com.luv2code.springboot.cruddemo.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurityConfig {

   @Bean
    public InMemoryUserDetailsManager userDetailsManager(){

       UserDetails prateek = User.builder().username("Prateek").password("{noop}pou123").roles("EMPLOYEE").build();
       UserDetails poulami = User.builder().username("Poulami").password("{noop}pra123").roles("EMPLOYEE","MANAGER","ADMIN").build();

       return new InMemoryUserDetailsManager(prateek,poulami);
   }

}
