# Enum en Java ☕

Ejemplo práctico del uso de **enumeraciones (`enum`) en Java**.

Las enumeraciones permiten definir un conjunto fijo de constantes, facilitando la lectura del código y evitando errores al trabajar con valores predefinidos.

---

# 📌 Descripción

En este ejemplo se define una enumeración llamada `ProvinciaAndalucia` que contiene las ocho provincias de Andalucía.

Posteriormente, el programa asigna cada valor del `enum` a una variable y lo muestra por consola.

Este ejercicio sirve para entender cómo funcionan las enumeraciones y cómo se utilizan dentro de un programa Java.

---

# 📂 Estructura del proyecto

```text
Enum/
│
├── enumeracion.java
└── README.md
```

---

# 🧠 ¿Qué es un enum?

Un **`enum` (enumeración)** es un tipo de dato especial en Java que permite definir un conjunto fijo de constantes.

Se utiliza cuando un valor solo puede pertenecer a un conjunto concreto de opciones.

Ejemplos típicos:

* Días de la semana
* Estados de un pedido
* Tipos de usuario
* Provincias

---

# 💻 Declaración del enum

```java
public enum ProvinciaAndalucia {
    ALMERIA,
    CADIZ,
    CORDOBA,
    GRANADA,
    HUELVA,
    JAEN,
    MALAGA,
    SEVILLA
}
```

---

# ▶️ Compilar el programa

```bash
javac enumeracion.java
```

---

# ▶️ Ejecutar el programa

```bash
java enumeracion
```

---

# 🖥 Resultado esperado

```
Provincias de Andalucía
-----------------------
Provincia 1: ALMERIA
Provincia 2: CADIZ
Provincia 3: CORDOBA
Provincia 4: GRANADA
Provincia 5: HUELVA
Provincia 6: JAEN
Provincia 7: MALAGA
Provincia 8: SEVILLA
```

---

# ⚙️ Métodos útiles de enum en Java

Las enumeraciones en Java incluyen métodos muy útiles:

### Obtener todos los valores

```java
ProvinciaAndalucia[] provincias = ProvinciaAndalucia.values();
```

Permite recorrer todos los valores de la enumeración.

---

### Convertir texto a enum

```java
ProvinciaAndalucia provincia = ProvinciaAndalucia.valueOf("ALMERIA");
```

Convierte un `String` en un valor del `enum`.

---

# 🎯 Objetivo del ejercicio

* Comprender qué es un **enum en Java**
* Definir un conjunto de constantes
* Utilizar enumeraciones dentro de un programa
* Mostrar valores por consola

---

# 📚 Nota

El uso de `enum` mejora la **legibilidad y seguridad del código**, evitando el uso de valores arbitrarios o cadenas de texto para representar estados o categorías.
