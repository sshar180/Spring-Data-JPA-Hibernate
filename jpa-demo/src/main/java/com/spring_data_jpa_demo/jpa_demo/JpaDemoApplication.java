package com.spring_data_jpa_demo.jpa_demo;

import com.spring_data_jpa_demo.jpa_demo.entities.Author;
import com.spring_data_jpa_demo.jpa_demo.entities.Video;
import com.spring_data_jpa_demo.jpa_demo.repository.AuthorRepository;
import com.spring_data_jpa_demo.jpa_demo.repository.VideoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class JpaDemoApplication {

	public static void main(String[] args) {

		SpringApplication.run(JpaDemoApplication.class, args);

	}

	@Bean
	public CommandLineRunner commandLineRunner(AuthorRepository authorRepository,
		VideoRepository videoRepository
	) {
		return 	args -> {
//			Author author = new Author();
//			author.setFirstName("John");
//			author.setLastName("Doe");
//			author.setEmail("email@email.com");
//			author.setAge(25);
//			author.setCreatedAt(LocalDateTime.now());
//			author.setLastModifiedAt(LocalDateTime.now());

//			var author = new Author().builder()
//					.firstName("John")
//					.lastName("Doe")
//					.email("email@email.com")
//					.age(25)
//					.createdAt(LocalDateTime.now())
//					.build();

			var video = new Video().builder()
					.name("video")
					.length(5)
					.build();


//			authorRepository.save(author);
			videoRepository.save(video);
		};
	}

}
