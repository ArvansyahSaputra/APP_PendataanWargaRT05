package Report;

import Component.*;
import java.io.File;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import kelompokan.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashMap;
import Component.DataPengurusNew;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

public class laporan_data_pengurus extends javax.swing.JPanel {
    Connection conn;
    public laporan_data_pengurus() {
        initComponents();
        koneksi k = new koneksi(); // membuat objek dari class koneksi
        conn = k.connect();        // mendapatkan koneksi dari method connect()
        tampilData();  
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tPengurus = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        tCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnPrint = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(757, 645));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(768, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pengurus.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Report Data Pengurus");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogOut.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 925, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1130, 50);

        jPanel2.setBackground(new java.awt.Color(94, 89, 128));
        jPanel2.setPreferredSize(new java.awt.Dimension(757, 100));

        tPengurus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tPengurus);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1110, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(jPanel2);
        jPanel2.setBounds(0, 90, 1130, 550);

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        btnCari.setBackground(new java.awt.Color(38, 50, 56));
        btnCari.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnCari.setForeground(new java.awt.Color(255, 255, 255));
        btnCari.setText("Cari");
        btnCari.setPreferredSize(new java.awt.Dimension(63, 23));
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnPrint.setText("Print");
        btnPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrintActionPerformed(evt);
            }
        });

        btnTambah.setText("Tambah Data");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnPrint)
                .addGap(18, 18, 18)
                .addComponent(btnTambah)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 611, Short.MAX_VALUE)
                .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPrint, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel3);
        jPanel3.setBounds(0, 50, 1130, 40);
    }// </editor-fold>//GEN-END:initComponents
    private void tampilData() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID Pengurus");
        model.addColumn("Nama Pengurus");
        model.addColumn("Jenis Kelamin");
        model.addColumn("No Handphone");
        model.addColumn("Alamat");
        model.addColumn("Jabatan");
        model.addColumn("Wilayah RT");
        model.addColumn("Wilayah RW");
        model.addColumn("Tgl.Mulai Jabatan");
        model.addColumn("Tgl.Selesai Jabatan");
        try {
            String sql = "SELECT * FROM data_pengurus";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[] {
                    rs.getString("id_pengurus"),
                    rs.getString("nama_pengurus"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("no_hp"),
                    rs.getString("alamat"),
                    rs.getString("jabatan"),
                    rs.getString("wilayah_rt"),
                    rs.getString("wilayah_rw"),
                    rs.getString("mulai_menjabat"),
                    rs.getString("selesai_menjabat")
                });
            }
            tPengurus.setModel(model); // tableWarga adalah nama JTable
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menampilkan data: " + e.getMessage());
        }
    }
    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
         String keyword = tCari.getText().trim(); // Ambil teks dari field pencarian

    if (keyword.isEmpty()) {
        tampilData(); // Jika kosong, tampilkan semua data
        return;
    }

    DefaultTableModel model = new DefaultTableModel();
    model.addColumn("ID Pengurus");
    model.addColumn("Nama Pengurus");
    model.addColumn("Jenis Kelamin");
    model.addColumn("No Handphone");
    model.addColumn("Alamat");
    model.addColumn("Jabatan");
    model.addColumn("Wilayah RT");
    model.addColumn("Wilayah RW");
    model.addColumn("Tgl.Mulai Jabatan");
    model.addColumn("Tgl.Selesai Jabatan");
    try {
        String sql = "SELECT * FROM data_pengurus WHERE nama_pengurus LIKE ? OR id_pengurus LIKE ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, "%" + keyword + "%");
        ps.setString(2, "%" + keyword + "%");

        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            model.addRow(new Object[]{
                rs.getString("id_pengurus"),
                rs.getString("nama_pengurus"),
                rs.getString("jenis_kelamin"),
                rs.getString("no_hp"),
                rs.getString("alamat"),
                rs.getString("jabatan"),
                rs.getString("wilayah_rt"),
                rs.getString("wilayah_rw"),
                rs.getString("mulai_menjabat"),
                rs.getString("selesai_menjabat")
            });
        }

        tPengurus.setModel(model); // Set hasil pencarian ke tabel
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal mencari data: " + e.getMessage());
    }
       
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrintActionPerformed
        try {
    String namaFile = "src/Report/DataPengurus.jasper";
    koneksi k = new koneksi(); 
    Connection conn = k.connect(); 
    HashMap parameter = new HashMap();
    File report_file = new File(namaFile);
    JasperReport jasperReport = (JasperReport) JRLoader.loadObject(report_file); 
    JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameter, conn);
    JasperViewer.viewReport(jasperPrint, false); // false berarti tidak exit on close
    JasperViewer.setDefaultLookAndFeelDecorated(true); // Ini hanya untuk tampilan, bisa diletakkan di tempat lain
} catch (Exception e) {
    JOptionPane.showMessageDialog(null, e.getMessage());
    e.printStackTrace(); // Tambahkan ini untuk debugging lebih lanjut
}
    }//GEN-LAST:event_btnPrintActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        int konfirmasi = JOptionPane.showConfirmDialog(null, "Ingin Tambah Data Pengurus?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
        if (konfirmasi == JOptionPane.YES_OPTION) {
        DataPengurusNew dataPanel = new DataPengurusNew();
        javax.swing.JPanel parent = (javax.swing.JPanel) this.getParent();
        parent.removeAll(); // hapus panel saat ini
        parent.add(dataPanel); // tambahkan panel data kegiatan
        parent.revalidate(); // refresh layout
        parent.repaint(); // gambar ulang
        }
    }//GEN-LAST:event_btnTambahActionPerformed

    private void resetForm() {
          
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnPrint;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField tCari;
    private javax.swing.JTable tPengurus;
    // End of variables declaration//GEN-END:variables
}
