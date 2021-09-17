## Patron de diseno DECORATOR 

### Descripcion

Permite agregar funcionalidades a objetos colocando objetos dentro de objetos. <br>
De esta manera se evitan las limitaciones de la herencia que son:
- La herencia es estatica. No se puee cambiar la funcionalidad durante el tiempo de ejecucion.
- Solo puede tener una clase padre. <br>
Por ello, la _composicion_ de clases permite cambiar el comportamiento durante el tiempo de ejecucion.

### Aplicabilidad
- Cuando se quiera agregar una funcionalidad adicional a objetos durante el tiempo de ejecucion.
- Cuando no sea posible extender el comportamiento usando herencia.

### Pros
- Extender comportamiento de una clase sin usar una subclase.
- Agregar o eliminar responsabilidad durante el tiempo de ejecucion.
- Combinar varios comportamientos.
- Dividir una clase monolitica en varias variantes.

### Contras
- Dificil de eliminar un wrapper.
