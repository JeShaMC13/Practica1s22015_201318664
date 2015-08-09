/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mario;

import java.awt.event.ActionEvent;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Jenny
 */
public class ListaDoble {
  private Nodo Inicio;
    private Nodo Fin;
    private Nodo registro;
    private int length;
            
    

    public Nodo getInicio() {
        return Inicio;
    }

    public Nodo getFin() {
        return Fin;
    }

    public Nodo getRegistro() {
        return registro;
    }

    public int getLength() {
        return length;
    }

    public void setInicio(Nodo Inicio) {
        this.Inicio = Inicio;
    }

    public void setFin(Nodo Fin) {
        this.Fin = Fin;
    }

    public void setRegistro(Nodo registro) {
        this.registro = registro;
    }

    public void setLength(int length) {
        this.length = length;
    }

  

       
    //Metodo para saber si la lista esta vacia
    public boolean EstaVacia(){
        return Inicio==null;
    }
 
  
      public int Length() {

        return this.length;
    }

       
    
    public ListaDoble() {
        this.length = 0;
    }
    
      public void Agregar(ObtenerDatos datos){
        Nodo adicional = new Nodo(datos);
        if(this.Inicio == null){
            this.Inicio = adicional;
            this.Fin = this.Inicio;
            this.registro = this.Inicio;
            
        }else{
        this.Fin.setSiguiente(adicional);
        adicional.setAnterior(this.Fin);
        this.Fin = adicional;
        
        }
        this.length++;
    }
  
    public void Agregar(){
        this.registro = this.Inicio;
    }
    
    
    
    public ObtenerDatos getNextAgregar(){
        if(registro == null){
            return null;
        }else{
            if(this.registro!=null){
            ObtenerDatos temp;
            temp = this.registro.getDatos();
            this.registro = this.registro.getSiguiente();
            return temp;
            }else
                 return null;
        }
       
        
    }
}


      