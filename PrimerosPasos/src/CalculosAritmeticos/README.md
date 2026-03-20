
# Cálculos Aritméticos en Java ☕

Ejemplo práctico del uso de **cálculos matemáticos** específicos a partir de dos números reales introducidos por el usuario. Es un ejercicio ideal para practicar la jerarquía de operaciones y la interacción con el usuario a través de la consola.

---

# 📌 Descripción

El usuario introduce dos números (numero1 y numero2) y el sistema procesa automáticamente las siguientes fórmulas:

* El triple del primero: $3 \cdot numero1$
* La décima parte del segundo: $numero2 / 10$
* El cuadrado del doble del producto: $(2 \cdot numero1 \cdot numero2)^2$
* La mitad del cuadrado de la suma: $(numero1 + numero2)^2 / 2$

---

# 📂 Estructura del proyecto

```text
CalculosAritmeticos/
│
├── calculos.java
└── README.md
```

---

# 🛠️ Conceptos Técnicos Utilizados
* **Entrada de datos**: Uso de java.util.Scanner para leer tipos double.

* **Variables Reales**: Uso del tipo de dato double para permitir cálculos con decimales de alta precisión.

* **Lógica de Proceso**: Separación clara entre la entrada de datos, el procesamiento matemático y la salida de resultados.


---

# ▶️ Compilar el programa

```bash
javac calculos.java
```

---

# ▶️ Ejecutar el programa

```bash
java calculos
```

---

# 🖥 Ejemplo de Salida

```
CÁLCULOS ARITMÉTICOS
--------------------
Introduzca dos números reales: 
Primer números: 
1
Segundo números: 
2

RESULTADO
---------
Triple del primer números: 3.0
Décima parte del segundo números: 0.2
Cuadrado del doble del producto de ambos números: 16.0
Mitad del cuadrado de la suma de ambos números: 4.5
```

---
# 🎯 Objetivo del ejercicio

* Operaciones matemáticas en Java
---
# 📚 Nota

**1. Convención de Nombres (CamelCase)**
Se ha utilizado la convención lowerCamelCase para la declaración de variables.

**¿Qué es?** Consiste en escribir palabras compuestas donde la primera letra es minúscula y la primera letra de cada palabra sucesiva es mayúscula (ej: triplePrimero, cuadradoDobleProducto).

**Beneficio**: Mejora la legibilidad del código y sigue el estándar oficial de la comunidad Java.

**2. Gestión de Entrada con Scanner**
Para la lectura de datos desde el teclado, se ha empleado la clase java.util.Scanner.

**Funcionamiento**: El objeto teclado se vincula al flujo de entrada del sistema (System.in), permitiendo capturar números reales mediante el método .nextDouble().

**Configuración Regional**: Es importante recordar que, dependiendo del idioma del sistema operativo, el separador decimal puede ser el punto . o la coma ,.

**3. Cierre de Recursos (Stream Closing)**
Como buena práctica de gestión de memoria y recursos del sistema, es fundamental cerrar el objeto Scanner una vez que ya no se necesita más entrada de datos.

Implementación: Se recomienda añadir teclado.close(); al final del método main. Esto libera el "flujo" (stream) de datos y evita posibles fugas de memoria (memory leaks).
