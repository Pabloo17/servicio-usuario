INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('andres','$2a$10$oi3RSfepSwG65/Q5.IPOgu8oTY7famwwhEGXD0Y/FzHwgg0XX44Ei',1, 'Andres', 'Guzman','profesor@bolsadeideas.com');
INSERT INTO `usuarios` (username, password, enabled, nombre, apellido, email) VALUES ('admin','$2a$10$oi3RSfepSwG65/Q5.IPOgu8oTY7famwwhEGXD0Y/FzHwgg0XX44Ei',1, 'John', 'Doe','jhon.doe@bolsadeideas.com');

INSERT INTO `roles` (nombre) VALUES ('ROLE_USER');
INSERT INTO `roles` (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO `usuarios_roles` (usuarios_id, roles_id) VALUES (1, 1);
INSERT INTO `usuarios_roles` (usuarios_id, roles_id) VALUES (2, 2);
INSERT INTO `usuarios_roles` (usuarios_id, roles_id) VALUES (2, 1);
