# Ejemplos Asignatura Desarrollo Backend I

### 1. Ejemplos arquitecturas Monolith vs Microservices (w/Docker)

Debes tener instalado:
* [Docker desktop](https://www.docker.com/products/docker-desktop/).
* [GIT](https://git-scm.com/).

Se consideran dos repositorios de ejemplo:

* [Arquitectura monolítica](https://github.com/dendrofen/docker-compose-wordpress-lamp): Ejemplo de instalación Wordpress (php, mariadb, phpmyadmin).
* [Arquitectura microservicios](https://github.com/AdityaThorat679/docker-frontend-backend-db-adi): Servicios backend, frontend (API) y base de datos (mongodb) como servicios independientes.

Modo de uso:

1. Clonar ambos proyectos en carpeta a gusto. Ej:
```bash
> git clone https://github.com/dendrofen/docker-compose-wordpress-lamp
```

2. En cada proyecto, desplegar contenedores con docker compose. Ej:
```bash
> cd docker-compose-wordpress-lamp
> docker compose up -d
```

3. Probar puntos de entrada de cada app. Por ejemplo, en arquitectura monolítica, es accesible a través de [http://localhost](http://localhost).

TIP: Para cada app, revisar archivo ```docker-compose.yml``` para ver el detalle de cada arquitectura.

### 2. Ejemplo simple Principio de Inversión de Dependencias en Spring Boot

Carpeta de proyecto: [Enlace](ejemplo-sc-dip/).