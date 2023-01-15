/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author lil uzoy
 */
public class Peminjaman extends javax.swing.JFrame {
    public Peminjaman() {
        initComponents();
        LoadCategory();
        txtdate.setDateFormatString("yyyy/MM/dd");
        txtdue.setDateFormatString("yyyy/MM/dd");
    }

    Connection con;
    PreparedStatement pst = null;
    PreparedStatement pst1 = null;
    PreparedStatement pst2 = null;
    ResultSet rs;
    ResultSet rs1;

    public void LoadCategory() {
       try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan_sekolah", "root", "");
            pst = con.prepareStatement("SELECT * FROM daftar_buku");
            
            rs = pst.executeQuery();
            kodebuk.removeAllItems();
            while (rs.next()) {
                kodebuk.addItem(rs.getString(1));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
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
        kodebuk = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtpenerbit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tahun_terbit = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        batal = new javax.swing.JButton();
        txtavl = new javax.swing.JTextField();
        kembali = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtdate = new com.toedter.calendar.JDateChooser();
        txtdue = new com.toedter.calendar.JDateChooser();
        jLabel6 = new javax.swing.JLabel();
        simpan = new javax.swing.JButton();
        txtjudul_buku = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtpenulis = new javax.swing.JTextField();
        txtjml = new javax.swing.JTextField();
        jmlhari = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        txtnis = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtnama_peminjam = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 800));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        kodebuk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kodebukActionPerformed(evt);
            }
        });
        jPanel1.add(kodebuk);
        kodebuk.setBounds(140, 20, 180, 28);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setText("Kode Buku");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(10, 20, 100, 20);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Penerbit");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(10, 140, 70, 30);

        txtpenerbit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpenerbitActionPerformed(evt);
            }
        });
        txtpenerbit.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtpenerbitKeyPressed(evt);
            }
        });
        jPanel1.add(txtpenerbit);
        txtpenerbit.setBounds(140, 140, 180, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Tahun Terbit");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 180, 90, 30);
        jPanel1.add(tahun_terbit);
        tahun_terbit.setBounds(140, 180, 180, 30);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Tanggal Pinjam");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 300, 110, 30);

        jLabel5.setText("-");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(350, 310, 30, 20);

        batal.setBackground(new java.awt.Color(204, 204, 255));
        batal.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        batal.setText("Batal");
        batal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        batal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                batalActionPerformed(evt);
            }
        });
        jPanel1.add(batal);
        batal.setBounds(300, 470, 88, 37);

        txtavl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtavlActionPerformed(evt);
            }
        });
        jPanel1.add(txtavl);
        txtavl.setBounds(410, 80, 110, 30);

        kembali.setBackground(new java.awt.Color(204, 204, 255));
        kembali.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        kembali.setText("Kembali");
        kembali.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembaliActionPerformed(evt);
            }
        });
        jPanel1.add(kembali);
        kembali.setBounds(400, 470, 89, 37);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Status Buku");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(410, 50, 110, 22);

        txtdate.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtdatePropertyChange(evt);
            }
        });
        jPanel1.add(txtdate);
        txtdate.setBounds(139, 300, 180, 30);

        txtdue.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                txtduePropertyChange(evt);
            }
        });
        jPanel1.add(txtdue);
        txtdue.setBounds(380, 300, 160, 30);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Judul Buku");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 60, 90, 30);

        simpan.setBackground(new java.awt.Color(204, 204, 255));
        simpan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        simpan.setText("Ok");
        simpan.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                simpanActionPerformed(evt);
            }
        });
        jPanel1.add(simpan);
        simpan.setBounds(200, 470, 88, 37);

        txtjudul_buku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtjudul_bukuActionPerformed(evt);
            }
        });
        jPanel1.add(txtjudul_buku);
        txtjudul_buku.setBounds(140, 60, 180, 30);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel9.setText("Penulis");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 100, 90, 30);
        jPanel1.add(txtpenulis);
        txtpenulis.setBounds(140, 100, 180, 30);
        jPanel1.add(txtjml);
        txtjml.setBounds(139, 340, 180, 30);

        jmlhari.setBackground(new java.awt.Color(204, 204, 255));
        jmlhari.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jmlhari.setText("Hari Pinjam");
        jmlhari.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jmlhari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmlhariActionPerformed(evt);
            }
        });
        jPanel1.add(jmlhari);
        jmlhari.setBounds(10, 340, 90, 30);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("NIS");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 220, 90, 30);

        txtnis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnisActionPerformed(evt);
            }
        });
        txtnis.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnisKeyPressed(evt);
            }
        });
        jPanel1.add(txtnis);
        txtnis.setBounds(140, 220, 180, 30);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel11.setText("Nama Peminjam");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 260, 90, 30);

        txtnama_peminjam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnama_peminjamActionPerformed(evt);
            }
        });
        jPanel1.add(txtnama_peminjam);
        txtnama_peminjam.setBounds(140, 260, 180, 30);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/pinjam_buku.jpg"))); // NOI18N
        jLabel12.setText("jLabel12");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(3, 0, 620, 540);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(-4, -1, 630, 550);
        getContentPane().add(jLabel10);
        jLabel10.setBounds(0, 0, 520, 450);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmlhariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmlhariActionPerformed
        // TODO add your handling code here:
        try{
            SimpleDateFormat date = new SimpleDateFormat("dd-MM-yyyy");
            String tanggal1 = String.valueOf(date.format(txtdate.getDate()));
            Date TglPinjam = (Date) date.parse(tanggal1);

            String tanggal2 = String.valueOf(date.format(txtdue.getDate()));
            Date TglKembali = (Date) date.parse(tanggal2);

            long jmlhari = Math.abs(TglKembali.getTime() - TglPinjam.getTime());
            txtjml.setText(""+ TimeUnit.MILLISECONDS.toDays(jmlhari));
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jmlhariActionPerformed

    private void txtjudul_bukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtjudul_bukuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtjudul_bukuActionPerformed

    private void simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_simpanActionPerformed
        // TODO add your handling code here:
        try {
            String kodebuku = kodebuk.getSelectedItem().toString();
            String judul = txtjudul_buku.getText();
            String penulis = txtpenulis.getText();
            String penerbit = txtpenerbit.getText();
            String tterbit = tahun_terbit.getText();
            String nis = txtnis.getText();
            String namapeminjam = txtnama_peminjam.getText();
            SimpleDateFormat Date_Format = new SimpleDateFormat("yyyy/MM/dd");
            String date = Date_Format.format(txtdate.getDate());
            SimpleDateFormat Date_Format1 = new SimpleDateFormat("yyyy/MM/dd");
            String date2 = Date_Format1.format(txtdue.getDate());
            String hpinjam = txtjml.getText();

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan_sekolah", "root","");
            pst = con.prepareStatement("insert into peminjaman (kode_buku,judul_buku,penulis,penerbit,tahun_terbit,nis,nama_peminjam,date,due,total_hari)values(?,?,?,?,?,?,?,?,?,?)");
            pst.setString(1, kodebuku);
            pst.setString(2, judul);
            pst.setString(3, penulis);
            pst.setString(4, penerbit);
            pst.setString(5, tterbit);
            pst.setString(6, nis);
            pst.setString(7, namapeminjam);
            pst.setString(8, date);
            pst.setString(9, date2);
            pst.setString(10, hpinjam);
            pst.executeUpdate();

            pst1 = con.prepareStatement("update daftar_buku set status = 'Dipinjam' where kode_buku = ?  ");
            pst1.setString(1, kodebuku);
            pst1.executeUpdate();

            JOptionPane.showMessageDialog(this, "Data Tersimpan");

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Peminjaman.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Peminjaman.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_simpanActionPerformed

    private void txtduePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtduePropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_txtduePropertyChange

    private void txtdatePropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_txtdatePropertyChange
        // TODO add your handling code here:

    }//GEN-LAST:event_txtdatePropertyChange

    private void kembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembaliActionPerformed
        // TODO add your handling code here:
        Main m = new Main();
        this.hide();
        m.setVisible(true);
    }//GEN-LAST:event_kembaliActionPerformed

    private void batalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_batalActionPerformed
        // TODO add your handling code here:
        kodebuk.getSelectedItem().toString();
        txtjudul_buku.setText("");
        txtpenulis.setText("");
        txtpenerbit.setText("");
        tahun_terbit.setText("");
        txtnis.setText("");
        txtnama_peminjam.setText("");
        txtjml.setText("");
        txtdate.setCalendar(null);
        txtdue.setCalendar(null);
    }//GEN-LAST:event_batalActionPerformed

    private void txtpenerbitKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpenerbitKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpenerbitKeyPressed

    private void txtpenerbitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpenerbitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpenerbitActionPerformed

    private void kodebukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kodebukActionPerformed
        // TODO add your handling code here:
        try {
            String kode_buku = kodebuk.getSelectedItem().toString();

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan_sekolah", "root", "");
            pst2 = con.prepareStatement("SELECT * FROM daftar_buku WHERE kode_buku = ? ");
            pst2.setString(1, kode_buku);
            rs1 = pst2.executeQuery();

            if (rs1.next() == false){
                JOptionPane.showMessageDialog(null, "Buku Tidak Tersedia");
            }else{
                String jdlbuku = rs1.getString("judul");
                String penuliz = rs1.getString("penulis");
                String penerbits = rs1.getString("penerbit");
                String thnterbit = rs1.getString("tahun_terbit");
                String Tersedia = rs1.getString("status");
                
                txtjudul_buku.setText(jdlbuku.trim());
                txtpenulis.setText(penuliz.trim());
                txtpenerbit.setText(penerbits.trim());
                tahun_terbit.setText(thnterbit.trim());
                txtavl.setText(Tersedia.trim());
                
                if (Tersedia.equals("Tersedia")){
                    txtavl.setEnabled(false);
                    txtpenerbit.setEnabled(true);
                    txtjudul_buku.setEnabled(true);
                    txtpenulis.setEnabled(true);
                    tahun_terbit.setEnabled(true);
                    txtdate.setEnabled(true);
                    txtdue.setEnabled(true);
                    txtnis.setEnabled(true);
                    txtnama_peminjam.setEnabled(true);
                }else{
                    txtavl.setEnabled(false);
                    txtpenerbit.setEnabled(false);
                    txtjudul_buku.setEnabled(false);
                    txtpenulis.setEnabled(false);
                    tahun_terbit.setEnabled(false);
                    txtdate.setEnabled(false);
                    txtdue.setEnabled(false);
                    txtnis.setEnabled(false);
                    txtnama_peminjam.setEnabled(false);
                }
            }
        }catch (ClassNotFoundException ex){
            Logger.getLogger(AnggotaPerpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }catch(SQLException ex){
            Logger.getLogger(AnggotaPerpustakaan.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_kodebukActionPerformed

    private void txtavlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtavlActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtavlActionPerformed

    private void txtnama_peminjamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnama_peminjamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnama_peminjamActionPerformed

    private void txtnisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnisActionPerformed

    private void txtnisKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnisKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            try {
                String id = txtnis.getText();

                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/perpustakaan_sekolah", "root", "");
                pst = con.prepareStatement("select * from anggota_perpus where nis = ? ");
                pst.setString(1, id);
                rs = pst.executeQuery();

                if (rs.next() == false){
                    JOptionPane.showMessageDialog(null, "Anggota Tidak Tersedia");
                }else{
                    String productname = rs.getString("nama");
                    txtnama_peminjam.setText(productname.trim());
                }
            }catch(ClassNotFoundException ex){
                Logger.getLogger(AnggotaPerpustakaan.class.getName()).log(Level.SEVERE, null, ex);
            }catch(SQLException ex){
                Logger.getLogger(AnggotaPerpustakaan.class.getName()).log(Level.SEVERE, null, ex);
            }
        } 
    }//GEN-LAST:event_txtnisKeyPressed

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())){
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Peminjaman.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Peminjaman().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton batal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jmlhari;
    private javax.swing.JButton kembali;
    private javax.swing.JComboBox kodebuk;
    private javax.swing.JButton simpan;
    private javax.swing.JTextField tahun_terbit;
    private javax.swing.JTextField txtavl;
    private com.toedter.calendar.JDateChooser txtdate;
    private com.toedter.calendar.JDateChooser txtdue;
    private javax.swing.JTextField txtjml;
    private javax.swing.JTextField txtjudul_buku;
    private javax.swing.JTextField txtnama_peminjam;
    private javax.swing.JTextField txtnis;
    private javax.swing.JTextField txtpenerbit;
    private javax.swing.JTextField txtpenulis;
    // End of variables declaration//GEN-END:variables
}
