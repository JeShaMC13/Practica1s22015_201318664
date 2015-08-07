/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mario;
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
    Object elemento;
    Nodo siguiente;
    Nodo fin;
    int size;
    
    public Pila(){
        fin = null;
        size =0;
}
   public boolean isEmpty() {

    return (size == 0);
  }
    public Pila(Object o){
     /*Node new_node = new Node(o);
    if (end == null)
      end = new_node;
    else {
      new_node.Next = end;
      end = new_node;
    }
    size++; */
      
        
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
    
}
