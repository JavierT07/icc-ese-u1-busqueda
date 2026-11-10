import java.util.List;

import models.Persona;

public class BusquedaLineal {
    private List<Persona> personas;

    public BusquedaLineal(List<Persona> personas){
        this.personas = personas;

    }

    //Busque una persona
    //Retornoe la persona si lo encuentra
    //Retorne --null-- si no lo encuentra

    public Persona findByName(String name){
        for(int i = 0 ; i < personas.size() ; i++){
            if(personas.get(i).getName().equals(name))
                return personas.get(i);

        }

        return null;

    }
    
    //Busque la pos de una persona
    //Retornoe la pos persona si lo encuentra
    //Retorne _____-1_____ si no lo encuentra

    public int findPosByName(String name){
        
        for(Persona persona : personas){
            if(persona.getName().equals(name)){
                return personas.indexOf(persona);
            }
        }
        for(int i = 0 ; i < personas.size() ; i ++){
            if(personas.get(i).getName().equals(name)){
                return i;
                
            }


        }
        return -1;
    }


/*
    BUSQUEDA secuencial > complejidad >>promedio(O(n)) >> en el mejor de los casos(O(1))
    BUSQUEDA BINARIA > complejidad >>promedio(O(log n)) mejor de los casos(0(1)): porque en cada interaccio  divido el tamaño de mi entrada
    >Descartar la mitad , pero debe estar ordenado bajo el criterio de busqueda es decir ACENDENTEMENTE O DECENDENTEMENTE
    >central = (bajo + alto)/ 2
    >1ro preguntar eres lo que estoy buscando?
    >2do determinar si es mayor o menor para ir a la izquierda o derecha
    >3ro Actualizar los limites es decir  cnetral - 1 = 50  
                                       izquierda ->> inferior = 0           derecha ---> inferior = 51
                                                      superior = 49                      superior = 100
                                                                                          
si tengo un 25/2 = 12.5 me quedo con 12    
    >                                                              

> Evaluacion de complegidad
para java pueda comparar 2 personas se implementa la interfas Comparable<Persona>
                                                    public.......implements Comparable<Persona>
 */  
}