package dev.chiba.ReactiveApp;

import dev.chiba.ReactiveApp.model.Student;
import dev.chiba.ReactiveApp.service.StudentService;
import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ReactiveAppApplication {

	private final StudentService studentService;

	public static void main(String[] args) {
		SpringApplication.run(ReactiveAppApplication.class, args);
	}



}
