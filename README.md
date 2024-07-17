# ForoApi

ForoApi es una API REST desarrollada en Java que permite la gestión de tópicos en un foro. Implementa operaciones CRUD completas y está diseñada siguiendo las mejores prácticas del modelo REST.
Funcionalidades

    Crear un nuevo tópico
    Mostrar todos los tópicos creados
    Mostrar un tópico específico
    Actualizar un tópico
    Eliminar un tópico

# Datos almacenados

Los datos de cada tópico se almacenan en una base de datos relacional e incluyen los siguientes campos:

    id: Identificador único del tópico
    título: Título del tópico
    mensaje: Contenido del tópico
    fecha de creación: Fecha en la que se creó el tópico
    status: Estado del tópico
    autor: Autor del tópico
    curso: Curso al que pertenece el tópico

## Características

    API REST: Rutas implementadas siguiendo las mejores prácticas del modelo REST.
    Validaciones: Validaciones realizadas según las reglas de negocio.
    Persistencia: Implementación de una base de datos relacional para la persistencia de la información.
    Seguridad: Servicio de autenticación/autorización para restringir el acceso a la información.

## Instalación
``` bash
    Clona el repositorio:

git clone [https://github.com/tuusuario/ForoApi.git](https://github.com/HackstrongerOff/Spring-Boot---Challenge-Foro-API)

Navega al directorio del proyecto:


cd ForoApi

Compila y ejecuta el proyecto:


    ./mvnw spring-boot:run
```

## Uso

``` bash

Crear un nuevo tópico

bash

POST /topicos

Cuerpo de la solicitud:

json

{
		"id": 1,
    "titulo":"Simplicidad interior",
    "mensaje":"Simplifica tu vida. No te vuelves espiritual, te encoges espiritualmente",
    "fecha_creacion" : "2024-07-16",
		"autor":"Alveiro Perez",
		"curso":"Tecnico de llantas"
}
```

### Mostrar todos los tópicos

``` bash
GET /topicos

Mostrar un tópico específico

GET /topicos/{id}
```

### Actualizar un tópico
``` bash
PUT /topicos/{id}

Cuerpo de la solicitud:

json

{
    "titulo":"Renovación espiritual",
    "mensaje":"El crecimiento espiritual implica renunciar a las historias de tu pasado para que el universo pueda escribir una nueva",
    "fecha_creacion" : "2024-07-16",
		"autor":"Naira Mojica",
		"curso":"Tecnico ne fuego"
}
```

### Eliminar un tópico

``` bash
DELETE /topicos/{id}
```

## Autenticación y Autorización
Para acceder a las rutas protegidas, es necesario autenticarse mediante un servicio de autenticación/autorización.

### Contribuciones
Las contribuciones son bienvenidas. Por favor, abre un issue para discutir los cambios que deseas realizar.
