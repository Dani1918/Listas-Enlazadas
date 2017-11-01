
/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Menu
{
    public static void main (String[]args){
        
        Lista lista = new Lista ();
        Scanner sc = new Scanner(System.in);
         
         String insertar = "1.Insertar",mostrar ="2.Mostrar",buscar="3.Buscar",
         eliminar = "4.Eliminar",contar="5.Contar",salir ="6.Salir";
         boolean menu = true;
         
      while (menu){
         System.out.println("          Bienvenido");
         System.out.println(" " );
         System.out.println("**********************************");
         System.out.println("1.Insertar                      **");
         System.out.println("2.Mostrar                       **");
         System.out.println("3.Buscar                        **");
         System.out.println("4.Eliminar                      **");
         System.out.println("5.Contar                        **");
         System.out.println("6.Salir                         **");
         System.out.println("**********************************");
         System.out.println(" " );
        
         System.out.println("Elige una opción de nuestro menú");
         int opcion = sc.nextInt();
         
        
        if (opcion == 1){
         
         System.out.println("Inserta un nombre " );
         String  nombre = sc.next();
         lista.Insertar_Primero(nombre) ;
        
         }else
        
        if(opcion == 2){
             lista.mostrar ();
               if (lista.EstaVacia () == true){
             System.out.println("La lista esta vacía.");
            
           }
         }else
      
          if (opcion == 3){
          }else
       
          if (opcion == 4){
          
          }else
      
          if (opcion == 5){
           System.out.println("\nEl total de elementos es de :" + lista.Cuantos_Elementos());
          
          
         }else
         
         if  (opcion == 6){
             
                
            }
           
          
      }
    }
}
   

           
        
        
         
    

