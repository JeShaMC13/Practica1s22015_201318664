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
public class NodoPila {
        Object dato1;
        NodoPila anterior1;
        NodoPila siguiente1;
        
        public NodoPila(Object dato2){
            this.dato1 = dato2;
            this.anterior1 = null;
            this.siguiente1 = null;
        }
        
        public NodoPila(NodoPila anterior1, Object dato2){
            this.anterior1 = anterior1;
            this.dato1 = dato2;
            this.siguiente1 = null;
        }
        
}
