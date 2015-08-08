/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mario;

import java.awt.Graphics;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Jenny
 */
public class ObtenerDatos {
  public String Nombre;
  public ImageIcon Imagen;
  
  public ObtenerDatos(String nombre, ImageIcon imagen){
   
      this.Nombre = nombre;
      this.Imagen = imagen;
   }

    public ImageIcon getImagen() {
        return Imagen;
    }

    public void setImagen(ImageIcon Imagen) {
        this.Imagen = Imagen;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

  
    public String getNombre() {
        return Nombre;
    }   
}
