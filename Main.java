/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tubes;

/**
 *
 * @author lil uzoy
 */
public class Main extends javax.swing.JFrame {
    public Main() {
        initComponents();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dbuku = new javax.swing.JButton();
        aperpus = new javax.swing.JButton();
        sebuku = new javax.swing.JButton();
        pebuku = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        keluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(866, 547));
        getContentPane().setLayout(null);

        dbuku.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        dbuku.setText("DAFTAR BUKU");
        dbuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        dbuku.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        dbuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dbukuActionPerformed(evt);
            }
        });
        getContentPane().add(dbuku);
        dbuku.setBounds(20, 100, 180, 70);

        aperpus.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        aperpus.setText("ANGGOTA PERPUSTAKAAN");
        aperpus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        aperpus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        aperpus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aperpusActionPerformed(evt);
            }
        });
        getContentPane().add(aperpus);
        aperpus.setBounds(20, 180, 180, 60);

        sebuku.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        sebuku.setText("SEWA BUKU");
        sebuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sebuku.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        sebuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sebukuActionPerformed(evt);
            }
        });
        getContentPane().add(sebuku);
        sebuku.setBounds(20, 260, 180, 60);

        pebuku.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        pebuku.setText("PENGEMBALIAN");
        pebuku.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pebuku.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pebuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pebukuActionPerformed(evt);
            }
        });
        getContentPane().add(pebuku);
        pebuku.setBounds(20, 340, 180, 60);

        jLabel1.setFont(new java.awt.Font("Microsoft Uighur", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PERPUSTAKAAN SEKOLAH");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(250, 10, 450, 70);

        keluar.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        keluar.setText("KELUAR");
        keluar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        keluar.setHideActionText(true);
        keluar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        keluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keluarActionPerformed(evt);
            }
        });
        getContentPane().add(keluar);
        keluar.setBounds(20, 420, 180, 60);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(100, 20, 140, 70);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/6096787_3143372.jpg"))); // NOI18N
        jLabel4.setMinimumSize(new java.awt.Dimension(710, 768));
        jLabel4.setPreferredSize(new java.awt.Dimension(710, 768));
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-3, -4, 920, 520);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dbukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dbukuActionPerformed
        // TODO add your handling code here:
        TambahBuku add = new TambahBuku();
        this.hide();
        add.setVisible(true);
    }//GEN-LAST:event_dbukuActionPerformed

    private void aperpusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aperpusActionPerformed
        // TODO add your handling code here:
         AnggotaPerpustakaan add = new AnggotaPerpustakaan();
         this.hide();
        add.setVisible(true);
    }//GEN-LAST:event_aperpusActionPerformed

    private void sebukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sebukuActionPerformed
        // TODO add your handling code here:
        Peminjaman add = new Peminjaman();
        this.hide();
        add.setVisible(true);
    }//GEN-LAST:event_sebukuActionPerformed

    private void pebukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pebukuActionPerformed
        // TODO add your handling code here:
        Pengembalian add = new Pengembalian();
        this.hide();
        add.setVisible(true);
    }//GEN-LAST:event_pebukuActionPerformed

    private void keluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_keluarActionPerformed
        // TODO add your handling code here:
        Login lo = new Login();       
            this.hide();
        lo.setVisible(true);
    }//GEN-LAST:event_keluarActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aperpus;
    private javax.swing.JButton dbuku;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton keluar;
    private javax.swing.JButton pebuku;
    private javax.swing.JButton sebuku;
    // End of variables declaration//GEN-END:variables
}