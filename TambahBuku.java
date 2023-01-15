/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lil uzoy
 */
public class TambahBuku extends javax.swing.JFrame {

    PreparedStatement insert;
    Connection con;
    
    public TambahBuku() {
        initComponents();
        table_update();
        autoID();
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
        kode_buku = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        kmbli = new javax.swing.JButton();
        txtpenulis = new javax.swing.JTextField();
        txtthn_terbit = new javax.swing.JTextField();
        tambah = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btl = new javax.swing.JButton();
        txtpenerbit = new javax.swing.JTextField();
        edit = new javax.swing.JButton();
        hapus = new javax.swing.JButton();
        jbuku = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(860, 595));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Tambah Buku"));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel1.setText("Kode Buku");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(20, 50, 130, 26);

        kode_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kode_bukuActionPerformed(evt);
            }
        });
        jPanel1.add(kode_buku);
        kode_buku.setBounds(170, 50, 140, 30);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel2.setText("Penulis");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(20, 130, 130, 26);

        kmbli.setBackground(new java.awt.Color(204, 204, 255));
        kmbli.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kmbli.setText("Kembali");
        kmbli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kmbli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kmbliActionPerformed(evt);
            }
        });
        jPanel1.add(kmbli);
        kmbli.setBounds(240, 330, 80, 35);
        jPanel1.add(txtpenulis);
        txtpenulis.setBounds(170, 130, 140, 30);
        jPanel1.add(txtthn_terbit);
        txtthn_terbit.setBounds(170, 210, 140, 30);

        tambah.setBackground(new java.awt.Color(204, 204, 255));
        tambah.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        tambah.setText("Tambah");
        tambah.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        tambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tambahActionPerformed(evt);
            }
        });
        jPanel1.add(tambah);
        tambah.setBounds(10, 310, 106, 35);

        jLabel4.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel4.setText("Penerbit");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(20, 170, 130, 26);

        btl.setBackground(new java.awt.Color(204, 204, 255));
        btl.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btl.setText("Batal");
        btl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btlActionPerformed(evt);
            }
        });
        jPanel1.add(btl);
        btl.setBounds(130, 310, 99, 35);

        txtpenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpenerbitActionPerformed(evt);
            }
        });
        jPanel1.add(txtpenerbit);
        txtpenerbit.setBounds(170, 170, 140, 30);

        edit.setBackground(new java.awt.Color(204, 204, 255));
        edit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        edit.setText("Edit");
        edit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        edit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editMouseClicked(evt);
            }
        });
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel1.add(edit);
        edit.setBounds(10, 360, 106, 31);

        hapus.setBackground(new java.awt.Color(204, 204, 255));
        hapus.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        hapus.setText("Hapus");
        hapus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        hapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusActionPerformed(evt);
            }
        });
        jPanel1.add(hapus);
        hapus.setBounds(130, 360, 99, 30);
        jPanel1.add(jbuku);
        jbuku.setBounds(170, 90, 140, 30);

        jLabel5.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel5.setText("Judul Buku");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 90, 130, 26);

        jLabel9.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabel9.setText("Tahun Terbit");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(20, 210, 120, 26);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Buku", "Judul Buku", "Penulis", "Penerbit", "Tahun Terbit", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(350, 30, 500, 388);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/tambah_buku.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(-3, -4, 880, 620);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-4, -4, 870, 620);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable1.getModel();
        int selectIndex = jTable1.getSelectedRow();
         
        kode_buku.setText(d1.getValueAt(selectIndex, 0).toString());
        jbuku.setText(d1.getValueAt(selectIndex, 1).toString());
        txtpenulis.setText(d1.getValueAt(selectIndex, 2).toString());
        txtpenerbit.setText(d1.getValueAt(selectIndex, 3).toString());
        txtthn_terbit.setText(d1.getValueAt(selectIndex, 4).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void kmbliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kmbliActionPerformed
        // TODO add your handling code here:
        Main m = new Main();
        this.hide();
        m.setVisible(true);
    }//GEN-LAST:event_kmbliActionPerformed

    private void hapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        try {
            String id = model.getValueAt(selectedIndex, 0).toString();
            int dialogResult = JOptionPane.showConfirmDialog (null, "Data akan di Hapus","Warning",JOptionPane.YES_NO_OPTION);
            if(dialogResult == JOptionPane.YES_OPTION){

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan_sekolah","root","");
                insert = con.prepareStatement("delete from daftar_buku where kode_buku = ?");

                insert.setString(1,id);
                insert.executeUpdate();
                JOptionPane.showMessageDialog(this, "Data Terhapus!");

                edit.setEnabled(false);
                table_update();

            }
            tambah.setEnabled(true);
            edit.setEnabled(false);
        }catch (ClassNotFoundException ex){
            Logger.getLogger(TambahBuku.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex){
            Logger.getLogger(TambahBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_hapusActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        try {
            String kodebuku = model.getValueAt(selectedIndex, 0).toString();
            String judulbuku=jbuku.getText();
            String namapenulis =txtpenulis.getText();
            String namapenerbit =txtpenerbit.getText();
            String thnterbits = txtthn_terbit.getText();

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan_sekolah","root","");
            insert = con.prepareStatement("update daftar_buku set judul= ?,penulis= ?,penerbit= ?,tahun_terbit= ? where kode_buku = ?");

            insert.setString(1,judulbuku);
            insert.setString(2,namapenulis);
            insert.setString(3, namapenerbit);
            insert.setString(4,thnterbits);
            insert.setString(5,kodebuku);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Diperbaharui!");

            insert.executeUpdate();
            edit.setEnabled(true);
            tambah.setEnabled(true);
            table_update();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TambahBuku.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TambahBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editActionPerformed

    private void editMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editMouseClicked
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        String kobuku = model.getValueAt(selectedIndex, 0).toString();
        String judulbuku =jbuku.getText();
        String penulisnama =txtpenulis.getText();
        String penerbitnama =txtpenerbit.getText();
        String tahuntbt=txtthn_terbit.getText();

        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan_sekolah","root","");
            insert = con.prepareStatement("update daftar_buku set judul= ?,penulis= ?,penerbit= ?,tahun_terbit= ? where kode_buku = ?");

            insert.setString(1,judulbuku);
            insert.setString(2,penulisnama);
            insert.setString(3, penerbitnama);
            insert.setString(4,tahuntbt);
            insert.setString(5,kobuku);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Diperbaharui!");

            edit.setEnabled(false);
            tambah.setEnabled(true);

        }catch (ClassNotFoundException ex){
            Logger.getLogger(TambahBuku.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex){
            Logger.getLogger(TambahBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_editMouseClicked

    private void txtpenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpenerbitActionPerformed

    private void btlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btlActionPerformed
        // TODO add your handling code here:
        kode_buku.setText("");
        jbuku.setText("");
        txtpenulis.setText("");
        txtpenerbit.setText("");
        txtthn_terbit.setText("");
    }//GEN-LAST:event_btlActionPerformed

    private void tambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tambahActionPerformed
        // TODO add your handling code here:
        try {
            String kbuku =kode_buku.getText();
            String judul=jbuku.getText();
            String pnulis =txtpenulis.getText();
            String pnerbit =txtpenerbit.getText();
            String tterbit =txtthn_terbit.getText();

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan_sekolah","root","");
            insert = con.prepareStatement("insert into daftar_buku (kode_buku,judul,penulis,penerbit,tahun_terbit,status)values(?,?,?,?,?,'Tersedia')");
            insert.setString(1,kbuku);
            insert.setString(2,judul);
            insert.setString(3,pnulis);
            insert.setString(4,pnerbit);
            insert.setString(5, tterbit);

            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data Tersimpan");

            jbuku.setText("");
            txtthn_terbit.setText("");
            txtpenulis.setText("");
            txtpenerbit.setText("");
            table_update();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(TambahBuku.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(TambahBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tambahActionPerformed
                                   
    private void kode_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kode_bukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kode_bukuActionPerformed
    public void autoID(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan_sekolah","root","");
            Statement s = con.createStatement();
            
            ResultSet rs = s.executeQuery("select Max(kode_buku) from daftar_buku");
            rs.next();
            rs.getString("Max(kode_buku)");
            
            if(rs.getString("Max(kode_buku)")==null){               
                kode_buku.setText("A0001");             
            }else{
                long id =  Long.parseLong(rs.getString("Max(kode_buku)").substring(2,rs.getString("Max(kode_buku)").length()));
                id++;       
                kode_buku.setText("A0" + String.format("%03d", id));            
            }     
        }catch (ClassNotFoundException ex){
            Logger.getLogger(TambahBuku.class.getName()).log(Level.SEVERE, null, ex);
        }catch (SQLException ex){
            Logger.getLogger(TambahBuku.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    private void table_update() {
        int CC;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan_sekolah","root","");
            insert = con.prepareStatement("SELECT * FROM daftar_buku");
            ResultSet Rs = insert.executeQuery();
            ResultSetMetaData RSMD = Rs.getMetaData();
            CC = RSMD.getColumnCount();
            DefaultTableModel DFT = (DefaultTableModel) jTable1.getModel();
            DFT.setRowCount(0);

            while (Rs.next()) {
                Vector v2 = new Vector();
                for (int ii = 1; ii <= CC; ii++) {
                    v2.add(Rs.getString("kode_buku"));
                    v2.add(Rs.getString("judul"));
                    v2.add(Rs.getString("penulis"));
                    v2.add(Rs.getString("penerbit"));
                    v2.add(Rs.getString("tahun_terbit"));
                    v2.add(Rs.getString("status"));
                }
                DFT.addRow(v2);
            }
        } catch (Exception e) {
        }
    }
    
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
            java.util.logging.Logger.getLogger(TambahBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TambahBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TambahBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TambahBuku.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TambahBuku().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btl;
    private javax.swing.JButton edit;
    private javax.swing.JButton hapus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jbuku;
    private javax.swing.JButton kmbli;
    private javax.swing.JTextField kode_buku;
    private javax.swing.JButton tambah;
    private javax.swing.JTextField txtpenerbit;
    private javax.swing.JTextField txtpenulis;
    private javax.swing.JTextField txtthn_terbit;
    // End of variables declaration//GEN-END:variables
}
