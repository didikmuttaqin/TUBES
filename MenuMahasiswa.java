/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemta;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Fitra
 */
public class MenuMahasiswa extends javax.swing.JFrame {

    connection kon = new connection();
    /**
     * Creates new form MenuMahasiswa
     */
    public MenuMahasiswa() {
        initComponents();
        tampildosen();
        tampiljudul();
        tampilmahasiswa();
        tampilpesandosen();
        tampilpesannim();
        setTitle("MENU MAHASISWA");
    }

        public void tampildosen(){
        java.sql.Statement st = kon.sambung();
        String tampil = "select * from dosen ";
        ArrayList<String> groupNames = new ArrayList<String>();
        try {
           ResultSet rs = st.executeQuery(tampil);
            int i = 0;
            while (rs.next()) {
                String groupName = rs.getString("Nama_Dosen"); 
    // add group names to the array list
                groupNames.add(groupName);
                i++;
            }
            DefaultComboBoxModel model = new DefaultComboBoxModel(groupNames.toArray());
            combodosen.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
        public void tampiljudul(){
        java.sql.Statement st = kon.sambung();
        String tampil = "select * from mahasiswa ";
        ArrayList<String> groupNames = new ArrayList<String>();
        try {
           ResultSet rs = st.executeQuery(tampil);
            int i = 0;
            while (rs.next()) {
                String groupName = rs.getString("Judul"); 
    // add group names to the array list
                groupNames.add(groupName);
                i++;
            }
            DefaultComboBoxModel model = new DefaultComboBoxModel(groupNames.toArray());
            combojudul.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
          public void tampilpesandosen(){
        java.sql.Statement st = kon.sambung();
        String tampil = "select * from dosen ";
        ArrayList<String> groupNames = new ArrayList<String>();
        try {
           ResultSet rs = st.executeQuery(tampil);
            int i = 0;
            while (rs.next()) {
                String groupName = rs.getString("Nama_Dosen"); 
    // add group names to the array list
                groupNames.add(groupName);
                i++;
            }
            DefaultComboBoxModel model = new DefaultComboBoxModel(groupNames.toArray());
            combopesandosen.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
           public void tampilpesannim(){
        java.sql.Statement st = kon.sambung();
        String tampil = "select * from mahasiswa ";
        ArrayList<String> groupNames = new ArrayList<String>();
        try {
           ResultSet rs = st.executeQuery(tampil);
            int i = 0;
            while (rs.next()) {
                String groupName = rs.getString("NIM"); 
    // add group names to the array list
                groupNames.add(groupName);
                i++;
            }
            DefaultComboBoxModel model = new DefaultComboBoxModel(groupNames.toArray());
            combopesannim.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(MenuAdmin.class.getName()).log(Level.SEVERE, null, ex);
        }   
    }
        public void tampilmahasiswa(){
        java.sql.Statement st = kon.sambung();      
        String tampil = "select * from mahasiswa";
           ResultSet rs;
        try {
            rs = st.executeQuery(tampil);
            int i = 0;
            while (rs.next()) {
                TabelDaftarMahasiswa.setValueAt(rs.getString("NIM"), i, 0);
                TabelDaftarMahasiswa.setValueAt(rs.getString("Nama"), i, 1);
                TabelDaftarMahasiswa.setValueAt(rs.getString("Jurusan"), i, 2);
                TabelDaftarMahasiswa.setValueAt(rs.getString("Kelas"), i, 3);
                TabelDaftarMahasiswa.setValueAt(rs.getString("Judul"), i, 4);
                TabelDaftarMahasiswa.setValueAt(rs.getString("Dosen"), i, 5);
                TabelDaftarMahasiswa.setValueAt(rs.getString("Status"), i, 6);
                TabelDaftarMahasiswa.setValueAt(rs.getString("Nilai"), i, 7);
                i++;
            }
        }catch (SQLException ex) {
            Logger.getLogger(MenuMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }   
       }
        
        public void hapusinputmahasiswa() {
        InsertNIM.setText("");
        InsertNama.setText("");
        InsertJurusan.setText("");
        InsertKelas.setText("");
        InsertJudul.setText("");
        combodosen.setSelectedItem("");
    }
        public void hapuspesan() {
        combopesannim.setSelectedItem("");
        combopesandosen.setSelectedItem("");
        isipesan.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jTextField4 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        InsertNIM = new javax.swing.JTextField();
        InsertNama = new javax.swing.JTextField();
        InsertJurusan = new javax.swing.JTextField();
        InsertKelas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        combojudul = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        InsertJudul = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        combodosen = new javax.swing.JComboBox();
        Simpan = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelDaftarMahasiswa = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        combopesandosen = new javax.swing.JComboBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        isipesan = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        combopesannim = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();

        jTextField4.setText("jTextField4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setText("NIM");

        jLabel2.setText("Nama");

        jLabel3.setText("Jurusan");

        jLabel4.setText("Kelas");

        jLabel5.setText("Daftar Judul TA/PA yang sudah ada :");

        jLabel6.setText("Masukkan Judul");

        jLabel7.setText("Pilih Dosen");

        combodosen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodosenActionPerformed(evt);
            }
        });

        Simpan.setText("Simpan");
        Simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SimpanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(InsertNama, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(InsertJurusan, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InsertNIM, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(InsertKelas)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(combodosen, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(InsertJudul, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(combojudul, javax.swing.GroupLayout.Alignment.TRAILING, 0, 235, Short.MAX_VALUE))
                            .addComponent(Simpan))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(InsertNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(InsertNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(InsertJurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(InsertKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(combojudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(InsertJudul, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(combodosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Simpan)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Registrasi ", jPanel1);

        TabelDaftarMahasiswa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "NIM", "Nama", "Jurusan", "Kelas", "Judul", "Dosen", "Status", "Nilai"
            }
        ));
        jScrollPane1.setViewportView(TabelDaftarMahasiswa);

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Message              :");

        isipesan.setColumns(20);
        isipesan.setRows(5);
        jScrollPane2.setViewportView(isipesan);

        jLabel9.setText("Pilih Dosen           :");

        jButton3.setText("Kirim Pesan");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setText("Pilih NIM Anda     :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(combopesandosen, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combopesannim, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jButton1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(combopesandosen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(combopesannim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton3)
                .addGap(175, 175, 175))
        );

        jTabbedPane1.addTab("Daftar Mahasiswa", jPanel2);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void combodosenActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void SimpanActionPerformed(java.awt.event.ActionEvent evt) {                                       
        // TODO add your handling code here:
        java.sql.Statement st = kon.sambung();
        String status = "Belum ACC";
        String nilai = " ";
        String sql = "insert into mahasiswa values ('" + InsertNIM.getText() + "','" + InsertNama.getText()  + "','" + InsertJurusan.getText()  + "','" + InsertKelas.getText()  +"','" + InsertJudul.getText()  + "','" + combodosen.getSelectedItem().toString() + "','" + status + "','" + nilai + "')";
        try {
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Data Berhasil Disimpan !!");
            hapusinputmahasiswa();
        } catch (SQLException ex) {
            Logger.getLogger(MenuMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }                                      

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.setVisible(false);
        new Login().setVisible(true);
    }                                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        this.setVisible(false);
        new MenuMahasiswa().setVisible(true);
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
        java.sql.Statement st = kon.sambung();
        String sql = "insert into message values ('" + combopesannim.getSelectedItem()+ "','" + combopesandosen.getSelectedItem()+ "','" + isipesan.getText()  + "')";
        try {
            st.executeUpdate(sql);
            hapuspesan();
            JOptionPane.showMessageDialog(null, "Pesan Terkirim !!");
        } catch (SQLException ex) {
            Logger.getLogger(MenuMahasiswa.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(MenuMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuMahasiswa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuMahasiswa().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JTextField InsertJudul;
    private javax.swing.JTextField InsertJurusan;
    private javax.swing.JTextField InsertKelas;
    private javax.swing.JTextField InsertNIM;
    private javax.swing.JTextField InsertNama;
    private javax.swing.JButton Simpan;
    private javax.swing.JTable TabelDaftarMahasiswa;
    private javax.swing.JComboBox combodosen;
    private javax.swing.JComboBox combojudul;
    private javax.swing.JComboBox combopesandosen;
    private javax.swing.JComboBox combopesannim;
    private javax.swing.JTextArea isipesan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration                   
}
