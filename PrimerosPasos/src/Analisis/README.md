# Análisis Lógico de un Número ☕

Este programa solicita un número entero al usuario y realiza una serie de comprobaciones lógicas mediante expresiones booleanas. Es un ejercicio clave para entender cómo Java evalúa condiciones y devuelve valores de verdadero (true) o falso (false).

---

# 📌 Descripción

El usuario introduce un número y el sistema procesa automáticamente las siguientes fórmulas:

* Diferencia de cero: Comprueba si el número es distinto de 0.
* Signo: Determina si el número es negativo ($numero < 0$).
* Rango: Verifica si el número se encuentra en el intervalo cerrado $[0, 10]$.
* Criterio Múltiple: Evalúa si el número es, simultáneamente, múltiplo de 3, positivo y menor que 20.

---

# 📂 Estructura del proyecto

```text
Analisis/
│
├── analisis.java
└── README.md
```

---

# ▶️ Compilar el programa

```bash
javac analisis.java
```

---

# ▶️ Ejecutar el programa

```bash
java analisis
```

---

# 🖥 Ejemplo de Salida

```
ANÁLISIS DE UN NÚMERO
---------------------
Introduzca un número entero: 
5

RESULTADO
----------
El número es distinto de cero: true
El número es negativo: false
El número está entre 0 y 10 (ambos incluidos): true
El número es múltiplo de 3, positivo y menor que 20: false
```

---

# 🎯 Objetivo del ejercicio

* Comprender qué es un **booleano en Java**

---

# 📚 Nota

Este proyecto sigue estándares de calidad importantes en el desarrollo con Java:

**1. Java es "Case Sensitive"**
Es fundamental recordar que Java es sensible a las mayúsculas y minúsculas.

No es lo mismo numero que Numero o NUMERO.

Las palabras reservadas (como public, class, void) deben escribirse exactamente como indica el lenguaje para evitar errores de compilación.

**2. Convención CamelCase**
Se ha aplicado la convención lowerCamelCase para las variables (ej: esDistintoCero, estaEntre0y10), lo que facilita la lectura de nombres compuestos.

**3. Gestión del Scanner**
Se utiliza java.util.Scanner para la interacción con el usuario.

**Cierre de Recurso**: Al final del programa se ejecuta teclado.close(), liberando el flujo de entrada y siguiendo las recomendaciones de gestión de recursos de Java.
