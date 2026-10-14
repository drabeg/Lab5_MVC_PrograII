# Laboratorio Práctico - Java MVC con Swing ☕

Este repositorio contiene la resolución de una guía de 10 ejercicios prácticos en Java para el curso de programación II en la Universidad Mariano Gálvez. El proyecto está desarrollado utilizando una arquitectura estricta de **Modelo-Vista-Controlador (MVC)** y diseño de interfaces gráficas de usuario (GUI) a través de **Java Swing**.

## 📌 Arquitectura y Buenas Prácticas Aplicadas

Para garantizar un código limpio, escalable y profesional, se implementaron los siguientes principios a lo largo de todo el proyecto:

* **Patrón MVC:** Separación total de responsabilidades.
  * **View:** Exclusiva para el diseño de interfaces (`JFrame`). Se modificaron las variables de los componentes a `public` para permitir el acceso desde el controlador.
  * **Model:** Clases Java puras enfocadas en la lógica de negocio (POO).
  * **Controller:** Clases que implementan `ActionListener` para gestionar los eventos e interactuar entre la Vista y el Modelo.
* **Optimización Lógica (POO):** Se redujo drásticamente el uso de estructuras condicionales (`if`/`else`) o bloques `switch` en los Modelos. En su lugar, se aplicaron operadores ternarios, evaluaciones booleanas directas y normalización matemática (reducción a unidades base).
* **Gestión de Ventanas:** Uso de la propiedad `DISPOSE_ON_CLOSE` en las ventanas secundarias para evitar el cierre de la aplicación al salir de un ejercicio, manteniendo el `JFrmMenu` principal siempre activo.

## 🚀 Ejercicios Resueltos

El sistema se compone de un Menú Principal desde el cual se puede acceder a las siguientes 10 aplicaciones:

1. **Entero Positivo:** Evaluación de números (Positivo, Negativo o Cero).
2. **Conversión:** Sistema de conversión de unidades.
3. **Secuencia de Collatz:** Generador de la conjetura matemática de Collatz.
4. **Moda Estadística:** Algoritmo para encontrar el número que más se repite en un conjunto de 5 valores.
5. **Interés Compuesto:** Calculadora financiera de retorno de inversión.
6. **Intermedio:** Ordenamiento de 3 números para determinar el Mayor, Intermedio y Menor.
7. **Conversiones de Tiempo:** Transformación entre horas, minutos y segundos (implementando inyección de datos estrictamente a través del constructor).
8. **Año Bisiesto:** Evaluación matemática de años bisiestos.
9. **Expresión Algebraica:** Calculadora para la expresión cuadrática $ax^2 + bx + c$.
10. **Pago a Trabajador:** Cálculo de honorarios basado en validación excluyente de jornadas laborales (Diurna, Vespertina, Nocturna) y pago por hora.

## 🛠️ Tecnologías y Herramientas

* **Lenguaje:** Java
* **Interfaz Gráfica:** Java Swing
* **Entorno de Desarrollo (IDE):** Apache NetBeans
* **Control de Versiones:** Git / GitHub

## ⚙️ Cómo ejecutar el proyecto

1. Clona este repositorio en tu máquina local:
   git clone [https://github.com/drabeg/Lab5_MVC_PrograII.git](https://github.com/drabeg/Lab5_MVC_PrograII.git)
2. Abre Apache NetBeans.
3. Ve a File > Open Project... y selecciona la carpeta del repositorio clonado.
4. Navega hasta el paquete View y ejecuta el archivo JFrmMenu.java (Clic derecho > Run File o Shift + F6) para iniciar la aplicación desde el menú principal.

---
**Autor:** Dario Rabe - 51902523683
