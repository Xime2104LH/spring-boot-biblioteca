package com.proyectosXimena.biblioteca.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectosXimena.biblioteca.model.AuhtorModel;

public interface AuthorRepository extends JpaRepository<AuhtorModel, Long> {

  List<AuhtorModel> findAll();

}
