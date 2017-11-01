
/**
 * Write a description of class prueba here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class prueba
{
    public static void main (String[]args){
         Scanner sc = new Scanner(System.in);
         
        Lista lista = new Lista ();
         
         String insertar = "1.Insertar",mostrar ="2.Mostrar",buscar="3.Buscar",
         eliminar = "4.Eliminar",contar="5.Contar";
         
         boolean salir = false;
         
         
         while (!salir){
          System.out.println("          Bienvenido");  
          System.out.println(" " );
          System.out.println("**********************************");
          System.out.println("1.Insertar");
          System.out.println("2.Mostrar");
          System.out.println("3.Buscar");
          System.out.println("4.Eliminar");
          System.out.println("5.Contar");
          System.out.println("6.Salir");
          System.out.println("**********************************");
          System.out.println(" " );
          
         System.out.println("Elige una opción de nuestro menú");
         int opcion = sc.nextInt();
         System.out.println(" " );
          
          try{
           
             
              switch (opcion){
                  case 1:
                  System.out.println("**********************************");
                  System.out.println("Inserta un nombre " );
                  String  nombre = sc.next();
                  lista.Insertar_Primero(nombre) ;
                  System.out.println("**********************************");
                  System.out.println(" " );
                  break;
                  
                  case 2:
                  System.out.println("**********************************");
                  lista.mostrar ();
                  System.out.println("**********************************");
                  System.out.println(" " );
                  
                  if (lista.EstaVacia () == true){
                  System.out.println("**********************************");
                  System.out.println("La lista esta vacía.");
                  System.out.println("**********************************");
                  System.out.println(" " );
            
                 }
                  break;
                  case 3:
                
                  break;
                  case 4:
                 
                  
                  break;
                  case 5:
                  System.out.println("**********************************");
                  System.out.println("\nEl total de elementos es de :" + lista.Cuantos_Elementos());
                  System.out.println("**********************************");
                  System.out.println(" " );
                  break;
                  case 6:
                  salir = true;
                  System.out.println("**********************************");
                  System.out.println("Vuelve Pronto Amiguto :*" );
                  System.out.println("**********************************");
                  break;
                  
                  default:
                  System.out.println("**********************************");
                  System.out.println("Solo numeros entre 1 y 6");
                  System.out.println("**********************************");
                }
            }catch (InputMismatchException e){
                  System.out.println("**********************************");
                  System.out.println("Solo se permiten numeros");
                  sc.next();
                  System.out.println("**********************************");
                }
      }
   }
}
