//Estructura de datos
//05-06-2019
package busqieda;

/**
 *
 * @author usser-ijh7
 */
public class Busqieda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int vector [] ={2,4,6,7,9,11,12,15};
        int valorBuscado = 6;
        int posicion = 0;
        
        posicion = busquedaBinaria(vector, valorBuscado);
        
        System.out.println("El dato está en " + posicion);
    }
    
    //Se reciben un arreglo y el dato a buscar
    public static int busquedaBinaria(int vector [], int dato){
        
        int n = vector.length;
        int centro;
        int inf = 0;
        int sup = n - 1;
        
        while(inf <=sup){
            
            centro = (sup + inf) / 2;
            
            if(vector [centro] == dato){
                return centro;
            } else if(dato < vector [centro]){
                sup = centro - 1;
            }else{
                inf = centro + 1;
            }
            
           
        }
         return -1;
    }
    
}
