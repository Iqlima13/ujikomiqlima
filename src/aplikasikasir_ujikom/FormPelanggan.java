/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package aplikasikasir_ujikom;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author User
 */
public class FormPelanggan extends javax.swing.JFrame {
Connection konek;
PreparedStatement pst;
ResultSet rst;
    /**
     * Creates new form FormPelanggan
     */
    public FormPelanggan() {
        initComponents();
        konek = Koneksi.koneksiDB();
        updateTabel();
        
    }
    public void updateTabel() {
        try {
            String sql = "select * from pelanggan";
            pst = konek.prepareStatement(sql);
            rst = pst.executeQuery();
            tblpelanggan.setModel(DbUtils.resultSetToTableModel(rst));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void clear() {
        txtidpelanggan.setText("");
        txtnmpelanggan.setText("");
        txtalamat.setText("");
        txtnotlp.setText("");
          
    }
    
    private void simpan() {
        try {
            String sql = "insert into pelanggan (PelangganID,NamaPelanggan,Alamat,NomorTelepon) value (?,?,?,?)";
            pst = konek.prepareStatement(sql);
            pst.setString(1, txtidpelanggan.getText());
            pst.setString(2, txtnmpelanggan.getText());
            pst.setString(3, txtalamat.getText());
            pst.setString(4, txtnotlp.getText());
            pst.execute();
            JOptionPane.showMessageDialog(null, "Data Tersimpan");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        updateTabel();
        clear();
    }
         

                                              
                                                                                        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtidpelanggan = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtnmpelanggan = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtalamat = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        txtnotlp = new javax.swing.JTextField();
        btnsimpan = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btnhapus = new javax.swing.JButton();
        btnkeluar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblpelanggan = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Form Pelanggan\n");

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INPUT PELANGGAN");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(590, 590, 590)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        jLabel2.setText("ID Pelanggan");

        txtidpelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidpelangganActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Pelanggan");

        txtnmpelanggan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnmpelangganActionPerformed(evt);
            }
        });

        jLabel4.setText("Alamat");

        txtalamat.setColumns(20);
        txtalamat.setRows(5);
        jScrollPane1.setViewportView(txtalamat);

        jLabel5.setText("No Telepon");

        btnsimpan.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsimpan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-save-30.png"))); // NOI18N
        btnsimpan.setText("SIMPAN");
        btnsimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsimpanActionPerformed(evt);
            }
        });

        btnedit.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnedit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-edit-30.png"))); // NOI18N
        btnedit.setText("EDIT");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });

        btnhapus.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnhapus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-delete-30.png"))); // NOI18N
        btnhapus.setText("HAPUS");
        btnhapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnhapusActionPerformed(evt);
            }
        });

        btnkeluar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnkeluar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8-exit-30.png"))); // NOI18N
        btnkeluar.setText("KELUAR");
        btnkeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnkeluarActionPerformed(evt);
            }
        });

        tblpelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Pelanggan", "Nama Pelanggan", "Alamat", "Nomoe Telepon"
            }
        ));
        tblpelanggan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblpelangganMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblpelanggan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(279, 279, 279)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(btnsimpan))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnedit)
                        .addGap(60, 60, 60)
                        .addComponent(btnhapus)
                        .addGap(54, 54, 54)
                        .addComponent(btnkeluar)
                        .addGap(75, 582, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtidpelanggan)
                                .addComponent(txtnmpelanggan, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))
                            .addComponent(txtnotlp, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtidpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtnmpelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtnotlp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(123, 123, 123)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnedit)
                    .addComponent(btnhapus)
                    .addComponent(btnkeluar)
                    .addComponent(btnsimpan))
                .addGap(0, 263, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtidpelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidpelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidpelangganActionPerformed

    private void txtnmpelangganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnmpelangganActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnmpelangganActionPerformed

    private void btnsimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsimpanActionPerformed
 simpan();
 clear();    // TODO add your handling code here:
    }//GEN-LAST:event_btnsimpanActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
    try {
    String idpelanggan = txtidpelanggan.getText();
    String nmpelanggan = txtnmpelanggan.getText();
    String alamat = txtalamat.getText();
    String nohp= txtnotlp.getText();
    String sql = "update pelanggan set PelangganID='"+idpelanggan+"', NamaPelanggan='"+nmpelanggan+"', Alamat='"+alamat+"', NomorTelepon='"+nohp+"' where PelangganID='"+idpelanggan+"'";
    pst =konek.prepareStatement(sql);
    pst.execute();
    JOptionPane.showMessageDialog(null, "Data Berhasil Diupdate");
    
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}
updateTabel();
clear();       // TODO add your handling code here:
    }//GEN-LAST:event_btneditActionPerformed

    private void btnhapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnhapusActionPerformed
    try {
    String sql = "delete from pelanggan where PelangganID=?";
    pst =konek.prepareStatement(sql);
    pst.setString(1, txtidpelanggan.getText());
    pst.execute();
    JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);
}
updateTabel();
clear();        // TODO add your handling code here:
                                     
      // TODO add your handling code here:
    }//GEN-LAST:event_btnhapusActionPerformed

    private void btnkeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnkeluarActionPerformed
     this.dispose();         // TODO add your handling code here:
    }//GEN-LAST:event_btnkeluarActionPerformed

    private void tblpelangganMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblpelangganMouseClicked
    try {
    int baris = tblpelanggan.getSelectedRow();
    String tabelKlik = (tblpelanggan.getModel().getValueAt(baris, 0).toString());
    String sql = "select * from pelanggan where PelangganID='"+tabelKlik+"'";
    pst = konek.prepareStatement(sql);
    rst = pst.executeQuery();
    if (rst.next()) {
        String dataidpelanggan = rst.getString(("PelangganID"));
        txtidpelanggan.setText(dataidpelanggan);
        String datanmpelanggan = rst.getString(("NamaPelanggan"));
        txtnmpelanggan.setText(datanmpelanggan);
        String dataalamat = rst.getString(("Alamat"));
        txtalamat.setText(dataalamat);
        String datanohp= rst.getString(("NomorTelepon"));
        txtnotlp.setText(datanohp);
    }
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e);  
}// TODO add your handling code here:
    }//GEN-LAST:event_tblpelangganMouseClicked

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
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPelanggan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPelanggan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnhapus;
    private javax.swing.JButton btnkeluar;
    private javax.swing.JButton btnsimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblpelanggan;
    private javax.swing.JTextArea txtalamat;
    private javax.swing.JTextField txtidpelanggan;
    private javax.swing.JTextField txtnmpelanggan;
    private javax.swing.JTextField txtnotlp;
    // End of variables declaration//GEN-END:variables
}
