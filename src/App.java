

//builder 2 mas complejo

import PatronesCreacionales.Builder2Complejo.Usuario;

public class App {
    public static void main(String[] args) throws Exception {

       Usuario facu = Usuario.Make("facundo", "medina").setMedioContacto(true).setDireccion("mza 55 lote 11").setEmail("adsada").setTelefono("3232233223").setMetodoPago("Visa").setToken("edfdsfs").Build();
       Usuario giuli = Usuario.Make("giuliana", "rodriguez").Build();
       System.out.println(facu);
       System.out.println(giuli);
    }
}



//builder
// public class App {
//     public static void main(String[] args) throws Exception {

//        Usuario facu = Usuario.Make("facundo", "medina").setEmail("facutota@yahoo.com.ar").Build();
//        Usuario giuli = Usuario.Make("giuliana", "rodriguez").setDireccion("mza 55 lote 11").Build();
//        System.out.println(facu);
//        System.out.println(giuli);
//     }
// }



//singleton concurrente (HILOS) usando synchronized
// public class App {
//     public static void main(String[] args) throws Exception {

//         Thread t1 = new Thread(new Runnable() {
//             public void run() {
//                 ConexionDB conexion = ConexionDB.obtenerConexion();
//                 System.out.println(conexion.hashCode());
//             }
//         });
//         Thread t2 = new Thread(new Runnable() {
//             public void run() {
//                 ConexionDB conexion = ConexionDB.obtenerConexion();
//                 System.out.println(conexion.hashCode());
//             }
//         });

//         t1.start();
//         t2.start();
//     }
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
