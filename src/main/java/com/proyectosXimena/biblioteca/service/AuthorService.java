package com.proyectosXimena.biblioteca.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.proyectosXimena.biblioteca.dto.RequestAuthorDTO;
import com.proyectosXimena.biblioteca.model.AuhtorModel;
import com.proyectosXimena.biblioteca.repository.AuthorRepository;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Service
public class AuthorService {

  private final AuthorRepository authorRepository;

  public AuthorService(AuthorRepository authorRepository) {
    this.authorRepository = authorRepository;
  }

  public List<AuhtorModel> getAllAuthors() {
    return authorRepository.findAll();
  }

  public AuhtorModel createAuthor(RequestAuthorDTO author) {
    AuhtorModel newAuthor = new AuhtorModel();
    newAuthor.setName(author.getName());
    newAuthor.setNationality(author.getNationality());
    newAuthor.setBirthDate(author.getBirthDate());
    return authorRepository.save(newAuthor);
  }

  public AuhtorModel getAuthorById(Long id) {
    return authorRepository.findById(id).orElse(null);
  }
}
