/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mario;

import java.awt.Component;
import java.awt.PopupMenu;
import java.awt.image.ImageProducer;
import java.net.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.text.StyleConstants;

/**
 *
 * @author Jenny
 */
public class Principal extends javax.swing.JFrame {

    
    private ListaDoble agregar;
    private Pila pila;
    /**
     * Creates new form Principal
     */
    
    public Principal() {
        initComponents();
    agregar = new ListaDoble();
    pila = new Pila();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Muro = new javax.swing.JButton();
        Goomba = new javax.swing.JButton();
        Sorpresa = new javax.swing.JButton();
        Planta = new javax.swing.JButton();
        Piso = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Koopa = new javax.swing.JButton();
        Hongo = new javax.swing.JButton();
        Ladrillo = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        NOMBRE = new javax.swing.JTextField();
        Tubo = new javax.swing.JButton();
        Mario = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Muro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario/BlockNormal.png"))); // NOI18N
        Muro.setText("Muro ");
        Muro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MuroActionPerformed(evt);
            }
        });

        Goomba.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario/Goomba.png"))); // NOI18N
        Goomba.setText("Goomba");
        Goomba.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GoombaActionPerformed(evt);
            }
        });

        Sorpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario/BlockDuda.png"))); // NOI18N
        Sorpresa.setText("Ladrillo sorpresa");
        Sorpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SorpresaActionPerformed(evt);
            }
        });

        Planta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario/Planta.png"))); // NOI18N
        Planta.setText("Planta deboradora");
        Planta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlantaActionPerformed(evt);
            }
        });

        Piso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario/BlockRoto.png"))); // NOI18N
        Piso.setText("Piso");
        Piso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PisoActionPerformed(evt);
            }
        });

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario/Moneda.png"))); // NOI18N
        jButton6.setText("Moneda");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        Koopa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario/Koopa.png"))); // NOI18N
        Koopa.setText("Koopa");
        Koopa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KoopaActionPerformed(evt);
            }
        });

        Hongo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario/Hongo.png"))); // NOI18N
        Hongo.setText("Hongo");
        Hongo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HongoActionPerformed(evt);
            }
        });

        Ladrillo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario/BlockLadrillo.png"))); // NOI18N
        Ladrillo.setText("Ladrillo");
        Ladrillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LadrilloActionPerformed(evt);
            }
        });

        jButton2.setText("Mostrar objetos");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        NOMBRE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOMBREActionPerformed(evt);
            }
        });

        Tubo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario/jajaja.png"))); // NOI18N
        Tubo.setText("Tubo barrera");
        Tubo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TuboActionPerformed(evt);
            }
        });

        Mario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mario/Mario.png"))); // NOI18N
        Mario.setText("Mario");
        Mario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MarioActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre personaje");

        jLabel1.setText("Personajes");

        jLabel4.setText("Accesorios");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(190, 190, 190)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(110, 110, 110)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(Mario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(Goomba)
                                                .addComponent(Koopa))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(Planta, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(33, 33, 33)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(30, 30, 30)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(Muro)
                                                    .addComponent(Ladrillo)
                                                    .addComponent(Piso)
                                                    .addComponent(Sorpresa))
                                                .addGap(53, 53, 53)
                                                .addComponent(jLabel3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addComponent(Tubo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Hongo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(60, 60, 60)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 29, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NOMBRE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Mario, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(Goomba)
                        .addGap(9, 9, 9)
                        .addComponent(Koopa))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Muro)
                        .addGap(13, 13, 13)
                        .addComponent(Ladrillo)
                        .addGap(13, 13, 13)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Piso)
                            .addComponent(jLabel3))
                        .addGap(19, 19, 19)
                        .addComponent(Sorpresa)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Planta, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Tubo, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Hongo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(22, 22, 22))
        );

        jLabel3.getAccessibleContext().setAccessibleName("imagen");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
         //Obtenemos la imagenen del boton
        ImageIcon Moneda = new ImageIcon(getClass(). getResource ( "/mario/Moneda.png" ));
        //Mandamos a imprimir la imagen en un label
        jLabel3.setIcon(Moneda);
        
        
      String nom = NOMBRE.getText();    
   if (nom.isEmpty()) {
       JOptionPane.showMessageDialog(this, "llene los campos");
   }else {
         
            ImageIcon mar = new ImageIcon(getClass(). getResource ( "/mario/Moneda.png" ));    
            ObtenerDatos ingresar1 = new ObtenerDatos( nom, mar);
            this.agregar.Agregar(ingresar1);
            JOptionPane.showMessageDialog(this, "Numero Actual de objetos " + this.agregar.Length());
           // JOptionPane.showMessageDialog(null, agregar.Agregar(ingresar1));
      

//pila.Push();
   }
    
    }//GEN-LAST:event_jButton6ActionPerformed
      
    private void HongoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HongoActionPerformed
          //Obtenemos la imagenen del boton
        ImageIcon Hongo = new ImageIcon(getClass(). getResource ( "/mario/Hongo.png" ));
        //Mandamos a imprimir la imagen en un label
        jLabel3.setIcon(Hongo);
        
        
      String nom = NOMBRE.getText();    
   if (nom.isEmpty()) {
       JOptionPane.showMessageDialog(this, "llene los campos");
   }else {
         
            ImageIcon mar = new ImageIcon(getClass(). getResource ( "/mario/Hongo.png" ));    
            ObtenerDatos ingresar1 = new ObtenerDatos( nom, mar);
            this.agregar.Agregar(ingresar1);
            JOptionPane.showMessageDialog(this, "Numero Actual de objetos " + this.agregar.Length());
          //pila.push(ingresar1);        
   }
   
    }//GEN-LAST:event_HongoActionPerformed

    private void LadrilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LadrilloActionPerformed

        // a jframe here isn't strictly necessary, but it makes the example a little more real
        //   JFrame frame = new JFrame("InputDialog");

        // prompt the user to enter their name
        //  String name = JOptionPane.showInputDialog(frame, "Nombre?");

        // get the user's input. note that if they press Cancel, 'name' will be null
        //  System.out.printf("The user's name is '%s'.\n", name);
        // System.exit(0);
        
        //Obtenemos la imagenen del boton
        ImageIcon Ladrillo = new ImageIcon(getClass(). getResource ( "/mario/BlockLadrillo.png" ));
        //Mandamos a imprimir la imagen en un label
        jLabel3.setIcon(Ladrillo);
        
        
      String nom = NOMBRE.getText();    
   if (nom.isEmpty()) {
       JOptionPane.showMessageDialog(this, "llene los campos");
   }else {
         
            ImageIcon mar = new ImageIcon(getClass(). getResource ( "/mario/BlockLadrillo.png" ));    
            ObtenerDatos ingresar1 = new ObtenerDatos( nom, mar);
            this.agregar.Agregar(ingresar1);
            JOptionPane.showMessageDialog(this, "Numero Actual de objetos " + this.agregar.Length());
                    pila.Push(ingresar1);
   }
        
        
    }//GEN-LAST:event_LadrilloActionPerformed
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        JOptionPane.showMessageDialog(null,"Hola");
       
        Mostrar MOSTRAR = new Mostrar();
        MOSTRAR.setVisible(true);
       
      
    }//GEN-LAST:event_jButton2ActionPerformed

    private void NOMBREActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOMBREActionPerformed
       
    }//GEN-LAST:event_NOMBREActionPerformed

    
    
    private void MarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MarioActionPerformed
       //Obtenemos la imagenen del boton
        ImageIcon Mario = new ImageIcon(getClass(). getResource ( "/mario/Mario.png" ));
        //Mandamos a imprimir la imagen en un label
        jLabel3.setIcon(Mario);
        
        
      String nom = NOMBRE.getText();    
   if (nom.isEmpty()) {
       JOptionPane.showMessageDialog(this, "llene los campos");
   }else {
         
            ImageIcon mar = new ImageIcon(getClass(). getResource ( "/mario/Mario.png" ));    
            ObtenerDatos ingresar1 = new ObtenerDatos( nom, mar);
            this.agregar.Agregar(ingresar1);
            JOptionPane.showMessageDialog(this, "Numero Actual de objetos " + this.agregar.Length());
                    
   }
   
    }//GEN-LAST:event_MarioActionPerformed

    private void PisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PisoActionPerformed
         ImageIcon Piso = new ImageIcon(getClass(). getResource ( "/mario/BlockRoto.png" ));
        //Mandamos a imprimir la imagen en un label
        jLabel3.setIcon(Piso);
        
      String nom = NOMBRE.getText();    
   if (nom.isEmpty()) {
       JOptionPane.showMessageDialog(this, "llene los campos");
   }else { 
            ImageIcon mar = new ImageIcon(getClass(). getResource ( "/mario/BlockRoto.png" ));    
            ObtenerDatos ingresar1 = new ObtenerDatos( nom, mar);
            this.agregar.Agregar(ingresar1);
            JOptionPane.showMessageDialog(this, "Numero Actual de objetos " + this.agregar.Length());          
   }
        
    }//GEN-LAST:event_PisoActionPerformed

    private void GoombaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GoombaActionPerformed
       //Obtenemos la imagenen del boton
        ImageIcon Goomba = new ImageIcon(getClass(). getResource ( "/mario/Goomba.png" ));
        //Mandamos a imprimir la imagen en un label
        jLabel3.setIcon(Goomba);
    
        
      String nom = NOMBRE.getText();    
   if (nom.isEmpty()) {
       JOptionPane.showMessageDialog(this, "llene los campos");
   }else {
         
            ImageIcon mar = new ImageIcon(getClass(). getResource ( "/mario/Goomba.png" ));    
            ObtenerDatos ingresar1 = new ObtenerDatos( nom, mar);
            this.agregar.Agregar(ingresar1);
            JOptionPane.showMessageDialog(this, "Numero Actual de objetos " + this.agregar.Length());
                    
   }
        
    }//GEN-LAST:event_GoombaActionPerformed

    private void KoopaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KoopaActionPerformed
       //Obtenemos la imagenen del boton
        ImageIcon Koopa = new ImageIcon(getClass(). getResource ( "/mario/Koopa.png" ));
        //Mandamos a imprimir la imagen en un label
        jLabel3.setIcon(Koopa);
   
      String nom = NOMBRE.getText();    
   if (nom.isEmpty()) {
       JOptionPane.showMessageDialog(this, "llene los campos");
   }else {
         
            ImageIcon mar = new ImageIcon(getClass(). getResource ( "/mario/Koopa.png" ));    
            ObtenerDatos ingresar1 = new ObtenerDatos( nom, mar);
            this.agregar.Agregar(ingresar1);
            JOptionPane.showMessageDialog(this, "Numero Actual de objetos " + this.agregar.Length());
                    
   }
    }//GEN-LAST:event_KoopaActionPerformed

    private void PlantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlantaActionPerformed
         //Obtenemos la imagenen del boton
        ImageIcon Planta = new ImageIcon(getClass(). getResource ( "/mario/Planta.png" ));
        //Mandamos a imprimir la imagen en un label
        jLabel3.setIcon(Planta);
   
      String nom = NOMBRE.getText();    
   if (nom.isEmpty()) {
       JOptionPane.showMessageDialog(this, "llene los campos");
   }else {
         
            ImageIcon mar = new ImageIcon(getClass(). getResource ( "/mario/Planta.png" ));    
            ObtenerDatos ingresar1 = new ObtenerDatos( nom, mar);
            this.agregar.Agregar(ingresar1);
            JOptionPane.showMessageDialog(this, "Numero Actual de objetos " + this.agregar.Length());
                    
   }
    }//GEN-LAST:event_PlantaActionPerformed

    private void MuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MuroActionPerformed
          //Obtenemos la imagenen del boton
        ImageIcon Muro = new ImageIcon(getClass(). getResource ( "/mario/BlockNormal.png" ));
        //Mandamos a imprimir la imagen en un label
        jLabel3.setIcon(Muro);
        
      String nom = NOMBRE.getText();    
   if (nom.isEmpty()) {
       JOptionPane.showMessageDialog(this, "llene los campos");
   }else {
         
            ImageIcon mar = new ImageIcon(getClass(). getResource ( "/mario/BlockNormal.png" ));    
            ObtenerDatos ingresar1 = new ObtenerDatos( nom, mar);
            this.agregar.Agregar(ingresar1);
            JOptionPane.showMessageDialog(this, "Numero Actual de objetos " + this.agregar.Length());
                    
   }
   
    }//GEN-LAST:event_MuroActionPerformed

    private void SorpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SorpresaActionPerformed
          //Obtenemos la imagenen del boton
        ImageIcon Sorpresa = new ImageIcon(getClass(). getResource ( "/mario/BlockDuda.png" ));
        //Mandamos a imprimir la imagen en un label
        jLabel3.setIcon(Sorpresa);
        
      String nom = NOMBRE.getText();    
   if (nom.isEmpty()) {
       JOptionPane.showMessageDialog(this, "llene los campos");
   }else {
         
            ImageIcon mar = new ImageIcon(getClass(). getResource ( "/mario/BlockDuda.png" ));    
            ObtenerDatos ingresar1 = new ObtenerDatos( nom, mar);
            this.agregar.Agregar(ingresar1);
            JOptionPane.showMessageDialog(this, "Numero Actual de objetos " + this.agregar.Length());
                    
   }
   
    }//GEN-LAST:event_SorpresaActionPerformed

    private void TuboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TuboActionPerformed
         //Obtenemos la imagenen del boton
        ImageIcon Tubo = new ImageIcon(getClass(). getResource ( "/mario/jajaja.png" ));
        //Mandamos a imprimir la imagen en un label
        jLabel3.setIcon(Tubo);

      String nom = NOMBRE.getText();    
   if (nom.isEmpty()) {
       JOptionPane.showMessageDialog(this, "llene los campos");
   }else {
         
            ImageIcon mar = new ImageIcon(getClass(). getResource ( "/mario/jajaja.png" ));    
            ObtenerDatos ingresar1 = new ObtenerDatos( nom, mar);
            this.agregar.Agregar(ingresar1);
            JOptionPane.showMessageDialog(this, "Numero Actual de objetos " + this.agregar.Length());
                    
   }   
    }//GEN-LAST:event_TuboActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Goomba;
    private javax.swing.JButton Hongo;
    private javax.swing.JButton Koopa;
    private javax.swing.JButton Ladrillo;
    private javax.swing.JButton Mario;
    private javax.swing.JButton Muro;
    private javax.swing.JTextField NOMBRE;
    private javax.swing.JButton Piso;
    private javax.swing.JButton Planta;
    private javax.swing.JButton Sorpresa;
    private javax.swing.JButton Tubo;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables

    private PopupMenu ImageIcon(URL resource) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
