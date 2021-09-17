## Patron de diseno BUILDER

### Descripcion

Permite construir objetos complejos paso a paso. De esta manera se puede creaar distintos tipos y representaciones de objetos empleando el mismo codigo.<br>
Organiza la creacion de objetos en una serie de pasos. Puede que algunos pasos necesiten una implementacion diferente. <br>
Usar una serie de llamadas a los pasos del constructor que utiliza para crear un producto y ponerlo en una clase _Directora_. Esta clase es la que define los pasos de construccion. <br>
Los metodos concretos deben de proporcionar sus propios metodos para obtener resultados.

### Aplicabilidad
- Evita __constructrores telescopios__.
- Crear distintas representaciones de ciertos productos.

### Pros
- Construir objetos paso a paso.
- Reutilizar el mismo codigo de contruccion al contruir varias representaciones.
- Aislar codigo de construccion, con la logica del negocio.
