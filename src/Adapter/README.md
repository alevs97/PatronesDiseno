## Patron de diseno ADAPTER

### Descripsion

Permite una comunicacion entre interfaces incompatibles. Ayuda a:
- El adapter permite obtener una interfaz compatible con objetos incompatible a simple vista.
- El programa cliente puede invocar con seguridad los metodos del adapter.
- Convierte la informacion.

La clase adaptadora hereda interfaces al mismot tiempo.

### Aplicabilidad
- Usar una clase ya existente, pero cuya interfaz no es compatible con el resto del codigo.
- Reutiliza varias subclases que carezcan de alguna funcionalidad comun que no pueda agregarse a la superclase.

### Pros
- Separa la interfaz y el codigo conversion de la logica de la aplicacion.
- Nuevo tipo de adaptadores al programa sin descomponer el codigo.
### Contras
- La complejidad del codigo aumenta
