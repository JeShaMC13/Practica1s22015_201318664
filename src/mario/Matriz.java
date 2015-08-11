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
public class Matriz {
  NodoMatriz inicioX;
  NodoMatriz finX;
  NodoMatriz inicioY;
  NodoMatriz finY;
  NodoMatriz registroFila;
  NodoMatriz registroColumna;
    
  public void AgregarFila(ObtenerDatos datos3){
  NodoMatriz adicionalX= new NodoMatriz(datos3);
  if(this.inicioX == null){
  this.inicioX =  adicionalX;
  this.finX = this.inicioX;
  this.registroFila = this.inicioX;
  
  }else{
      this.finX.setSiguienteX(adicionalX);
      adicionalX.setAnteriorX(inicioX);
this.finX = adicionalX;
  }
  
  
}
  
  public void AgregarColumna(ObtenerDatos datos3){
      NodoMatriz adicionalY = new NodoMatriz(datos3);
      if(this.inicioY == null){
          this.inicioY = adicionalY;
         this.finY = this.inicioY;
         this.registroColumna = this.inicioY;
         
      }else{
          this.finY.setSiguienteY(adicionalY);
          adicionalY.setAnteriorY(inicioY);
          this.finY = adicionalY;
      }
  }
  
    }
    
