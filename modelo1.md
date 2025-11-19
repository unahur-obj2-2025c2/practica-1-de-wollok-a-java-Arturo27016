# 🧪 Modelo de Parcial 1 – Sistema de Bebidas Artesanales 🍺☕

## 🧩 Parte 1 – Strategy + Composite

Un local de bebidas artesanales desea un sistema para determinar qué bebidas pueden ser ofrecidas a un cliente según sus preferencias.

### 🎯 Preferencias (Strategy)

Cada cliente posee una **estrategia de preferencia** para decidir si una bebida le gusta:

- 🍬 **Dulcero**: le gustan las bebidas con un nivel de azúcar **mayor o igual** a un cierto mínimo.
- 🌡️ **Calentito**: le gustan solo las bebidas calientes.
- 🟢 **Naturalista**: solo acepta bebidas **sin alcohol**.
- 🔀 **Mixto**: combina varios criterios. Le gusta la bebida **si todos** los criterios que combina la aceptan (Composite).

### 🧉 Bebida

Una bebida tiene:

- `nombre`
- `temperatura` (`"fría"` / `"caliente"`)
- `nivelDeAzucar` (0 a 100)
- `porcentajeAlcohol` (0 a 80)

### 🚫 Validaciones y Excepciones

- Si se crea una bebida con:
  - nivel de azúcar **negativo** o mayor a 100, o
  - porcentaje de alcohol **negativo**
  
  se debe lanzar una excepción de negocio con el mensaje:

> `"Bebida no válida"`

- El DNI del cliente debe ser **positivo**. Si se intenta crear un cliente con DNI menor o igual a 0, lanzar:

> `"Cliente no válido"`

### 👤 Cliente

El cliente conoce:

- su `dni` (no modificable)
- su `preferencia` (estrategia), que **sí puede cambiar**
- un **registro de bebidas probadas**

---

## ☕ Parte 2 – Observer

Cada vez que un cliente **prueba una bebida**, se genera una **notificación de degustación** que contiene:

- el cliente
- la bebida

Se pueden registrar **observadores**:

- 🏭 **Cafeterías** → registran solo degustaciones de bebidas **calientes**.
- 🍻 **Cervecerías** → registran solo degustaciones de bebidas con **porcentaje de alcohol mayor a 0**.

Cada observador almacena únicamente las degustaciones que le interesan.

---

## 🧪 Tests sugeridos

### Test 1 – Strategy / Composite

Nombre sugerido:

> `dadoUnClienteDulceroConMinimo10_leGustaUnaBebidaConAzucar20YNoLeGustaUnaConAzucar5`

**Qué debe probar:**

- Crear un cliente con criterio Dulcero (mínimo 10).
- Crear una bebida con azúcar 20 → el criterio debe indicar que **le gusta**.
- Crear otra bebida con azúcar 5 → el criterio debe indicar que **no le gusta**.

---

### Test 2 – Observer + Excepciones

Nombre sugerido:

> `dadaUnaCerveceriaYUnaCafeteria_alProbarBebidasSeRegistranSoloLasQueCorresponden`

**Qué debe probar:**

- Registrar una Cervecería y una Cafetería como observadores.
- Crear y probar:
  - una bebida **caliente y sin alcohol** → solo la Cafetería la registra.
  - una bebida **fría con alcohol** → solo la Cervecería la registra.
- Verificar las listas de cada observador.
- (Opcional) Intentar crear una bebida con azúcar negativa y comprobar que lanza `"Bebida no válida"`.