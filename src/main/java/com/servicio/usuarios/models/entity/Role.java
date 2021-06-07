package com.servicio.usuarios.models.entity;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Role implements Serializable {

  private static final long serialVersionUID = -4018231016840943671L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, length = 30)
  private String nombre;

  // si es bidireccional la relacion, hay que poner el mappedBy
  @ManyToMany(fetch = FetchType.LAZY, mappedBy = "roles")
  private List<Usuario> usuarios;
}
