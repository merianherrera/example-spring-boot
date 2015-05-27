## Sinopsis del proyecto
Proyecto elaborado para el curso de Desarrollo de aplicaciones web utilizando software libre. Muestra un breve ejemplo de como estructurar un proyecto utilizando Spring-Boot & Maven.


## Pre-requisitos:
#### 1. JDK 1.7 o posterior
  **a. Instalar el JDK desde la terminal**<br />
          **- JDK** (Java Development Kit): conjunto de herramientas (programas y librerías) que permiten desarrollar (compilar, ejecutar, generar documentación, etc.) programas en lenguaje Java.
          
```
    sudo apt-get install openjdk-7-jdk
    apt-cache search jdk
```
Nota: **apt-cache** realiza una serie de operaciones sobre la cache (registro o
       lista) de paquetes de APT.  apt-cache no modifica el estado del sistema
       pero proporciona operaciones de busqueda y genera informacion
       interesante a partir de los metadatos del paquete.
<br />      
  **b. Configurar las variables de entorno**<br />
          **- JAVA_HOME:** El directorio de instalación de Java.<br />
          **- PATH:** Las rutas donde se encuentran los archivos ejecutables. Para definir la variable PATH, se necesita dar la ruta absoluta del directorio de instalación del jdk, y agregar la carpeta bin, que es donde se encuentran los ejecutables como javac y java.
```
   export JAVA_HOME=/usr/lib/jvm/java-7-openjdk
   export PATH=$PATH:/usr/lib/jvm/java-7-openjdk/bin
```
  **c. Comprobar la instalación de JDK**
```
    javac
```

#### 2. Maven 3.0
 * Instalar Maven desde la terminal
```
    sudo apt-get update
    sudo apt-get install maven
```

## Instalación
1. Clonar el repositorio.

```shell
git clone https://github.com/meryH/example-spring-boot.git
```
2. cd en example-spring-boot/initial
3. Correr el siguiente comando en la terminal
```shell
mvn spring-boot:run
```
## URLs Importantes
+ Sito web de Spring Boot: http://projects.spring.io/spring-boot/
+ Documentación de Spring Boot: http://docs.spring.io/spring-boot/docs/current-SNAPSHOT/reference/htmlsingle/
+ Sitio web de Apache Maven: http://maven.apache.org/download.cgi
+ Getting Started con Spring Boot: http://spring.io/guides/gs/spring-boot/
+ Descargar IntelliJ IDE: https://www.jetbrains.com/idea/download/

## Colaboradores
- Merian Herrera.
- Diego Arrieta.

II Cuatrimestre, 2015
