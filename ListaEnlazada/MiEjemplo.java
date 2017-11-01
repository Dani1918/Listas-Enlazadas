
/**
 * Write a description of class MiEjemplo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class MiEjemplo
{
     public static void main(String[]args)
     {
         //Creamos la Lista
         ListaEnlazada lista = new ListaEnlazada ();
         
         //Añadimos datos
         lista.Insertar_Primero("Jonathan");
         lista.Insertar_Primero("Oscar");
         lista.Insertar_Primero("Guadalupe");
         lista.Insertar_Primero("Carolina");
         
         //Mostramos el primer elemento 
         System.out.println("El primer elemento es:" + lista.Primero ());
         System.out.println("El ultimo elemento es:" + lista.Ultimo ());
         
         //Preguntamos si la lsita esta vacia
         
         if (lista.EstaVacia () == true){
             System.out.println("La lista esta vacía.");
            }else{
                System.out.println("La lista no esta vacía.");
            }
            
         //Mostrar el total de elementos
         System.out.println("\nEl total de elementos es de :" + lista.Cuantos_Elementos());
         //Mostrar los datos de la lista 
         lista.mostrar ();
        }
}
