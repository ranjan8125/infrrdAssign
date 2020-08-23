package com.basic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

import com.basic.model.FileStorageProperties;

@SpringBootApplication
@EnableConfigurationProperties({
    FileStorageProperties.class
})
public class InfrrdAssignmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(InfrrdAssignmentApplication.class, args);
	}

}
