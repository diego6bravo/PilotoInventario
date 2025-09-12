# PROYECTO TRANSVERSAL / FASE I  
**Gestión de Inventarios (Java)**  

---

## Integrantes y roles
- **DAVID SANTIAGO VELASCO DÍAZ**: Integración, Documentación, Implementación, Pruebas  
- **DIEGO GARCÍA BRAVO**: Integración, Documentación, Implementación, Pruebas  

**Instructor**: LUIS EDUARDO BAQUERO  

**Universidad Piloto de Colombia - 2025**  

---

## Tabla de Contenido
1. [Definición del problema](#definición-del-problema)  
2. [Selección de patrones creacionales (y justificación)](#selección-de-patrones-creacionales-y-justificación)  
3. [Planificación del proyecto (cronograma)](#planificación-del-proyecto-cronograma)  
4. [Análisis de requisitos](#análisis-de-requisitos-funcionales-y-no-funcionales)  
5. [Diseño técnico y documentación de clases](#diseño-técnico-y-documentación-de-clases)  
6. [Enlace código de implementación](#enlace-código-de-implementación)  

---

## Definición del problema
Una pequeña empresa necesita gestionar su inventario. Debe permitir:  
- Crear categorías de productos (Electrónica, Ropa, Alimentos, …).  
- Para cada categoría, definir propiedades generales (nombre, descripción) y atributos específicos (ejemplo: Electrónica → Garantía, Voltaje; Ropa → Talla, Material).  
- Crear productos dentro de las categorías y proporcionar nombre, precio, cantidad y atributos según la categoría.  
- Clonar productos existentes para agilizar la creación.  
- Consultar el stock actual y registrar operaciones de entrada/salida de inventario.  

---

## Selección de patrones creacionales (y justificación)
1. **Abstract Factory (5 clases)**: Para encapsular familias de atributos por categoría y producir objetos relacionados de forma coherente.  
   - *Justificación*: permite crear atributos específicos según la categoría sin acoplar el código cliente a clases concretas.  

2. **Builder (4 clases)**: Para construir objetos Product complejos paso a paso y permitir distintas configuraciones.  
   - *Justificación*: varios atributos opcionales y diferentes combinaciones por categoría hacen que el patrón Builder mejore legibilidad y mantenibilidad.  

3. **Factory Method (3 clases)**: Para delegar la creación de productos concretos a subclases/creadores.  
   - *Justificación*: simplifica la creación de distintos tipos de Product sin exponer la lógica de instanciación.  

4. **Prototype (3 clases)**: Para clonar productos existentes rápidamente.  
   - *Justificación*: clonar un producto agiliza la creación de nuevos productos similares.  

5. **Singleton (1 clase)**: `InventoryManager` como punto único para gestionar operaciones y estado del inventario.  
   - *Justificación*: hay un único inventario global en la aplicación; Singleton garantiza una sola instancia central.  

---

## Planificación del proyecto (cronograma)
- **Semana 1**: Definición del problema, selección de patrones.  
- **Semana 2**: Implementación clases `Product`, `Category`, `Atributos`.  
- **Semana 3**: Implementación Builder, Factory Method y Prototype.  
- **Semana 4**: Implementación Singleton (`InventoryManager`), pruebas unitarias e integración.  
- **Semana 5**: Documentación final, preparación del repositorio GitHub.  

---

## Análisis de requisitos (funcionales y no funcionales)

### Requisitos funcionales
1. Registrar categorías con nombre, descripción y atributos específicos.  
2. Crear productos dentro de una categoría con nombre, precio, cantidad y atributos.  
3. Clonar productos existentes.  
4. Consultar inventario (lista de productos con stock actual).  
5. Actualizar inventario (añadir/restar unidades).  
6. Mantener un repositorio GitHub con código y documentación.  

### Requisitos no funcionales
- Código en Java.  
- Repositorio privado con acceso del docente.  
- Entregar PDF con documentación del proyecto.  

---

## Diseño técnico y documentación de clases
La aplicación en Java ilustra cada patrón creacional y permite cumplir los requisitos.  

**Estructura propuesta del proyecto (`PilotoInventario`):**
