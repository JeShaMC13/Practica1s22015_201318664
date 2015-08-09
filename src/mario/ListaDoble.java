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
    private static final Logger LOG = Logger.getLogger(ListaDoble.class.getName());
    private Nodo Inicio;
    private Nodo Fin;
    private Nodo registro;
    private int length;
            
/*ImageIcon Mario =new ImageIcon("Mario.png"); 
ImageIcon BlockDuda =new ImageIcon("BlockDuda.png"); 
ImageIcon BlockLadrillo =new ImageIcon("BlockLadrillo.png"); 
ImageIcon BlockNormal =new ImageIcon("BlockNormal.png"); 
ImageIcon BlockRoto =new ImageIcon("BlockRoto.png"); 
ImageIcon Goomba =new ImageIcon("Goomba.png"); 
ImageIcon Hongo =new ImageIcon("Hongo.png"); 
ImageIcon Koopa =new ImageIcon("Koopa.png"); 
ImageIcon LadriloVerde =new ImageIcon("LadrilloVerde.png"); 
ImageIcon Moneda =new ImageIcon("Moneda.png"); 
ImageIcon Planta =new ImageIcon("Planta.png"); 
ImageIcon jajaja =new ImageIcon("jajaja"); */
       
    //Metodo para saber si la lista esta vacia
    public boolean EstaVacia(){
        return Inicio==null;
    }
 
    /*
    
    //Metodo para agregar nodos al final
    
    public void AgregarFinal(int El){
       if(!EstaVacia()){
           Fin = new Nodo(El, null, Fin);
           Fin.anterior.siguiente = Fin;
           
       }else{
       //Es para cuanto un no hay nodos
           Inicio= new Nodo(El);
           Fin = new Nodo(El);
           
       }
      
       }
      */ 
    /*
    //Metodo para agregar nodos al inicio 
       public void AgregarInicio(int El){
       if(!EstaVacia()){
           Inicio = new Nodo(El,Inicio, null);
           Inicio.siguiente.anterior = Inicio;
           
       }else{
           //Es para cuando hay no hay nodos
           Inicio= new Nodo(El);
           Fin = new Nodo(El);
           
       }
       } */
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

        
   
            
        /*public Ventas getNextRemesa() {
        if (registroActual == null) {
            return null;
        } else {
            if (this.registroActual != null) {

                Ventas Temporal;
                Temporal = this.registroActual.getRemesa();
                this.registroActual = this.registroActual.getSiguiente();
                return Temporal;
            } else 
                return null;
            

        }
    */
    
  
    /*
    public void ResetRemesa(){
        this.registroActual= this.primerNodo;
    }
    */
  
    
       
  
    /*  
    //Metodo para mostrar la lista de inicio a fin
       
     
       public void MostrarListaInicioFin(){
      if(!EstaVacia()){
          String datos ="<=>";
                  Nodo auxiliar = Inicio;
                  while (auxiliar!= null){
                      datos = datos + "[" + auxiliar.dato + "] <=>";
                      auxiliar = auxiliar.siguiente;
                  }
                  JOptionPane.showMessageDialog(null, datos,"Mostrar lista de inicio a fin", JOptionPane.INFORMATION_MESSAGE);
      }
       }
             public void MostrarListaFinInicio(){
      if(!EstaVacia()){
          String datos ="<=>";
                  Nodo auxiliar = Fin;
                  while (auxiliar!= null){
                      datos = datos + "[" + auxiliar.dato + "] <=>";
                      auxiliar = auxiliar.anterior;
                  }
                  JOptionPane.showMessageDialog(null, datos,"Mostrar lista de inicio a fin", JOptionPane.INFORMATION_MESSAGE);
      }           
       }
       */
       
      