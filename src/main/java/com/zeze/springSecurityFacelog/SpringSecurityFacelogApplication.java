package com.zeze.springSecurityFacelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.oauth2.client.EnableOAuth2Sso;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class SpringSecurityFacelogApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityFacelogApplication.class, args);
	}

}
