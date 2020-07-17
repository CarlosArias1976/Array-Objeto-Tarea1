/*
 * implementar 10 datos acerca del 
/*Pronóstico del área de contacto de los
neumáticos de un vehículo vía redes neuronales
recurrentes.
 */
package arrayobjetotarea1;

/**
 *
 * @author Carlos Arias
 */
class AreaNeumatico {
    public int id;
    public String nombre;
    AreaNeumatico(int id,String nombre) {
        this.id=id;
        this.nombre = nombre;
    }
}

public class ArrayObjetoTarea1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("UNIVERDIDAD DE LAS FUERZAS ARMADAS ");
        System.out.println("ESPE");
        System.out.println("SEDE LATACUNGA");
        System.out.println("PROGRAMACION");
        System.out.println("DOCENTE: ING LUIS GUERRA");
        System.out.println("ALUMNO: CARLOS ARIAS");
        
        AreaNeumatico[] arreglo;
        
        arreglo=new AreaNeumatico[10];
        arreglo[0]= new AreaNeumatico(1,"Ancho de Neumatico");
         arreglo[1]=new AreaNeumatico(2,"Sensores de Flexion");
        arreglo[2]=new AreaNeumatico(3,"Acelerometro");
        arreglo[3]=new AreaNeumatico(4,"Unidad de Masa Inercial");
        arreglo[4]=new AreaNeumatico(5,"Microcontrolador Tiva TM4C123GXL");
        arreglo[5]= new AreaNeumatico(6,"Amortiguadores");
        arreglo[6]= new AreaNeumatico(7,"Banco de Pruebas");
        arreglo[7]= new AreaNeumatico(8,"Redes Neuronales");
        arreglo[8]= new AreaNeumatico(9,"Chasis del Automotor");
        arreglo[9]= new AreaNeumatico(10,"Leds Infrarojos");
        
        
        for(int i = 0;i<arreglo.length;i++)
            System.out.println("Elemento en"+i+":"+arreglo[i].id +""+arreglo[i].nombre);
    }
    
    
}
