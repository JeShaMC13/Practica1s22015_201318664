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
public class Nodo {
Nodo siguiente;
Nodo anterior;
public ObtenerDatos datos;


    public Nodo(Nodo siguiente, Nodo anterior, ObtenerDatos datos) {
        this.siguiente = siguiente;
        this.anterior = anterior;
        this.datos = datos;
    }

    public Nodo(ObtenerDatos obtener){
        this.datos = obtener;
        
    }
    
     public void setDatos(ObtenerDatos datos) {
        this.datos = datos;
    }

    public ObtenerDatos getDatos() {
        return datos;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    public void setAnterior(Nodo anterior) {
        this.anterior = anterior;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public Nodo getAnterior() {
        return anterior;
    }
    

   
    
 
}

