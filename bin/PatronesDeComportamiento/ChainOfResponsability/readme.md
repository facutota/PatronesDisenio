Cadena de responsabilidad
Este patron nos permite establecer una cadena de objetos receptores a traves de los cuales se pasa una peticion formulada por un obketo emisor. Es decir un objeto nos va a enviar una peticion y el otro objeto debe ser capaz de responder esa peticion.
Por ejemplo un cliente manda una peticion al objeto nro 1 si ese no puede delegara el objeto nro 2 y sino puede responder se le delegara al objeto 3 y asi sucesivamente hasta que algun objeto pueda responder de forma satisfactoria.

Como puede haber 100 objetos y puede q nunca llegue al ultimo se podria implementar el Patron Virtual Proxy para q no se creen objetos que no se van a utilizar.
