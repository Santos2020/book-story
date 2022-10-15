package com.carlos.bookstory.services;

import com.carlos.bookstory.domain.Categoria;
import com.carlos.bookstory.domain.Livro;
import com.carlos.bookstory.repositories.CategoriaRepository;
import com.carlos.bookstory.repositories.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private CategoriaRepository categoriaRepository;
    @Autowired
    private LivroRepository livroRepository;

    public void instanciaBaseDados(){
        Categoria cat1 = new Categoria(null, "Informatica", "Livro");
        Categoria cat2 = new Categoria(null, "Mesa", "Cadeira");
        Categoria cat3 = new Categoria(null, "Lapis ", "Borracha");

        Livro li1 = new Livro(null, "Mais ixperto que Diado", "Napoleao Hill", "Expert",cat1);
        Livro li2 = new Livro(null, "Jose Livro", "Ze Mane", "Livrinho",cat2);
        Livro li3 = new Livro(null, " Livro", " Mane", "TI",cat2);
        Livro li4 = new Livro(null, "Veja", "Puts", "Sei la ",cat2);

        cat1.getLivro().addAll(Arrays.asList(li1, li2));
        cat2.getLivro().addAll(Arrays.asList(li2,li3, li4));

        this.categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
        this.livroRepository.saveAll(Arrays.asList(li1, li2,li3,li4));


    }
}
