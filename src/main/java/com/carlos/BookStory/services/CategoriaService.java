package com.carlos.bookstory.services;

import com.carlos.bookstory.domain.Categoria;
import com.carlos.bookstory.repositories.CategoriaRepository;
import com.carlos.bookstory.services.exceptions.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public Categoria findById( Integer id ) {
        Optional<Categoria> obj = categoriaRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! id:" + id +", Tipo" +
                Categoria.class.getName()));
    }
}
