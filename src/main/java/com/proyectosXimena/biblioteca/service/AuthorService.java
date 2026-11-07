package com.proyectosXimena.biblioteca.service;

import java.util.List;

import com.proyectosXimena.biblioteca.model.AuhtorModel;
import com.proyectosXimena.biblioteca.repository.AuthorRepository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AuthorService {

  private final AuthorRepository authorRepository;

  public AuthorService(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  public List<AuhtorModel> getAllAuthors() {
    return authorRepository.findAll();
  }
}
