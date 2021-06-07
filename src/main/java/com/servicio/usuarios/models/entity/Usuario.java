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
import javax.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "usuarios")
public class Usuario implements Serializable {

  private static final long serialVersionUID = -1631894712067032768L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(unique = true, length = 20)
  private String username;

  @Column(length = 60)
  private String password;

  private boolean enabled = true;

  private String nombre;

  private String apellido;

  @Column(unique = true, length = 100)
  private String email;

  /*
     * opcional, para customizar la tabla intermedia
     *
    @JoinTable(
        name = "usuarios_to_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id"),
        uniqueConstraints = {@UniqueConstraint(columnNames = {"usuario_id", "role_id"})})
  */
  // Recomendado Lazy, por defecto es EAGER que quiere decir que lo trae todo a la hora de hacer
  // consultas
  @ManyToMany(fetch = FetchType.LAZY)
  private List<Role> roles;
}
