package com.proyectosXimena.biblioteca.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyectosXimena.biblioteca.model.AuhtorModel;
import com.proyectosXimena.biblioteca.service.AuthorService;

@RestController
@RequestMapping("/authors/v1/")
public class AuthorController {
  AuthorService authorService;
  public AuthorController(AuthorService authorService) {
    this.authorService = authorService;
  }

  @GetMapping("")
  public List<AuhtorModel> getAllAuthors() {
    //TO-DO: Implement the logic to retrieve all authors from the repository
    return authorService.getAllAuthors();
  }
}
