package com.carlos.bookstory.repositories;

import com.carlos.bookstory.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface CategoriaRepository  extends JpaRepository<Categoria, Integer> {
}
