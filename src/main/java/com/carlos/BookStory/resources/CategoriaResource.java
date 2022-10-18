package com.carlos.bookstory.resources;

import com.carlos.bookstory.domain.Categoria;
import com.carlos.bookstory.dtos.CategoriaDto;
import com.carlos.bookstory.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResource {

  @Autowired
  private CategoriaService categoriaService;

  @GetMapping(value = "/{id}")
    public ResponseEntity<Categoria> findById( @PathVariable Integer id ){
    Categoria obj = categoriaService.findById(id);
    return ResponseEntity.ok().body(obj);

  }
  @GetMapping
  public ResponseEntity<List<CategoriaDto>>findAll(){
    List <Categoria> list = categoriaService.findAll();
    List<CategoriaDto>categoriaDtoList = list.stream().map(obj ->
            new CategoriaDto(obj)).collect(Collectors.toList());
  return ResponseEntity.ok().body(categoriaDtoList);
   }

}
