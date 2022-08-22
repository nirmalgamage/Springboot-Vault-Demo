package com.example.vaultexp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class VaultexpApplication {

	private static Logger logger  = LoggerFactory.getLogger(VaultexpApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(VaultexpApplication.class, args);
		VaultConfig vaultConfiguration = context.getBean(VaultConfig.class);
		logger.info("API KEY : "+vaultConfiguration.getAPI_KEY());
	}
}
