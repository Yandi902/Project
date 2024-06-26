/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package projek;

import java.awt.Color;
import static java.awt.Color.BLUE;
import static java.awt.Color.GREEN;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author ACER
 */
public class Home_Admin extends javax.swing.JFrame {

    /**
     * Creates new form Karyawan
     */
    public Home_Admin() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        panelImage1 = new impor.PanelImage();
        binput = new javax.swing.JButton();
        bdata = new javax.swing.JButton();
        bkaryawan = new javax.swing.JButton();
        bkeluar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204), 2));

        jLabel1.setFont(new java.awt.Font("Segoe Print", 3, 50)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CAFE YS JIWA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        binput.setBackground(new java.awt.Color(127, 79, 62));
        binput.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        binput.setForeground(new java.awt.Color(255, 255, 255));
        binput.setText("INPUT MENU");
        binput.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        binput.setFocusable(false);
        binput.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                binputMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                binputMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                binputMouseExited(evt);
            }
        });
        binput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                binputActionPerformed(evt);
            }
        });

        bdata.setBackground(new java.awt.Color(127, 79, 62));
        bdata.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        bdata.setForeground(new java.awt.Color(255, 255, 255));
        bdata.setText("DATA PENJUALAN");
        bdata.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bdata.setFocusable(false);
        bdata.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bdataMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bdataMouseExited(evt);
            }
        });

        bkaryawan.setBackground(new java.awt.Color(127, 79, 62));
        bkaryawan.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        bkaryawan.setForeground(new java.awt.Color(255, 255, 255));
        bkaryawan.setText("INPUT KARYAWAN");
        bkaryawan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bkaryawan.setFocusable(false);
        bkaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bkaryawanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bkaryawanMouseExited(evt);
            }
        });
        bkaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkaryawanActionPerformed(evt);
            }
        });

        bkeluar.setBackground(new java.awt.Color(127, 79, 62));
        bkeluar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        bkeluar.setForeground(new java.awt.Color(255, 255, 255));
        bkeluar.setText("KELUAR");
        bkeluar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bkeluar.setFocusable(false);
        bkeluar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                bkeluarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                bkeluarMouseExited(evt);
            }
        });
        bkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bkeluarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelImage1Layout = new javax.swing.GroupLayout(panelImage1);
        panelImage1.setLayout(panelImage1Layout);
        panelImage1Layout.setHorizontalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelImage1Layout.createSequentialGroup()
                .addContainerGap(210, Short.MAX_VALUE)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(binput, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bdata, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(210, 210, 210))
        );
        panelImage1Layout.setVerticalGroup(
            panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelImage1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(binput, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bdata, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelImage1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bkeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(120, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bkaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkaryawanActionPerformed
        new Input_karyawan().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_bkaryawanActionPerformed

    private void binputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_binputActionPerformed
        new Input_menu().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_binputActionPerformed

    private void bkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bkeluarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Apakah Anda Yakin Ingin Keluar?", "Terima Kasih Atas Perhatiannya", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            new Admin_Login().setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_bkeluarActionPerformed

    private void binputMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_binputMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_binputMouseClicked

    private void bdataMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdataMouseEntered
        // ubah warna latar belakang button menjadi hijau
    JButton bdata = (JButton) evt.getSource(); // mendapatkan button yang menjadi sumber event
    bdata.setBackground(new Color(0,191,255));
    }//GEN-LAST:event_bdataMouseEntered

    private void bdataMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bdataMouseExited
       JButton bdata = (JButton) evt.getSource(); // mendapatkan button yang menjadi sumber event
    bdata.setBackground(new Color(127,79,62));
    }//GEN-LAST:event_bdataMouseExited

    private void bkeluarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkeluarMouseEntered
        // ubah warna latar belakang button menjadi hijau
    JButton bdata = (JButton) evt.getSource(); // mendapatkan button yang menjadi sumber event
    bdata.setBackground(new Color(255,0,0));
    }//GEN-LAST:event_bkeluarMouseEntered

    private void bkeluarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkeluarMouseExited
        JButton bdata = (JButton) evt.getSource(); // mendapatkan button yang menjadi sumber event
    bdata.setBackground(new Color(127,79,62));
    }//GEN-LAST:event_bkeluarMouseExited

    private void binputMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_binputMouseEntered
        JButton bdata = (JButton) evt.getSource(); // mendapatkan button yang menjadi sumber event
    bdata.setBackground(new Color(34,139,34));
    }//GEN-LAST:event_binputMouseEntered

    private void binputMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_binputMouseExited
        JButton bdata = (JButton) evt.getSource(); // mendapatkan button yang menjadi sumber event
    bdata.setBackground(new Color(127,79,62));
    }//GEN-LAST:event_binputMouseExited

    private void bkaryawanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkaryawanMouseEntered
        JButton bdata = (JButton) evt.getSource(); // mendapatkan button yang menjadi sumber event
    bdata.setBackground(new Color(95,158,160));
    }//GEN-LAST:event_bkaryawanMouseEntered

    private void bkaryawanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bkaryawanMouseExited
        JButton bdata = (JButton) evt.getSource(); // mendapatkan button yang menjadi sumber event
    bdata.setBackground(new Color(127,79,62));
    }//GEN-LAST:event_bkaryawanMouseExited

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
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bdata;
    private javax.swing.JButton binput;
    private javax.swing.JButton bkaryawan;
    private javax.swing.JButton bkeluar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private impor.PanelImage panelImage1;
    // End of variables declaration//GEN-END:variables
}
