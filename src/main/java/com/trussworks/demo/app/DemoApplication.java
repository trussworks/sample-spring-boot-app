package com.trussworks.demo.app;

import com.trussworks.demo.app.answer.Answer;
import com.trussworks.demo.app.answer.AnswerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner initAnswers(AnswerRepository answerRepository) {
		return args -> {
			answerRepository.save(new Answer("I don't know"));
		};
	}
}
