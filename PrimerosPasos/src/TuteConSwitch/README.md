# 🃏 Valor de Naipes en el Tute (Estructura Switch)

Este programa calcula el valor por puntos de una carta de la baraja española según las reglas del juego del Tute. Es un ejemplo excelente para demostrar el uso de la estructura de control switch y el manejo del tipo de dato byte.

---

# 📋 Funcionalidades

El programa asigna puntos a cada carta basándose en su número:

**As (1)**: 11 puntos.

**Tres (3)**: 10 puntos.

**Sota (10**): 2 puntos.

**Caballo (11)**: 3 puntos.

**Rey (12)**: 4 puntos.

**Otras (2, 4, 5, 6, 7)**: 0 puntos.

**Cualquier otro número**: Devuelve un error (-1).

---

# 📂 Estructura del proyecto

```text
TuteConSwitch/
│
├── tute.java
└── README.md
```

---

# ▶️ Compilar el programa

```bash
javac tute.java
```

---

# ▶️ Ejecutar el programa

```bash
java tute
```

---

# 🖥 Ejemplo de Salida

```
VALOR DE UN NAIPE EN EL TUTE
----------------------------
Introduzca número (1-7, 10-12): 6

RESULTADO
---------
El valor del naipe con ese número es: 0

```

---

# 🎯 Objetivo del ejercicio

* Estructuras Condicionales Anidadas: Uso de if, else if y else para tomar decisiones múltiples.

* Operadores Lógicos: Empleo de || (OR) para la validación de rangos.

* Banderas (Flags): Uso de la variable booleana anyoValido para controlar si se debe ejecutar el procesamiento o mostrar un error.

* Constantes de Configuración: Uso de final int para definir límites (ANYO_MINIMO, ANYO_MAXIMO), facilitando el mantenimiento del código.

---

# 🚦 Conceptos Técnicos: El condicional switch
A diferencia del if-else (que evalúa condiciones booleanas), el switch compara una variable contra una lista de valores posibles.

**1. El uso de case y break**
Cada case representa un valor posible. Es fundamental usar break para que el programa no "caiga" en el siguiente caso una vez encontrada la coincidencia.

**2. Agrupación de casos**
En este programa, se utiliza la agrupación de casos para las cartas que valen 0 puntos:

```
case 2:
case 4:
case 5:
case 6:
case 7:
    valorNaipe = VALOR_OTROS;
    break;
```
**3. El caso default**
Actúa como una red de seguridad. Si el usuario introduce un número que no está contemplado en los case anteriores, se ejecuta el bloque default.

---

# 💡 Comparativa: if-else vs switch

|  **Característica**     | **If-Else**                             | **switch**                            |
| :---------------------: | :-------------------------------------: | :-----------------------------------: |
| **Tipo de evaliación**  | Rangos y lógica compleja (<, >, &&)     | Valores exactos y discretos           |
|  **Legibilidad**        | Puede ser confuso con muchos niveles    | Muy limpio para listas de opciones    |
|  **Uso ideal**          | Validaciones (ej. años, textos)         | Menús, días, cartas, estados          |

---

# 🎯 Buenas Prácticas Aplicadas
**Optimización de Memoria**: Se ha elegido el tipo byte para las constantes y variables. Dado que los números de las cartas y sus valores son pequeños, el uso de byte consume menos memoria que un int.

**Uso de Constantes**: Definición de VALOR_AS, VALOR_REY, etc. Esto evita los "números mágicos" y hace que el código sea mucho más fácil de leer y mantener.

**Java es "Case Sensitive"**: Se respeta escrupulosamente la sensibilidad a mayúsculas/minúsculas de Java en todos los identificadores.

**Gestión de Recursos**: Cierre preventivo del objeto Scanner mediante teclado.close().