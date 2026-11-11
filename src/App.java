import java.util.List;
import models.Persona;


public class App {
    public static void main(String[] args) throws Exception {
        
        List<Persona> personas = List.of(
            new Persona("Juan", 25, "M"),
            new Persona("Maria", 30, "F"),
            new Persona("PedrO", 20, "M"),
            new Persona("Ana", 28, "F") );

        //si creamos con el list.of es inmutable es decirq ue no se puede ordenar no se pueden mover
   
        BusquedaBinaria busquedaBinaria = new BusquedaBinaria(personas);

        int resultado = busquedaBinaria.findByName("Ana");
        if(resultado >= 0){

            System.out.println("Se encontro  el la pos: " + resultado);
        }else {
            System.out.println("No se encontro:");
        }

        int resultado2 = busquedaBinaria.findByName("Pedro");

        //Operador alternario
        //cond ? accion True : accion FALSE
        System.out.println(resultado2 >= 0 ? "Se encontro en la posicion= " + resultado2
                            : "No se encontro nada:");
        

    public int findByAge( int age){


            BusquedaBinaria busquedaBinaria = new BusquedaBinaria(personas);
            int resultado2 = busquedaBinaria.findByAge( 20);
            return resultado2;
        






        Persona pBuscar = new Persona("Maria");
        int resultado3 



     /**
     * 1. BUSQUE UNAS PERSONA CON NOMBRE " MARIA "
     * RETORNE LA PERSONA SI LO ENCONTRO
     * 2. BUSQUE UNA PERSONA CONO NOMBRE "DIEGO"
     * RETORNE LA PERSONA SI LO ENCONTRO
     * 3. BUSQUE UNA PERSONA CON NOMBRE "ANA"
     * IMPRIMA LA POSICION DE LA PERSONA SI LO ENCONTRO
     * 
     * 
     * 
     */
    }
}