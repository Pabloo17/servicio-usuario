package com.servicio.usuarios;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import com.servicio.commons.models.entity.Role;
import com.servicio.commons.models.entity.Usuario;

// Esta clase es opcional, vale para que se muestren los ids, cuando hacemos peticiones get
@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

  @Override
  public void configureRepositoryRestConfiguration(
      RepositoryRestConfiguration config, CorsRegistry cors) {
    config.exposeIdsFor(Usuario.class, Role.class);
  }
}
