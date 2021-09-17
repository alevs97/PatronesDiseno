## Patron de diseno FACTORY

### Descripcion

Proporciona una interfaz para crear objetos en una superclase, mientras permite a las subclases alterar el tipo de objetos que crearan.

### Aplicabilidad
- Se puede implementar cuando no se sabe los objetos con los cuales debe de funcionar el codigo.
- Separa el codigo de construccion, del producto.
- Ofrecer a los usuarios de un framework extender su uso.
- Ahorra recursos del sistema mediante la reutilizacion de objetos existentes en lugar de recosntrucion.

### Pros
- Evitar un acoplamiento fuerte entre el creador y los objetos creados.
- Ouedes mover el codigo de creacion de producto a un lugar del programa.
- Puede incorporar nuevos tipos de programas sin descomponer el codigo.

### Contras
- Incorporar multitudes de subclases a un problema.
