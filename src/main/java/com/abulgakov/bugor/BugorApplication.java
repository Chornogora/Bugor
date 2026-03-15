package com.abulgakov.bugor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class BugorApplication {

	public static void main(String[] args) {
		SpringApplication.run(BugorApplication.class, args);
	}

}
