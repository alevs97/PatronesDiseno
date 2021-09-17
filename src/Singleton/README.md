## Patron de diseno SINGLETON

### Descripcion

Una clase solo tenga una unica instancia, punto de acceso global.<br>
Garantiza que una clase solo tenga una unica instancia.<br>
Proporciona un punto de acceso global a dicha instancia. <br>

### Aplicabilidad
- Cuando una clase tan solo debe de una instancia disponible.
- Control de las variables globales.

### Pros
- Certeza de una instancia.
- Punto global de acceso.
- Se inicializa una vez.

### Contras
- Vulnera el _principio de responsalibilidad unica_.
- Tratamiento especial con hilos.
