package com.carlos.bookstory;

import com.carlos.bookstory.domain.Categoria;
import com.carlos.bookstory.domain.Livro;
import com.carlos.bookstory.repositories.CategoriaRepository;
import com.carlos.bookstory.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;

@RestController
@SpringBootApplication
public class BookStoryApplication {


	public static void main(String[] args) {
		SpringApplication.run(BookStoryApplication.class, args);

	}

}
