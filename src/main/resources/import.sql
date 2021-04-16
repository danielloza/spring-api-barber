INSERT INTO productos(nombre, precio, paquete, precio_pack) VALUES ('Corte de Pelo (Caballero)', 150,'Clásico: Corte de Pelo & Afeitado Clásico', 250)
INSERT INTO productos(nombre, precio, paquete, precio_pack) VALUES ('Corte de Pelo (Niño)', 100,'Naval: Corte de Pelo, Afeitado Clásico & Limpieza Facial', 350)
INSERT INTO productos(nombre, precio, paquete, precio_pack) VALUES ('Recorte Alineado: Barba & Bigote', 80,'Fresh: Corte de Pelo, Afeitado Clásico, Limpieza Facial & Depilación Ceja ', 450)
INSERT INTO productos(nombre, precio, paquete, precio_pack) VALUES ('Limpieza Facial', 80,'Premium: Corte de Pelo, Afeitado Clásico, Limpieza Facial, Depilación Ceja & Tinte', 550)

INSERT INTO usuarios (username, password, enabled) VALUES ('andres','$2a$10$C3Uln5uqnzx/GswADURJGOIdBqYrly9731fnwKDaUdBkt/M3qvtLq',true);
INSERT INTO usuarios (username, password, enabled) VALUES ('admin','$2a$10$RmdEsvEfhI7Rcm9f/uZXPebZVCcPC7ZXZwV51efAvMAp1rIaRAfPK',true);

INSERT INTO roles (nombre) VALUES ('ROLE_USER');
INSERT INTO roles (nombre) VALUES ('ROLE_ADMIN');

INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (1, 1);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 2);
INSERT INTO usuarios_roles (usuario_id, role_id) VALUES (2, 1);

