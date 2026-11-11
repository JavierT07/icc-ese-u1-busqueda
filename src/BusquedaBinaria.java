import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import models.Persona;

public class BusquedaBinaria {

    private List<Persona> personas;
    
    
    public BusquedaBinaria(List<Persona> personas){
        this.personas = new ArrayList<>(personas);

    }
    public Integer findByName(String name){

        //Ordenado por el nombre
        personas.sort(Comparator.comparing(Persona::getName));


        // busqueda binaria
        //1.Definimos limites
        //
        int lo  = 0;
        int hi = personas.size() - 1;

        //Definimos buble
        while (lo <= hi) {

            int mid = (lo + hi)/2;
            
            // 4 preguntar si el mid es lo buscado
            if(personas.get(mid).getName().equals(name)){
                return mid;

            }

            //5 actualizar los limites
            //5.1 verificar si es mayor o menor y escoger un lado
            if(personas.get(mid).getName().compareTo(name) > 0){


                //5.2 Actuaizo el limite    xxxxx
                hi = mid  - 1;



            } else{
                //5.2 Actualiazo el limite  YYYYYY
                lo = mid + 1;
            }
             
        }
        return null;
    }


    public int findByAge( int age){

        int lo  = 0;
        int hi = personas.size() - 1;

           int mid = (lo + hi)/2;
           //Definimos buble
        while (lo <= hi) {
            
            // 4 preguntar si el mid es lo buscado
            if(personas.get(mid).getAge() == age){
                return mid;

            }

            //5 actualizar los limites
            //5.1 verificar si es mayor o menor y escoger un lado
            if(personas.get(mid).getAge() >age ){


                //5.2 Actuaizo el limite    xxxxx
                hi = mid  - 1;



            } else{
                //5.2 Actualiazo el limite  YYYYYY
                lo = mid + 1;
            }
             
        }
        return - 1;


        
        
    
        public intb find
        
    }

}


