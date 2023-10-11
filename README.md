# ParcialAPIRestConPaginacion


<p align="center">
    <img
    src="https://media.tenor.com/bKMOJdUzX_gAAAAC/dog-finlin-dog.gif"
    alt="fullstackdeveloper"
    width="300px"
    height="300px"
    align="center"
/>
</p>

# Autor:
Matías Alejandro Mesa
Legajo 47841
Comisión 3K9 2023 - UTN FRM

# Actividades:
Realizar las siguientes actividades correspondientes al estudio del modelo de Biblioteca expresado en los videos de Colmena Tec

1-Crear el Modelo de Diagrama de Clase que se muestra en el video:

- Capturar la pantalla del diagrama y pegarla en un documento word. El nombre del archivo será apellidoLegajoDia.doc

2- Estudiar la siguiente Playlist:

https://www.youtube.com/watch?v=rmCvCOBAqEA&list=PLRFOqDrY-6nueU8NwtjRIcX5-nsD6jkru&ab_channel=ColmenaTEC

Desde el video :

API REST con Spring Boot 1 Introducción HASTA el video  API REST con Spring Boot 12 Probando la API con Postman

a-  No considerar la sección de auditoría de Enver.

b- Refactorice el código  de los videos para utilizar una base de datos H2.

c- Coloque las dependencias correspondientes de Swagger como dependencia en el buil.gradle:


// https://mvnrepository.com/artifact/org.springdoc/springdoc-openapi-starter-webmvc-ui
implementation group: 'org.springdoc', name: 'springdoc-openapi-starter-webmvc-ui', version:'2.1.0'

d- Crearse una cuenta en Render



f- Incorporar en el archivo de build.gradle:


jar {
   manifest {
      attributes 'RestfakeApplication': 'com.facu.restfake.RestfakeApplication' // Reemplaza 'tu.paquete.MainClass' con la clase principal de tu aplicación
   }
}



OJO ACA: 'RestfakeApplication' ES EL NOMBRE DE TU MAIN Y com.facu.restfake.RestfakeApplication' PONELE EL NOMBRE DE TU PAQUETE!


- Ejecute el comando gradle build  desde la terminal para crear el jar correspondiente.
Se creará en el proyecto una carpeta:
build/libs/restfake-0.0.1-SNAPSHOT.jar
e-  Utilizar el Archivo Dockerfile que se propone en el github y actualizar el nombre de tu jar:
FROM openjdk:17-alpine
EXPOSE 9000
COPY --from=build ./build/libs/elnombredetujar-0.0.1-SNAPSHOT.jar ./app.jar

f - Descargar el proyecto MODELO AUXILIAR  a analizar desde el Link de Github:

https://github.com/cortezalberto/claseFakeGenerico


--------------------------------------------------------------
# Entrega del miercoles 11/10:
Realizar el estudio completo e implementación correspondiente de TODA a la playList:

Api rest

https://www.youtube.com/watch?v=rmCvCOBAqEA&list=PLRFOqDrY-6nueU8NwtjRIcX5-nsD6jkru&index=1&ab_channel=ColmenaTEC

Implementar todas las queries  y pruebas de la api.

Realizar el deploy en git y Render.

Publicar en la actividad del aula virtual el repositorio del código en git Hub , el link de render funcionando y además los códigos de pruebas para probar toda la api desde Postman.


# Deploy
https://apirestconpaginacion-9kly.onrender.com
