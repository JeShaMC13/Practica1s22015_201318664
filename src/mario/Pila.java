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
     
    }
        public void Pop(ObtenerDatos dato2){
            if(primero == null){
                 JOptionPane.showMessageDialog(null, "Lista vacia");
            }
            //else{
                if(primero==ultimo){
                   
                     ultimo= ultimo.anterior1;
                   // ultimo = primero;
                    ultimo.siguiente1 = null;
                     primero = null;
                    ultimo= null;
                }else{
                   
                }listacompleta();
            }
            

        
        public void listacompleta(){
            aux = primero;
             //JOptionPane.showMessageDialog(null, "Lista completa");
        while(aux!=null){
             //JOptionPane.showMessageDialog(null, "Lista"+aux.dato1);
            // System.out.println(aux.dato1);   
            //JOptionPane.showMessageDialog(null, aux.dato1);
             aux = aux.siguiente1;
        }
           }

 

    
        
    }
    
