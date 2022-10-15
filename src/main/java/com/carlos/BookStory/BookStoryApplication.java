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
public class BookStoryApplication implements CommandLineRunner {

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private LivroRepository livroRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookStoryApplication.class, args);

	}
	@Override
	public void run( String... args ) throws Exception {
		Categoria cat1 = new Categoria(null, "Informatica", "Livro");
		Livro li1 = new Livro(null, "Mais ixperto que Diado", "Napoleao Hill", "Expert",cat1);
		cat1.getLivro().addAll(Arrays.asList(li1));

		this.categoriaRepository.saveAll(Arrays.asList(cat1));
		this.livroRepository.saveAll(Arrays.asList(li1));


	}
}
