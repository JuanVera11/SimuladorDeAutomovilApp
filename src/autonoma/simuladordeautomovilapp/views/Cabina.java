/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package autonoma.simuladordeautomovilapp.views;

import autonoma.simuladordeautomovilapp.exceptions.VehiculoAccidentadoException;
import autonoma.simuladordeautomovilapp.exceptions.VehiculoApagadoException;
import autonoma.simuladordeautomovilapp.exceptions.VehiculoDetenidoException;
import autonoma.simuladordeautomovilapp.exceptions.VehiculoHaPatinadoException;
import autonoma.simuladordeautomovilapp.exceptions.VehiculoYaApagadoException;
import autonoma.simuladordeautomovilapp.exceptions.VehiculoYaEncendidoException;
import autonoma.simuladordeautomovilapp.models.Vehiculo;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Esteban Vera Velez
 */
public class Cabina extends javax.swing.JFrame {
 private Vehiculo vehiculo;
    /**
     * Creates new form Cabina
     */
    public Cabina( Vehiculo vehiculo) {
        initComponents();
         this.setLocationRelativeTo(null);
        try {
            this.setIconImage(new ImageIcon(getClass().getResource("/autonoma/SimuladorDeAutomovillApp/images/Vehiculo.png")).getImage());
        } catch (Exception e) {

        }
        this.vehiculo = vehiculo;
    }

 

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        PedalPresionado = new javax.swing.JLabel();
        Pedal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        EncenderMotor = new javax.swing.JLabel();
        ApagarPresionando = new javax.swing.JLabel();

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma.simuladordeautomovilapp.images/volante1.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma.simuladordeautomovilapp.images/volante1.png"))); // NOI18N
        jLabel3.setText("jLabel3");

        PedalPresionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma.simuladordeautomovilapp.images/pedalEntered.png"))); // NOI18N
        PedalPresionado.setText("jLabel4");
        PedalPresionado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PedalPresionadoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PedalPresionadoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PedalPresionadoMouseExited(evt);
            }
        });

        Pedal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma.simuladordeautomovilapp.images/pedal.png"))); // NOI18N
        Pedal.setText("jLabel5");
        Pedal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PedalMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                PedalMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                PedalMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma.simuladordeautomovilapp.images/informacion-removebg-preview.png"))); // NOI18N
        jLabel6.setText("Informacion");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });

        EncenderMotor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma.simuladordeautomovilapp.images/startEngine-removebg-preview.png"))); // NOI18N
        EncenderMotor.setText("jLabel7");
        EncenderMotor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EncenderMotorMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                EncenderMotorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                EncenderMotorMouseExited(evt);
            }
        });

        ApagarPresionando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma.simuladordeautomovilapp.images/stopEngine-removebg-preview.png"))); // NOI18N
        ApagarPresionando.setText("jLabel8");
        ApagarPresionando.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ApagarPresionandoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ApagarPresionandoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ApagarPresionandoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(EncenderMotor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ApagarPresionando, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(Pedal, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PedalPresionado, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ApagarPresionando, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(EncenderMotor, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PedalPresionado)
                            .addComponent(Pedal))
                        .addGap(64, 64, 64))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void EncenderMotorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncenderMotorMouseClicked
            try {
            vehiculo.encender();
        } catch (VehiculoYaEncendidoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Cabina.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cabina.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Cabina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_EncenderMotorMouseClicked

    private void ApagarPresionandoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApagarPresionandoMouseClicked
         try {
            vehiculo.apagar();
        } catch (VehiculoYaApagadoException | VehiculoAccidentadoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(Cabina.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Cabina.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(Cabina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ApagarPresionandoMouseClicked

    private void PedalPresionadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedalPresionadoMouseClicked
         try {
            int aAcelerar = Integer.parseInt(JOptionPane.showInputDialog("Cuanto desea acelerar? : "));
            vehiculo.acelerar(aAcelerar);
        } catch (VehiculoApagadoException | VehiculoAccidentadoException e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            JOptionPane.showMessageDialog(this, "Error al reproducir el sonido: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_PedalPresionadoMouseClicked

    private void PedalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedalMouseClicked
        try {
        int aFrenar = Integer.parseInt(JOptionPane.showInputDialog("¿Cuánto desea frenar? : "));
        vehiculo.frenar(aFrenar); 
    } catch (VehiculoApagadoException | VehiculoDetenidoException | VehiculoHaPatinadoException | VehiculoAccidentadoException e) {
        JOptionPane.showMessageDialog(this, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
        JOptionPane.showMessageDialog(this, "Error al reproducir el sonido: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_PedalMouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
       vehiculo.mostrarEstado();
    }//GEN-LAST:event_jLabel6MouseClicked

    private void EncenderMotorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncenderMotorMouseEntered
     EncenderMotor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/EncenderMotor.png")));
    }//GEN-LAST:event_EncenderMotorMouseEntered

    private void EncenderMotorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EncenderMotorMouseExited
       EncenderMotor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/Informacion.png")));
    }//GEN-LAST:event_EncenderMotorMouseExited

    private void ApagarPresionandoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApagarPresionandoMouseEntered
       ApagarPresionando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/ApagarPresionando.png")));
    }//GEN-LAST:event_ApagarPresionandoMouseEntered

    private void ApagarPresionandoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ApagarPresionandoMouseExited
       ApagarPresionando.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/Informacion.png")));
    }//GEN-LAST:event_ApagarPresionandoMouseExited

    private void PedalMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedalMouseEntered
     Pedal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/Pedal.png")));
    }//GEN-LAST:event_PedalMouseEntered

    private void PedalMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedalMouseExited
     Pedal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/Informacion.png")));                                          
    }//GEN-LAST:event_PedalMouseExited

    private void PedalPresionadoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedalPresionadoMouseEntered
       PedalPresionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/PedalPresionado.png")));
    }//GEN-LAST:event_PedalPresionadoMouseEntered

    private void PedalPresionadoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PedalPresionadoMouseExited
      PedalPresionado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/autonoma/images/Informacion.png")));
    }//GEN-LAST:event_PedalPresionadoMouseExited

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ApagarPresionando;
    private javax.swing.JLabel EncenderMotor;
    private javax.swing.JLabel Pedal;
    private javax.swing.JLabel PedalPresionado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
