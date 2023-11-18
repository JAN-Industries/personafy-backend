package com.jan.personafy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

@SpringBootApplication
@EnableMongoRepositories
public class PersonafyApplication {

	public static void main(String[] args) {
		try (FileInputStream fis = new FileInputStream(".env")) {
			Properties properties = new Properties();
			properties.load(fis);
			properties.forEach((key, value) -> System.setProperty((String) key, (String) value));
		} catch (IOException e) {
			e.printStackTrace();
		}
		SpringApplication.run(PersonafyApplication.class, args);
	}


}
