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
public class NodoMatriz {
   NodoMatriz SiguienteX;
   NodoMatriz SiguienteY;
   NodoMatriz AnteriorY;
   NodoMatriz AnteriorX;

   
    public NodoMatriz(NodoMatriz SiguienteX, NodoMatriz AnteriorX, NodoMatriz SiguienteY, NodoMatriz AnteriorY) {
        this.SiguienteX = SiguienteX;
        this.AnteriorX = AnteriorX;
        this.SiguienteY = SiguienteY;
        this.AnteriorY = AnteriorY;
    }

    public void setSiguienteX(NodoMatriz SiguienteX) {
        this.SiguienteX = SiguienteX;
    }

    public void setAnteriorX(NodoMatriz AnteriorX) {
        this.AnteriorX = AnteriorX;
    }

    public void setSiguienteY(NodoMatriz SiguienteY) {
        this.SiguienteY = SiguienteY;
    }

    public void setAnteriorY(NodoMatriz AnteriorY) {
        this.AnteriorY = AnteriorY;
    }
   
    public NodoMatriz getSiguienteX() {
        return SiguienteX;
    }

    public NodoMatriz getAnteriorX() {
        return AnteriorX;
    }

    public NodoMatriz getSiguienteY() {
        return SiguienteY;
    }

    public NodoMatriz getAnteriorY() {
        return AnteriorY;
    } 
}
