
/**
 * Write a description of class ListaEnlazada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.*;
public class ListaEnlazada
{
    //Declaramos la clase del nodo
    
    private class Nodo{
        protected Object dato;
        protected  Nodo sig;
        
        //Declaramos el constructor 
        public Nodo(){  
            sig = null;
            dato = new Object ();
            
        
        }
        
        //Le pasamos un objeto al nodo 
        public Nodo (Object p){
            sig = null;
            dato = p;
        }
    }
        //Atributos
        private Nodo primero;
        
        //Insertar un objeto al principio de la lista 
        public void Insertar_Primero(Object p){
            Nodo nuevo = new  Nodo (p);
            if (primero == null){
                primero = nuevo;
            }
            else{
                nuevo.sig = primero;
                primero = nuevo ;
            }
                
        }
        
        //Indica si la lista esta vacia o no 
        public boolean EstaVacia(){
            return primero == null;
        }
        
        //Devulve el primero de la lista 
        public Object Primero (){
            Object elemen = null;
            if(!EstaVacia()){
                elemen = (Object) primero.dato;
           }
        
            return elemen;
        
        }
        
        //Devulve el ultimo valor de la lsita 
        public Object Ultimo (){
           Object elemen = null;
            Nodo aux = null;
            if (!EstaVacia()){
                aux = primero;
                while (aux .sig != null){
                    aux = aux.sig;
                  
                    elemen = (Object) aux.dato;
            }
        }
        return elemen;
      }
      
      public int Cuantos_Elementos (){
          Nodo aux = null;
          int i=0;
          aux = primero;
          while(aux != null){
              aux = aux.sig;
              i++;
            }
            return i;
        }
        
       public void mostrar(){
            Nodo temp = primero;
            if (temp != null){
                System.out.println("\nLos datos de la lista son:");
                while (temp != null){
                    System.out.println(temp.dato.toString()+" ");
                    temp = temp.sig;
                }
                //System.out.ptintln("\n");
            }
        }
        
  } 
    
    

