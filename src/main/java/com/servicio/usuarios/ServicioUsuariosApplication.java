package com.servicio.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

// ENtity scan necesario para que lea las entidades del servicio commons
@EntityScan({"com.servicio.commons.models.entity"})
@SpringBootApplication
public class ServicioUsuariosApplication {

  public static void main(String[] args) {
    SpringApplication.run(ServicioUsuariosApplication.class, args);
  }
}
