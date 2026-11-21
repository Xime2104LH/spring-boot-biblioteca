package com.proyectosXimena.biblioteca.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RequestAuthorDTO {

  @NotEmpty(message="El nombre del autor no puede estar vacío")
  @Size(min=5, max=150, message="El nombre del autor debe tener entre 5 y 150 caracteres")
  private String name;
  @NotEmpty (message="La nacionalidad del autor no puede estar vacía")
  @Size(min=5, max=100, message="La nacionalidad del autor debe tener entre 5 y 100 caracteres")
  private String nationality;
  @NotEmpty(message="La fecha de nacimiento del autor no puede estar vacía")
  @Past(message = "La fecha de nacimiento debe ser en el pasado")
  private LocalDate birthDate;
}
