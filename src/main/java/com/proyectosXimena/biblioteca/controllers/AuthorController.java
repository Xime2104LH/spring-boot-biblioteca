package com.proyectosXimena.biblioteca.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectosXimena.biblioteca.dto.RequestAuthorDTO;
import com.proyectosXimena.biblioteca.model.AuhtorModel;
import com.proyectosXimena.biblioteca.service.AuthorService;

@RestController
@RequestMapping("/api/v1/authors")
public class AuthorController {
  AuthorService authorService;
  public AuthorController(AuthorService authorService) {
    this.authorService = authorService;
  }

  @GetMapping("")
  public List<AuhtorModel> getAllAuthors() {
    return authorService.getAllAuthors();
  }

  @PostMapping("/create")
  public AuhtorModel createAuthor(@RequestBody RequestAuthorDTO author) {
    return authorService.createAuthor(author);
  }
}
