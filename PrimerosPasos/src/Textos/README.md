# 🔤 Análisis de Propiedades de Texto (Strings) ☕

Este programa solicita una cadena de texto al usuario y realiza un análisis técnico de su estructura, posición de caracteres y cumplimiento de ciertas reglas gramaticales mediante lógica booleana.

---

# 📋 Análisis Realizado
El sistema descompone el texto para verificar cuatro condiciones específicas:

**Longitud mínima**: ¿Tiene más de 5 caracteres?

**Inicio formal**: ¿Empieza con una letra mayúscula (Rango A-Z)?

**Cierre alfabético**: ¿Termina con una letra minúscula (Rango a-z)?

**Puntos suspensivos**: ¿Los últimos tres caracteres son puntos (.)?

---

# 📂 Estructura del proyecto

```text
Operaciones/
│
├── analisisTxt.java
└── README.md
```

---

# 🛠️ Conceptos Técnicos Utilizados
**Clase String**: Uso de métodos fundamentales como **.length()** para obtener el tamaño y **.nextLine()** para capturar frases completas (incluyendo espacios).

**Método .charAt(index)**: Acceso directo a caracteres específicos mediante su posición.

**Aritmética de Índices**: Cálculo de posiciones relativas al final de la cadena (ej: longitud - 3 para el antepenúltimo).

**Comparación de char**: Uso de valores ASCII/Unicode para determinar si un carácter está en un rango (ej: primerCaracter >= 'A').

---

# ▶️ Compilar el programa

```bash
javac analisisTxt.java
```

---

# ▶️ Ejecutar el programa

```bash
java analisisTxt
```

---

# 🖥 Ejemplo de Salida

```

ANÁLISIS DE UN TEXTO
--------------------
Introduce un texto: 
probando el programa como funciona...

RESULTADO
----------
El texto contiene más de cinco caracteres: true
El texto comienza con una letra mayúscula: false
El texto termina con una letra minúscula: false
El texto termina con unos puntos suspensivos (...): true

```
---

# 🛠️ Conceptos de Java Utilizados
Clase String: Uso de métodos fundamentales como .length() para obtener el tamaño y .nextLine() para capturar frases completas (incluyendo espacios).

Método .charAt(index): Acceso directo a caracteres específicos mediante su posición.

Aritmética de Índices: Cálculo de posiciones relativas al final de la cadena (ej: longitud - 3 para el antepenúltimo).

Comparación de char: Uso de valores ASCII/Unicode para determinar si un carácter está en un rango (ej: primerCaracter >= 'A').

# 🚀 Notas de Desarrollo (Buenas Prácticas)
**1. Java es "Case Sensitive"**
Recordamos que para Java, 'A' no es lo mismo que 'a'. Por eso, el programa utiliza comparaciones precisas para distinguir entre mayúsculas y minúsculas en el análisis.

**2. Robustez del Índice**
El código demuestra cómo navegar por un String de atrás hacia adelante usando la longitud total como referencia, una técnica esencial para evitar el error StringIndexOutOfBoundsException.

**3. Convención CamelCase**
Uso de nombres descriptivos y legibles como terminaPuntosSuspensivos o antepenultimoCaracter, siguiendo el estándar de la industria.

**4. Gestión del Scanner**
Uso de teclado.nextLine() para asegurar que se lee toda la línea de texto y cierre del recurso con teclado.close().
