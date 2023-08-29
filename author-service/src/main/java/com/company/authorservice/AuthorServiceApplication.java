package com.company.authorservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;

@SpringBootApplication
@EnableFeignClients // This annotation is used to enable the Feign client
@Slf4j
public class AuthorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthorServiceApplication.class, args);
	}
	@Bean
	public Consumer<MessageDto> onReceive() {
		return messageDto -> log.info("Received message: {}", messageDto);
	}
}
