// public class App {
//     public static void main(String[] args) throws Exception {

//        
//     }
// }

//Template method
public class App {
    public static void main(String[] args) throws Exception {

       
    }
}

//Stategy
// import PatronesDeComportamiento.Strategy.*;

// public class App {
//     public static void main(String[] args) throws Exception {

//         //Algoritmo de deposito y de retiro - Ejemplo Bancario
//         // generamos un contexto osea la clase transaccion y le ponemos el algoritmo a utilizar
//         //en este caso deposito

//         // si tenemos n cantidad de algoritmos debemos tener n cantidad de clases
//         Transaccion transaccion1 = new Transaccion(new Deposito());
//         System.out.println(transaccion1.ejecutarTransaccion(100, 20));

//         Transaccion transaccion2 = new Transaccion(new Retiro());
//         System.out.println(transaccion2.ejecutarTransaccion(100, 20));

       
//     }
// }

//State

// import PatronesDeComportamiento.State.*;

// public class App {
//     public static void main(String[] args) throws Exception {
        
//         Auto auto = new Auto();
       
//         auto.manejar();
//         auto.apagar();
//         auto.manejar();
//         /*
//          * Encendido
//          * En Movimiento
//          * Apagado
//          */
//     }
// }

//Observer
// import PatronesDeComportamiento.Observer.*;
// public class App {
//     public static void main(String[] args) throws Exception {

//         Producto aguacate = new Producto(10);

//         Usuario usuario1 = new Usuario();
//         Usuario usuario2 = new Usuario();
//         Usuario usuario3 = new Usuario();

//         //Notificamos a usuario1 y 2
//         aguacate.addObserver(usuario1);
//         aguacate.addObserver(usuario2);

//         aguacate.venta();
//     }
// }

//Memento
// import PatronesDeComportamiento.Memento.*;

// public class App {
//     public static void main(String[] args) throws Exception {

//         Usuario usuario = new Usuario("Cody", 6);

//         Usuario memento = usuario.getMemento(); //Nuestra copia

//         System.out.println(usuario.getNombre());
//         System.out.println(usuario.getEdad());

//         usuario.setNombre("Facu");
//         usuario.setEdad(20);

//         System.out.println(usuario.getNombre());
//         System.out.println(usuario.getEdad());

//         usuario.restartMemento(memento);
       
//         System.out.println(usuario.getNombre());
//         System.out.println(usuario.getEdad());
//     }
// }

//Mediator
// import PatronesDeComportamiento.Mediator.*;

// public class App {
//     public static void main(String[] args) throws Exception {

//         Usuario eduardo = new Usuario("Eduardo");
//         Usuario codi = new Usuario("codi");

//         SalaChat sala = new SalaChat();

//         sala.addParticipante(eduardo);
//         sala.addParticipante(codi);

//         sala.enviarMensaje(eduardo, codi, "Hola desde el curso Patrones de Diseño");
       

//     }
// }


//Iterator

// import PatronesDeComportamiento.Iterator.GuiaTelefonica;
// import PatronesDeComportamiento.Iterator.IIterador;
// import PatronesDeComportamiento.Iterator.IteradorGuia;

// public class App {
//     public static void main(String[] args) throws Exception {
//         GuiaTelefonica guia = new GuiaTelefonica();

//         guia.add("123");
//         guia.add("124");
//         guia.add("125");
//         guia.add("126");
//         guia.add("127");
//         guia.add("128");

//         //De esta forma iteramos la coleccion sin usar la clase que contiene la guia osea utilizamos
//         // una interfaz
//        IIterador iterador = new IteradorGuia(guia);

//        while(iterador.contieneSiguiente()){
//         System.out.println(iterador.siguiente());
//        }
//     }
// }

//Command
// import PatronesDeComportamiento.Command.ICommand;
// import PatronesDeComportamiento.Command.IDevice;
// import PatronesDeComportamiento.Command.OffDevice;
// import PatronesDeComportamiento.Command.OnDevice;
// import PatronesDeComportamiento.Command.TV;

// public class App {
//     public static void main(String[] args) throws Exception {
        
//         //TV tv = new TV();
//         //Aca usamos el principio Solid  de Lishkov
//         IDevice tv = new TV();

//         //Ahora vamos a crear un par de instancia
//        ICommand on = new OnDevice(tv);
//        ICommand off = new OffDevice(tv);

//        //Ahora un objeto ejecuta el metodo entonces el objeto esta encapsulado.
//        on.operacion();
//        off.operacion();
//     }
// }

//Chain of Responsability

// import PatronesDeComportamiento.ChainOfResponsability.Deposito;
// import PatronesDeComportamiento.ChainOfResponsability.IManejadorTransacciones;
// import PatronesDeComportamiento.ChainOfResponsability.ITransaccion;
// import PatronesDeComportamiento.ChainOfResponsability.Reembolso;
// import PatronesDeComportamiento.ChainOfResponsability.Retiro;
// import PatronesDeComportamiento.ChainOfResponsability.TipoTransaccion;
// import PatronesDeComportamiento.ChainOfResponsability.Transaccion;

// public class App {
//     public static void main(String[] args) throws Exception {

//         ITransaccion transaccion = new Transaccion(100, 200, TipoTransaccion.Cheques);
       
//         IManejadorTransacciones deposito = new Deposito();
//         IManejadorTransacciones retiro = new Retiro();
//         IManejadorTransacciones reembolso = new Reembolso();

//         //Aca ponemos adonde pasa cando no puede ereponder
//         deposito.setNextManejador(retiro);
//         retiro.setNextManejador(reembolso);

//         deposito.ejecutarTransaccion(transaccion);


//     }
// }

//Flyweight
//Ejemplo de un juego de nubes, existen 3 tipos de nubes

// import PatronesEstructurales.Flyweight.*;

// public class App {
//     public static void main(String[] args) throws Exception {

//         NubeFactory factory = new NubeFactory();

//         for(int x = 0; x < 100; x++){
//             Nube nube = factory.getNube(TipoNube.Chica);
//         }

//         for(int x = 0; x < 200; x++){
//             Nube nube = factory.getNube(TipoNube.Mediana);
//         }

//         for(int x = 0; x < 300; x++){
//             Nube nube = factory.getNube(TipoNube.Grande);
//         }
//        //con este print podemos observar que solo se generaron 3 objetos (uno chico, uno mediano y uno grande)
//         System.out.println(factory.countNubesMap());
//     }
// }


//Virtual Proxy
// import PatronesEstructurales.VirtualProxy.*;
// //En este ejemplo vemos los permisos CRUD para un Admin al entrar a una BD
// //Pero que pasa si queremos darle permisos solo de consulta a un usuario X
// //Ahi viene el patron proxy
// public class App {
//     public static void main(String[] args) throws Exception {
//         // IServicio servicio = new Servicio();
//         //Para hacer la restriccion en vez de new servicio hacemos new ProxyServicio

//         Usuario usuario = new Usuario(3);
//         IServicio servicio = new ProxyServicio(usuario);
        
//         //Si el cliente no hubiera ejecutado ninguno de estos metodos de aqui abajo el objeto nunca se hubiera
//         //Creado, se crea cuando es necesario.
//         servicio.leer();
//         servicio.escribir();      
//         servicio.actualizar();
//         servicio.eliminar();

       
//     }
// }

//Proxy
// import PatronesEstructurales.Proxy.*;
// //En este ejemplo vemos los permisos CRUD para un Admin al entrar a una BD
// //Pero que pasa si queremos darle permisos solo de consulta a un usuario X
// //Ahi viene el patron proxy
// public class App {
//     public static void main(String[] args) throws Exception {
//         // IServicio servicio = new Servicio();
//         //Para hacer la restriccion en vez de new servicio hacemos new ProxyServicio

//         Usuario usuario = new Usuario(3);
//         IServicio servicio = new ProxyServicio(new Servicio(),usuario);
        
//         servicio.leer();
//         servicio.escribir();      
//         servicio.actualizar();
//         servicio.eliminar();

       
//     }
// }


//Facade
// import PatronesEstructurales.Facade.Fachada;
// public class App {
//         public static void main(String[] args) throws Exception {
//             Fachada fachaCompu = new Fachada();
           
//             fachaCompu.encender();;
//         }
//     }

// Decorator
// import PatronesEstructurales.Decorator.*;

// public class App {
//     public static void main(String[] args) throws Exception {

//         IPizza pizzaPepperoni = new PizzaPepperoni();

//         System.out.println(pizzaPepperoni.descripcion());
//         System.out.println(pizzaPepperoni.precio());

//         IPizza pizzaNapolitana = new PizzaNapolitana();

//         System.out.println(pizzaNapolitana.descripcion());
//         System.out.println(pizzaNapolitana.precio());

//         // que pasa si la pizzeria quiere agregar queso extra a 2 usd las clases no
//         // tienen esa implementacion
//         IPizza pizzaPepperoniQuesoExtra = new QuesoExtra(new PizzaPepperoni());

//         System.out.println(pizzaPepperoniQuesoExtra.descripcion());
//         System.out.println(pizzaPepperoniQuesoExtra.precio());

//         // Orilla rellana de queso se agrega 4 usd y ademas queso extra
//         IPizza pizzaNapolitanaQuesoOrilla = new OrillaRellena(new QuesoExtra(new PizzaNapolitana()));

//         System.out.println(pizzaNapolitanaQuesoOrilla.descripcion());
//         System.out.println(pizzaNapolitanaQuesoOrilla.precio());
//     }
// }

// //Composite
// import PatronesEstructurales.Composite.Menu;
// public class App {
// public static void main(String[] args) throws Exception {
// Menu menu = new Menu();

// Menu menu2 = new Menu();
// Menu menu3 = new Menu();

// Menu menu4 = new Menu();
// Menu menu5 = new Menu();

// //con esto menu 3 tiene de hijos a menu 4 y 5 desplegando la lista.
// menu3.addMenu(menu4);
// menu3.addMenu(menu5);
// //menu es padra de menu2 y 3 y de 4 y 5 seria el abuelo je
// menu.addMenu(menu2);
// menu.addMenu(menu3);

// menu.open();
// menu.close();

// }
// }

// Adapter
// import PatronesEstructurales.Adapter.*;
// public class App {
// public static void main(String[] args) throws Exception {

// //con esto logramos adaptar una conexion Sql por una NoSql
// IConexionSql conexion = new AdaptadorDB( new ConexionMongoDB());

// conexion.conexion();

// String resultado = conexion.runQuery();
// System.out.println(resultado);
// // // IConexionSql conexion = new ConexionMySql(); //imaginemos que nuestro
// cliente usa mysql
// // //y ahora quiere usar mongoDB deberiamos sacar esto y poner esto de abajo
// // IConexionNoSql conexion = new ConexionMongoDB();

// // conexion.conexion();

// // // String resultado = conexion.runQuery();
// // String resultado = conexion.executeSentence();
// // System.out.println(resultado);

// }
// }

// prototype
// import PatronesCreacionales.Prototype.Enemigo;
// public class App {
// public static void main(String[] args) throws Exception {

// Enemigo enemigoBase = new Enemigo("imagen1.png",0 , 100 , 2);

// Enemigo enemigo1 = new Enemigo(enemigoBase);
// Enemigo enemigo2 = new Enemigo(enemigoBase);
// Enemigo enemigo3 = new Enemigo(enemigoBase);

// //cuando todos los enemigos son iguales y tiene la mismas vidas, tamaño o
// imagen
// //se usa prototype y podes cambiar la posicion por ejemplo
// enemigo1.setPosX(100);
// enemigo2.setPosX(150);
// enemigo3.setPosX(200);

// Enemigo enemigoBase2 = new Enemigo("imagen1.png", 0, 100, 2);

// Enemigo enemigo4 = enemigoBase2.clone();
// Enemigo enemigo5 = enemigoBase2.clone();
// Enemigo enemigo6 = enemigoBase2.clone();

// enemigo4.setPosX(300);
// enemigo5.setPosX(350);
// enemigo6.setPosX(400);

// }
// }

// builder 2 mas complejo

// import PatronesCreacionales.Builder2Complejo.Usuario;

// public class App {
// public static void main(String[] args) throws Exception {

// Usuario facu = Usuario.Make("facundo",
// "medina").setMedioContacto(true).setDireccion("mza 55 lote
// 11").setEmail("adsada").setTelefono("3232233223").setMetodoPago("Visa").setToken("edfdsfs").Build();
// Usuario giuli = Usuario.Make("giuliana", "rodriguez").Build();
// System.out.println(facu);
// System.out.println(giuli);
// }
// }

// builder
// public class App {
// public static void main(String[] args) throws Exception {

// Usuario facu = Usuario.Make("facundo",
// "medina").setEmail("facutota@yahoo.com.ar").Build();
// Usuario giuli = Usuario.Make("giuliana", "rodriguez").setDireccion("mza 55
// lote 11").Build();
// System.out.println(facu);
// System.out.println(giuli);
// }
// }

// singleton concurrente (HILOS) usando synchronized
// public class App {
// public static void main(String[] args) throws Exception {

// Thread t1 = new Thread(new Runnable() {
// public void run() {
// ConexionDB conexion = ConexionDB.obtenerConexion();
// System.out.println(conexion.hashCode());
// }
// });
// Thread t2 = new Thread(new Runnable() {
// public void run() {
// ConexionDB conexion = ConexionDB.obtenerConexion();
// System.out.println(conexion.hashCode());
// }
// });

// t1.start();
// t2.start();
// }
// }

// Singleton
// public class App {
// public static void main(String[] args) throws Exception {

// //ConexionDB conexion = new ConexionDB(); //por eso el error de q el
// consturctor no es visible
// ConexionDB conexion = ConexionDB.obtenerConexion();
// ConexionDB conexion2 = ConexionDB.obtenerConexion();
// ConexionDB conexion3 = ConexionDB.obtenerConexion();
// ConexionDB conexion4 = ConexionDB.obtenerConexion();

// //siempre pbtendremos el mismo hashcode
// System.out.println(conexion.hashCode());
// System.out.println(conexion2.hashCode());
// System.out.println(conexion3.hashCode());
// System.out.println(conexion4.hashCode());
// }
// }

// AbstractFactory
// public class App {
// public static void main(String[] args) throws Exception {
// AppleStore appleStore = new AppleStore();
// SamsungStore samsungStore = new SamsungStore();

// IComputadora mac = appleStore.crearComputadora();
// ITablet ipad = appleStore.crearTablet();

// IComputadora qx40 = samsungStore.crearComputadora();
// ITablet s20 = samsungStore.crearTablet();

// System.out.println(mac + " " + ipad + " " + qx40 + " " + s20);

// }
// }

// Facthory Method
// public class App {
// public static void main(String[] args) throws Exception {

// PizzeriaCF cf = new PizzeriaCF();

// Pizza pepperoni = cf.crearPizza("Pepperoni");
// Pizza napolitana = cf.crearPizza("Napolitana");
// Pizza orillaRellena = cf.crearPizza("Pepperoni orilla rellena");

// System.out.println(pepperoni);
// System.out.println(napolitana);
// System.out.println(orillaRellena);
// }

// }

// Simple Factory
// public class App {
// public static void main(String[] args) throws Exception {

// Pizzeria pizzeriaCF = new Pizzeria();

// Pizza pizzaPepperoni = pizzeriaCF.crearPizzaChica();

// //Esto esta mal implementado y no seria simpleFactory Pizza pizzaPepperoni =
// new Pizza(8);

// System.out.println(pizzaPepperoni);
// }

// }
