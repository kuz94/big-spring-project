package ru.kuzmin.spring.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"ru.kuzmin.spring"})
public class MainClass {
	public static void main(String[] args) {
		SpringApplication.run(MainClass.class, args);
	}
}