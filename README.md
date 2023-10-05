# TALLER 5: MODULARIZACIÓN CON VIRTUALIZACIÓN E INTRODUCCIÓN A DOCKER

### Demo del proyecto (por si no corre): https://youtu.be/2vu6u16xoNI 

En este taller se profundizarán los conceptos de modulación por medio de virtualización usando Docker.

### Prerrequisitos

- Java: Es un lenguaje de programación de propósito general orientado a objetos, portátil y muy versátil.
- Maven: Es una herramienta que maneja el ciclo de vida del programa.
- Git: Es un sistema de control de versiones distribuido (VCS).
- Docker: Es un proyecto de código abierto que automatiza el despliegue de aplicaciones dentro de contenedores de software.

### Instalación

1. Clonar el repositorio

```
https://github.com/jloading/Taller4AREP
```

2. Se construye el proyecto con Maven

```
mvn package
```

### Corriendo la aplicación

### * Usando Java:

Se corren los comandos
```
mvn clean package install
mvn clean install
```

Se corre el servidor con el comando
#### Para Mac:
```
java -cp "target/classes:target/dependency/*" org.example.SparkWebServer
```

#### Para Windows:
```
java -cp "target\classes:target\dependency\*" org.example.SparkWebServer

```

Para finalizar, se accede a la siguiente dirección desde el navegador

```
http://localhost:4567/operaciones
```

### * Usando Docker:
Ingrese el comando en su terminal

```
docker run -d -p 34000:6000 --name taller5arep jloading9/taller5arep
```

<img width="624" alt="Captura de pantalla 2023-09-27 a la(s) 10 09 48 p m" src="https://github.com/jloading/Taller5AREP/assets/65261708/aaa07c78-3710-4624-aa5f-fab1593fe276">

Posteriormente ingrese a la siguiente dirección

```
http://localhost:34000/operaciones
```
## Corriendo las pruebas

Al ingresar a la dirección http://localhost:4567/operaciones (si lo corrió con Java) o http://localhost:34000/operaciones (si lo corrió con Docker) podremos encontrar la aplicación

<img width="630" alt="Captura de pantalla 2023-09-27 a la(s) 10 21 51 p m" src="https://github.com/jloading/Taller5AREP/assets/65261708/7034c793-a7a8-4463-aad2-5a3a55015ef3">

Podemos ver que la aplicación resuelve las operaciones correctamente

<img width="589" alt="Captura de pantalla 2023-09-27 a la(s) 10 23 35 p m" src="https://github.com/jloading/Taller5AREP/assets/65261708/c6a32d4b-69d3-4d1f-8b01-aaa2cb7e2df9">

## Qué se hizo
### Java
Se creó la clase principal encargada de atender las peticiones que se hacen al servidor. Adicionalmente, implementa la lógica para efectuar las operaciones (seno, coseno, palíndromo, magnitud vector)

<img width="834" alt="Captura de pantalla 2023-09-27 a la(s) 10 26 08 p m" src="https://github.com/jloading/Taller5AREP/assets/65261708/6ce31266-18c4-4de6-836d-575e9f2749c9">

Se creó el cliente web encargado de proporcionar la interfaz para ingresar los valores (referirse a la clase para ver el código completo)

<img width="1032" alt="Captura de pantalla 2023-09-27 a la(s) 10 27 03 p m" src="https://github.com/jloading/Taller5AREP/assets/65261708/24d1a984-b5cd-4755-a038-a93f94e25d87">


### Docker
Se crea una imagen en Docker con el comando

```
docker build --tag taller5arep .
```

<img width="707" alt="Captura de pantalla 2023-09-27 a la(s) 9 40 39 p m" src="https://github.com/jloading/Taller5AREP/assets/65261708/7765f1bd-5c14-42ec-97cb-abe0d5af1913">

Posteriormente se crea un contenedor con el comando
```
docker run -d -p 34000:6000 --name taller5container taller5arep
```
<img width="542" alt="Captura de pantalla 2023-09-27 a la(s) 9 42 13 p m" src="https://github.com/jloading/Taller5AREP/assets/65261708/25c6bd35-a7ed-42ac-89c5-1162b229f80e">

Se crea una referencia a la imagen con el nombre del repositorio de Docker Hub al que será subida

```
docker tag taller5arep jloading9/taller5arep
```

<img width="423" alt="Captura de pantalla 2023-09-27 a la(s) 9 54 26 p m" src="https://github.com/jloading/Taller5AREP/assets/65261708/fd2db7dd-29df-4dae-94de-16de05f7cd5e">

Se autentica en Docker con el comando

```
docker login
```

<img width="385" alt="Captura de pantalla 2023-09-27 a la(s) 9 56 22 p m" src="https://github.com/jloading/Taller5AREP/assets/65261708/885f0903-1bd2-4a59-86e8-a6f116fce61b">

Se sube la imagen al repositorio con el comando
```
docker push jloading9/taller5arep:latest
```
<img width="638" alt="Captura de pantalla 2023-09-27 a la(s) 9 58 12 p m" src="https://github.com/jloading/Taller5AREP/assets/65261708/78ca5c37-59c7-4a86-b977-5249aadc26fa">




## Hecho con

* Java: Lenguaje de programación de propósito general con enfoque a el paradigma de orientado a objetos, y con un fuerte tipado de variables.
* Git: Es un sistema de control de versiones distribuido (VCS).
* Maven: Es una herramienta que estandariza la configuración del ciclo de vida del proyecto.
* HTML: Es un lenguaje de marcado que estructura una página web y su contenido.
* JavaScript: Lenguaje de programación que los desarrolladores utilizan para hacer paginas web dinamicas.
* Docker: Es un proyecto de código abierto que automatiza el despliegue de aplicaciones dentro de contenedores de software, proporcionando una capa adicional de abstracción y automatización de virtualización de aplicaciones en múltiples sistemas operativos.

## Autor

* **Juan Carlos Acosta**

