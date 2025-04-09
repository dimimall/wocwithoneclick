package com.wocwithoneclick.wocwithoneclick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {
    com.azure.spring.cloud.autoconfigure.implementation.context.AzureTokenCredentialAutoConfiguration.class
  })
public class WocwithoneclickApplication {

	public static void main(String[] args) {
		SpringApplication.run(WocwithoneclickApplication.class, args);
	}

}
