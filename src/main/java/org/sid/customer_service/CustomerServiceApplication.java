package org.sid.customer_service;

import org.sid.customer_service.entities.Customer;
import org.sid.customer_service.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CustomerServiceApplication.class, args);

	}
	@Bean
	CommandLineRunner start(CustomerRepository customerRepository) {
		return args -> {
			customerRepository.saveAll(List.of(
					Customer.builder().name("Momo").email("mohouali@gmail.com").build(),
					Customer.builder().name("hasan").email("hasan@gmail.com").build(),
					Customer.builder().name("iman").email("iman@gmail.com").build()
			));
			customerRepository.findAll().forEach(System.out::println);
		};
	}


}
