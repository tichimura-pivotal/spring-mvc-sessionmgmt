package com.example.mysessionmgmttichimura;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@SpringBootApplication
@SpringBootApplication(
        exclude = {SecurityAutoConfiguration.class, 
                DataSourceAutoConfiguration.class})
public class MysessionmgmtTichimuraApplication {

	public static void main(String[] args) {
		SpringApplication.run(MysessionmgmtTichimuraApplication.class, args);
	}
}
