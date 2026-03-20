# 🚗 Simulación de Consumo de Combustible (Dos Etapas) ☕

Este programa calcula el consumo de combustible de un vehículo a lo largo de un trayecto dividido en dos etapas, aplicando coeficientes de consumo sobre el combustible restante en el depósito.

---

# 📌 Descripción

El usuario introduce introduce el número de litros del depósito.

* Estado Inicial: Se recibe la carga total de litros.
* Primera Etapa: Se consume la mitad ($1/2$) del depósito actual.
* Segunda Etapa: Se consume una cuarta parte ($25/100$) de lo que quedó tras la primera etapa.
* Resultado Final: Muestra el consumo detallado de cada tramo y los litros sobrantes.

---

# 📂 Estructura del proyecto

```text
Operaciones/
│
├── Operaciones.java
└── README.md
```

---

# 🛠️ Conceptos Técnicos Utilizados
* **Uso de final**: Se han definido constantes(final) para los coeficientes de consumo, lo que hace que el código sea más fácil de mantener y entender.

* **Operadores de Asignación Compuesta (-=)**: Se utiliza para restar el consumo del total actual de forma compacta.

* **Precisión con double**: Uso de números reales para permitir cálculos exactos de fracciones y porcentajes.


---

# ▶️ Compilar el programa

```bash
javac Operaciones.java
```

---

# ▶️ Ejecutar el programa

```bash
java Operaciones
```

---

# 🖥 Ejemplo de Salida

```
TRAYECTO EN DOS ETAPAS
----------------------
Introduzca la cantidad de litros que se introducen en el depósito del vehiculo: 
20

RESULTADO
----------
Litros consumidos primer recorrido: 10.0
Litros consumidos segundo recorrido: 2.5
Litros sobrantes: 7.5
```

---
# 🎯 Objetivo del ejercicio

* Operaciones matemáticas en Java y definición de constantes (final).
---
# 📚 Nota

* **Constantes**: Para valores fijos con final, se utiliza UPPER_SNAKE_CASE (ej: COEFICIENTE_CONSUMO1), que es el estándar en Java para identificar constantes rápidamente.