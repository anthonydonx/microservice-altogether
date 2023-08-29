package com.company.bookservice;

import feign.Capability;
import feign.micrometer.MicrometerCapability;
import io.micrometer.core.instrument.MeterRegistry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.util.function.Consumer;
import java.util.function.Supplier;

@SpringBootApplication
//@EnableEurokaClient
@EnableFeignClients
@Slf4j
@EnableScheduling
public class BookServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceApplication.class, args);
	}

	@Bean
	public Capability capability(final MeterRegistry registry) {
		return new MicrometerCapability(registry);
	}
	@Bean
	public Consumer<MessageDto> bookConsumer() {
		return messageDto -> log.info("Received message: {}", messageDto);
	}

	@Bean
	public Supplier<MessageDto> bookSupplier() {
		return () -> new MessageDto("Hello from BookService");
	}
}
