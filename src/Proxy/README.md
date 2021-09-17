## Patron de diseno PROXY

### Descripcion

Proporciona un sustituto para objeto. Controla el acceso al objeto original. Permitiendo hacer algo antes o despues a un objeto original. <br>
El patron proxy sugiere que crees una clase nueva con la misma interfaz que el objeto del servicio.

### Aplicabilidad
- Inicializacion diferida.
- Control de acceso.
- Ejecucion de servicios remoto.
- Solicitudes de registro.
- Resutlados de solicitudes en cache.
- Referencia inteligente.

### Pros
- Puedes controlar el objeto de servicio sin que los clientes lo sepan.
- Control del ciclo de vida del objeto de servicio.
- Proxy funciona aun si el objeto no esta listo.
- Introducir nuevos proxies sin cambiar el servicio.

### Contras
- Condigo puede complicarse.
- Respuesta al servidor puede retrasarse.
