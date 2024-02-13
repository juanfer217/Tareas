package umariana.taller1;

import Mundo.Tarea;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Taller1 {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<Tarea> misTareas = new ArrayList<>();
        
        boolean activo = true;
        do{
            System.out.println("====MENU DE OPCIONES====");
            System.out.println("1. Agregar tareas");
            System.out.println("2. Mostrar tareas");
            System.out.println("3. Tareas ordenadas");
            System.out.println("4. Programa terminado");
            System.out.println("========================");
            
            int opcion = lector.nextInt();
            switch(opcion){
                case 1:
                        System.out.println("Ingrese el id de la tarea");
                        int Id = lector.nextInt();
                        System.out.println("Ingresa la descripcion de la tarea");
                        String Descripcion = lector.next();
                        System.out.println("Ingrese la prioridad del 1 - 5");
                        int Prioridad = lector.nextInt();
                        Tarea nuevaTarea = new Tarea (Id, Descripcion, Prioridad);
                        misTareas.add(nuevaTarea);
                        System.out.println("====TAREA AGREGADA CORRECTAMENTE====");
                        break;
                case 2:
                        System.out.println("====TAREAS AGREGADAS====");
                        for(Tarea t : misTareas)
                        {
                            System.out.println("Id: " + t.getId());
                            System.out.println("Descripcion: " + t.getDescripcion());
                            System.out.println("Prioridad: " + t.getPrioridad());
                            System.out.println("====================");
                        }
                        break;
                case 3:
                            Collections.sort(misTareas, (tarea1, tarea2) -> tarea1.getPrioridad() - tarea2.getPrioridad());
                            System.out.println("Tareas ordenadas por prioridad:");
                            for (Tarea e : misTareas) {
                            System.out.println("Id: " + e.getId());
                            System.out.println("Descripcion: " + e.getDescripcion());
                            System.out.println("Prioridad: " + e.getPrioridad());
                            System.out.println("====================");
                     }
                    break;
                case 4:
                        activo = false; 
                        System.out.println("Programa terminado");
                        break;
                default:
                        System.out.println("OPCION INVALIDA");
            }
        }while(activo);        
    }  
}