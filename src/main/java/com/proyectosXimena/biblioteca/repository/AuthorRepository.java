package com.proyectosXimena.biblioteca.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.proyectosXimena.biblioteca.dto.RequestAuthorDTO;
import com.proyectosXimena.biblioteca.model.AuhtorModel;

public interface AuthorRepository extends JpaRepository<AuhtorModel, Long> {

  AuhtorModel save(RequestAuthorDTO author);
}
