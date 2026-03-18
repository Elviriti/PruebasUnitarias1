# 🧪 Java Unit Testing: Validador de Registro

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![JUnit 5](https://img.shields.io/badge/JUnit5-25A162?style=for-the-badge&logo=junit5&logoColor=white)

Este repositorio contiene una práctica de **Testing Unitario** para un sistema de registro académico. Se ha utilizado **JUnit 5** para validar las reglas de negocio de una aplicación desarrollada en Java.

## 📋 Descripción del Proyecto

El objetivo es asegurar que la clase `ValidadorRegistro` procese correctamente los datos de entrada, bloqueando información errónea y permitiendo registros válidos según los requisitos del instituto.

## 🛠️ Reglas de Validación
| Campo | Regla de Validación |
| :--- | :--- |
| **Nombre** | No puede estar vacío (`""`). |
| **Contraseña** | Mínimo **8 caracteres**. |
| **Email** | Debe contener el carácter `@`. |
| **Edad** | Edad mínima permitida: **16 años**. |

---

## 🚀 Los 5 Retos de Testing

En la clase `ValidadorRegistroTest.java` se implementaron los siguientes casos de prueba:

1.  **Nombre Vacío:** Verifica que el sistema devuelva `false` ante un String vacío.
2.  **Password Justa:** Valida que 8 caracteres (límite exacto) devuelvan `true`.
3.  **Password Corta:** Asegura que una clave de 5 caracteres sea rechazada (`false`).
4.  **Email sin Arroba:** Comprueba que correos mal formados no pasen la validación.
5.  **Edad Límite:** Confirma que los usuarios de exactamente 16 años puedan registrarse.

---

## 🔧 Configuración y Ejecución

### 1. Requisitos
* JDK 11 o superior.
* Maven (opcional).

### 2. Instalación de Dependencias (pom.xml)
Si utilizas Maven, añade estas dependencias para habilitar JUnit 5:

```xml
<dependency>
    <groupId>org.junit.jupiter</groupId>
    <artifactId>junit-jupiter-all</artifactId>
    <version>5.10.0</version>
    <scope>test</scope>
</dependency>
