/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mario;

import java.awt.Component;
import java.awt.PopupMenu;
import javax.swing.JOptionPane;

/**
 *
 * @author Jenny
 */
public class Pila {
    //Necesito hacer un push para insertar elementos a la pila
    //Necesito hacer un pop para rehuperar un objeto de la pila
    // Obtener un objeto de la cima sin extraerlo
    //Averiguar si hay un objeto en la pila
    //Devolver el numero de objetos en la pila
NodoPila primero;
NodoPila ultimo;
NodoPila nuevo;
NodoPila aux;
NodoPila pos;
NodoPila ant;
    
    
    public Pila(){
     /*Node new_node = new Node(o);
    if (end == null)
      end = new_node;
    else {
      new_node.Next = end;
      end = new_node;
    }
    size++; */
      primero = null;
      ultimo= null;
      nuevo = null;
      aux = null;
      pos = null;
      ant = null;
        
    }
    
    public void Push(ObtenerDatos dato2){
        if(primero == null){
            primero = new NodoPila(dato2);
            ultimo = primero;
      }else{
            nuevo = new NodoPila(ultimo, dato2);
            ultimo.siguiente1 = nuevo;
            ultimo = nuevo;
        }
        listacompleta();
        /*
         public void insertarPush(Object dato){
        if(Primero==null){//////////1 caso(lista vacia)
        Primero = new NodoListaPila(dato);
        Ultimo = Primero;
        }
        else{
            Nuevo = new NodoListaPila(Ultimo, dato);
            Ultimo.Der = Nuevo;
            Ultimo = Nuevo;
        }despliegaListaPila();
    }
        */
        
    }
        public void Pop(){
            if(primero == null){
                 JOptionPane.showMessageDialog(null, "Lista vacia");
            }else{
                if(primero==ultimo){
                    primero = null;
                    ultimo= null;
                    
                }else{
                    ultimo= ultimo.anterior1;
                    ultimo.siguiente1 = null;
                }
            }
            
        }
        
        public void listacompleta(){
            aux = primero;
             JOptionPane.showMessageDialog(null, "Lista completa");
        while(aux!=null){
             /*MostrarObjetos objetos = new MostrarObjetos();
             objetos.add((Component) aux.dato1);*/
           // Mostrar mostrar = new Mostrar();
             JOptionPane.showMessageDialog(null, "Lista"+aux.dato1);
             System.out.println(aux.dato1);      
             
             aux = aux.siguiente1;
        }
        
        /*
        public  void despliegaListaPila(){
        Aux = Primero;
        System.out.println ("#########   LISTA COMPLETA   ###########");
        while (Aux != null) {
            System.out.println (Aux.info);
            Aux = Aux.Der;
        }
        System.out.println ("########################################");
    }
}
        */
        
        
        
        
        }

    void push(ObtenerDatos ingresar1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        
    }
    /*
    public class LinkedStack {

  class Node {
    Object elem;
    Node Next;

    public Node(Object o) {
      elem = o;
      Next = null;
    }
  }

  Node end;
  int size;

  public LinkedStack() {
    end = null;
    size = 0;
  }

  public void push(Object o) {
    Node new_node = new Node(o);
    if (end == null)
      end = new_node;
    else {
      new_node.Next = end;
      end = new_node;
    }
    size++;
  }; // inserts an object onto the stack

  public Object pop() {
    if (end == null)
      return null;
    ;
    Object o = end.elem;
    end = end.Next;
    size--;
    return o;
  }// Gets the object from the stack

  public boolean isEmpty() {

    return (size == 0);
  }

  public int size() {

    return size;
  }

  public Object end() {

    if (end == null)
      return null;
    else
      return end.elem;
  }

} // class LinkedStack    */
    

