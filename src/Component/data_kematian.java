package Component;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import kelompokan.koneksi;
public class data_kematian extends javax.swing.JPanel {
    public data_kematian() {
        initComponents();
        isiComboNIK();
        isiComboFasilitas();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tNama = new javax.swing.JTextField();
        cbTanggal = new de.wannawork.jcalendar.JCalendarComboBox();
        cariNik = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        cbNik = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        tId = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        cbFasilitas = new javax.swing.JComboBox<>();
        cariFasilitas = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tNamaFasilitas = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtLokasi = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextArea();
        tWaktu = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        tCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelPindah = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(757, 645));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(768, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fasilitas.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Form Data Kematian");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 930, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        add(jPanel1);
        jPanel1.setBounds(0, 0, 1130, 50);

        jPanel2.setBackground(new java.awt.Color(94, 89, 128));
        jPanel2.setPreferredSize(new java.awt.Dimension(757, 100));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Lokasi Pemakaman");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tanggal Meninggal");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("NIK");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Nama");

        tNama.setEditable(false);

        cariNik.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cariNik.setText("Cari");
        cariNik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariNikActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        cbNik.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ID Kematian");

        tId.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID Fasilitas");

        cbFasilitas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cariFasilitas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cariFasilitas.setText("Cari");
        cariFasilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariFasilitasActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nama Fasilitas");

        tNamaFasilitas.setEditable(false);

        txtLokasi.setColumns(20);
        txtLokasi.setRows(5);
        jScrollPane2.setViewportView(txtLokasi);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Waktu Meninggal");

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Keterangan");

        txtKeterangan.setColumns(20);
        txtKeterangan.setRows(5);
        jScrollPane3.setViewportView(txtKeterangan);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel4))
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tNama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbNik, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNamaFasilitas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cariNik)
                            .addComponent(cariFasilitas)))
                    .addComponent(cbTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(284, 284, 284)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(62, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5))
                                .addGap(56, 56, 56)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cariNik)
                            .addComponent(cbNik, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cariFasilitas)
                            .addComponent(cbFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(tNamaFasilitas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(cbTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(tWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        add(jPanel2);
        jPanel2.setBounds(0, 50, 1130, 410);

        jPanel3.setBackground(new java.awt.Color(102, 102, 255));

        btnClear.setBackground(new java.awt.Color(38, 50, 56));
        btnClear.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnSave.setBackground(new java.awt.Color(38, 50, 56));
        btnSave.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setPreferredSize(new java.awt.Dimension(63, 23));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(38, 50, 56));
        btnEdit.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.setPreferredSize(new java.awt.Dimension(63, 23));
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnDelete.setBackground(new java.awt.Color(38, 50, 56));
        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setText("Delete");
        btnDelete.setPreferredSize(new java.awt.Dimension(63, 23));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnClear)
                .addGap(42, 42, 42)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 414, Short.MAX_VALUE)
                .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        add(jPanel3);
        jPanel3.setBounds(0, 460, 1130, 50);

        tabelPindah.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelPindah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelPindahMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelPindah);

        add(jScrollPane4);
        jScrollPane4.setBounds(0, 510, 1130, 120);
    }// </editor-fold>//GEN-END:initComponents
    private void isiComboNIK() {
    koneksi k = new koneksi();
    Connection conn = k.connect();

    try {
        String sql = "SELECT nik FROM datawarga";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        cbNik.removeAllItems(); // Kosongkan isi sebelumnya

        while (rs.next()) {
            cbNik.addItem(rs.getString("nik"));
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal mengambil data NIK: " + e.getMessage());
    }
}
private void isiComboFasilitas() {
    koneksi k = new koneksi();
    Connection conn = k.connect();
    try {
        String sql = "SELECT id_fas FROM data_fasilitas";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        cbFasilitas.removeAllItems(); // Kosongkan isi sebelumnya

        while (rs.next()) {
            cbFasilitas.addItem(rs.getString("id_fas"));
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal mengambil data NIK: " + e.getMessage());
    }
}
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try (Connection conn = new koneksi().connect()) {
            String sql = "INSERT INTO data_kematian (nik, nama_penduduk, id_fas, nama_fas, tanggal_meninggal, waktu_meninggal, lokasi_pemakaman, keterangan) VALUES (?, ?, ?, ?, ?, ? , ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, cbNik.getSelectedItem().toString());
            pst.setString(2, tNama.getText());
            pst.setString(3, cbFasilitas.getSelectedItem().toString());
            pst.setString(4, tNamaFasilitas.getText());
            pst.setDate(5, new java.sql.Date(cbTanggal.getDate().getTime()));
            pst.setString(6, tWaktu.getText());
            pst.setString(7, txtLokasi.getText());
            pst.setString(8, txtKeterangan.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan.");
            tampilData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal simpan: " + e.getMessage());
        }   
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        try (Connection conn = new koneksi().connect()) {
            String sql = "UPDATE data_kematian SET nik=?, nama_penduduk=?, id_fas=?, nama_fas=?, tanggal_meninggal=?, waktu_meninggal=?, lokasi_pemakaman=?, keterangan=? WHERE id_kematian=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, cbNik.getSelectedItem().toString());
            pst.setString(2, tNama.getText());
            pst.setString(3, cbFasilitas.getSelectedItem().toString());
            pst.setString(4, tNamaFasilitas.getText());
            pst.setDate(5, new java.sql.Date(cbTanggal.getDate().getTime()));
            pst.setString(6, tWaktu.getText());
            pst.setString(7, txtLokasi.getText());
            pst.setString(8, txtKeterangan.getText());
            pst.setString(9, tId.getText());
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate.");
            tampilData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal edit: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        try (Connection conn = new koneksi().connect()) {
            String sql = "DELETE FROM data_kematian WHERE id_kematian=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tId.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil dihapus.");
            tampilData();
            clearForm();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal hapus: " + e.getMessage());
        }   
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        DefaultTableModel model = new DefaultTableModel(
        new String[]{"ID Kematian", "NIK", "Nama", "ID Fasilitas" ,"Nama Fasilitas" ,"Tanggal Meninggal" ,"Waktu Meninggal" ,"Lokasi Pemakaman" ,"Keterangan"}, 0
         );
        try (Connection conn = new koneksi().connect()) {
            String sql = "SELECT * FROM data_kematian WHERE id_kematian LIKE ? OR nama_penduduk LIKE ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            String keyword = "%" + tCari.getText() + "%";
            pst.setString(1, keyword);
            pst.setString(2, keyword);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id_kematian"),
                    rs.getString("nik"),
                    rs.getString("nama_penduduk"),
                    rs.getString("id_fas"),
                    rs.getString("nama_fas"),
                    rs.getDate("tanggal_meninggal"),
                    rs.getString("waktu_meninggal"),
                    rs.getString("lokasi_pemakaman"),
                    rs.getString("keterangan")
                });
            }
            tabelPindah.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal cari: " + e.getMessage());
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        clearForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void cariNikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariNikActionPerformed
        koneksi k = new koneksi();
    Connection conn = k.connect();

    try {
        String nik = cbNik.getSelectedItem().toString();
        String sql = "SELECT * FROM datawarga WHERE nik =?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, nik);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            tNama.setText(rs.getString("nama"));
        } else {
            JOptionPane.showMessageDialog(this, "Data tidak ditemukan");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error saat mencari data: " + e.getMessage());
    }
    }//GEN-LAST:event_cariNikActionPerformed

    private void cariFasilitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariFasilitasActionPerformed
        koneksi k = new koneksi();
    Connection conn = k.connect();

    try {
        String fasilitas = cbFasilitas.getSelectedItem().toString();
        String sql = "SELECT * FROM data_fasilitas WHERE id_fas =?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, fasilitas);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            tNamaFasilitas.setText(rs.getString("nama_fas"));
        } else {
            JOptionPane.showMessageDialog(this, "Data tidak ditemukan");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error saat mencari data: " + e.getMessage());
    }
    }//GEN-LAST:event_cariFasilitasActionPerformed

    private void tabelPindahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelPindahMouseClicked
        int baris = tabelPindah.rowAtPoint(evt.getPoint());
    if (baris >= 0) {
        String idKematian = tabelPindah.getModel().getValueAt(baris, 0).toString();
        tId.setText(idKematian);
        String nik = tabelPindah.getModel().getValueAt(baris, 1).toString();
        cbNik.setSelectedItem(nik);
        String namaPenduduk = tabelPindah.getModel().getValueAt(baris, 2).toString();
        tNama.setText(namaPenduduk);
        String idFasilitas = tabelPindah.getModel().getValueAt(baris, 3).toString();
        cbFasilitas.setSelectedItem(idFasilitas);
        String namaFasilitas = tabelPindah.getModel().getValueAt(baris, 4).toString();
        tNamaFasilitas.setText(namaFasilitas);
        try {
            Object tanggalObj = tabelPindah.getModel().getValueAt(baris, 5);
            if (tanggalObj instanceof java.util.Date) {
                cbTanggal.setDate((java.util.Date) tanggalObj);
            } else if (tanggalObj != null) {
                // Jika berupa String (format default SQL DATE yyyy-MM-dd)
                String tglStr = tanggalObj.toString();
                java.util.Date tglDate = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(tglStr);
                cbTanggal.setDate(tglDate); 
            } else {
                cbTanggal.setDate(null);
            }
        } catch (Exception ex) {
            cbTanggal.setDate(null); // Kosongkan jika ada error parsing
        }
        String waktuMeninggal = tabelPindah.getModel().getValueAt(baris, 6).toString();
        tWaktu.setText(waktuMeninggal);
        String lokasiPemakaman = tabelPindah.getModel().getValueAt(baris, 7).toString();
        txtLokasi.setText(lokasiPemakaman);
        String keterangan = tabelPindah.getModel().getValueAt(baris, 8).toString();
        txtKeterangan.setText(keterangan);
    }

    }//GEN-LAST:event_tabelPindahMouseClicked
    private void clearForm() {
        tId.setText("");
        cbNik.setSelectedItem(null);
        tNama.setText("");
        cbFasilitas.setSelectedItem(null);
        tNamaFasilitas.setText("");
        cbTanggal.setDate(null);
        txtLokasi.setText("");
        tWaktu.setText("");
        txtKeterangan.setText("");
        tCari.setText("");
    }
    private void tampilData() {
        DefaultTableModel model = new DefaultTableModel(
        new String[]{"ID Kematian", "NIK", "Nama", "ID Fasilitas" ,"Nama Fasilitas" ,"Tanggal Meninggal" ,"Waktu Meninggal" ,"Lokasi Pemakaman" ,"Keterangan"}, 0
         );  
        try (Connection conn = new koneksi().connect()) {
            String sql = "SELECT * FROM data_kematian ORDER BY id_kematian DESC";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id_kematian"),
                    rs.getString("nik"),
                    rs.getString("nama_penduduk"),
                    rs.getString("id_fas"),
                    rs.getString("nama_fas"),
                    rs.getDate("tanggal_meninggal"),
                    rs.getString("waktu_meninggal"),
                    rs.getString("lokasi_pemakaman"),
                    rs.getString("keterangan")
                });
            }
            tabelPindah.setModel(model);
        } catch (SQLException e) {
            System.out.println("Gagal tampil data: " + e.getMessage());
        }
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton cariFasilitas;
    private javax.swing.JButton cariNik;
    private javax.swing.JComboBox<String> cbFasilitas;
    private javax.swing.JComboBox<String> cbNik;
    private de.wannawork.jcalendar.JCalendarComboBox cbTanggal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField tCari;
    private javax.swing.JTextField tId;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNamaFasilitas;
    private javax.swing.JTextField tWaktu;
    private javax.swing.JTable tabelPindah;
    private javax.swing.JTextArea txtKeterangan;
    private javax.swing.JTextArea txtLokasi;
    // End of variables declaration//GEN-END:variables
}
