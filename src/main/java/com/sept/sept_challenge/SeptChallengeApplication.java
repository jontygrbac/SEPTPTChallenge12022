package com.sept.sept_challenge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class SeptChallengeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SeptChallengeApplication.class, args);
    }

}
