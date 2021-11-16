package uc.us_security;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class UsSecurityApplication {

    static BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder(); 
    //private static BCryptPasswordEncoder bCryptPasswordEncoder;
    public static void main(String[] args) {
        //System.out.println(bCryptPasswordEncoder.encode("123"));
        SpringApplication.run(UsSecurityApplication.class, args);

        System.out.println(bCryptPasswordEncoder.encode("123").toString()); 
    }

}