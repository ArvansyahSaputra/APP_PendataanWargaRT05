package Component;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import kelompokan.koneksi;
public class data_warga_baru extends javax.swing.JPanel {
    public data_warga_baru() {
        initComponents();
        isiComboNIK();
        isiComboPengurus();
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
        cbPengurus = new javax.swing.JComboBox<>();
        cariPengurus = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        tNamaPengurus = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        tJumlah = new javax.swing.JTextField();
        txtAsal = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtMasuk = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        tCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelWargaBaru = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(757, 645));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(768, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Wbaru.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Form Data Warga Baru");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 919, Short.MAX_VALUE)
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
        jLabel3.setText("Alasan Masuk");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tanggal Masuk");

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
        jLabel8.setText("ID Warga Baru");

        tId.setEditable(false);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("ID Pengurus");

        cbPengurus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cariPengurus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        cariPengurus.setText("Cari");
        cariPengurus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cariPengurusActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nama Pengurus");

        tNamaPengurus.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Asal Daetah");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Status Keluarga");

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Suami ", "Istri", "Anak", " " }));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Keterangan");

        txtKeterangan.setColumns(20);
        txtKeterangan.setRows(5);
        jScrollPane3.setViewportView(txtKeterangan);

        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Jumlah Keluarga");

        tJumlah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tJumlahActionPerformed(evt);
            }
        });

        txtMasuk.setColumns(20);
        txtMasuk.setRows(5);
        jScrollPane4.setViewportView(txtMasuk);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(58, 58, 58)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tNama, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbNik, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tId, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbPengurus, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tNamaPengurus, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(58, 58, 58)
                        .addComponent(cbTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cariNik)
                    .addComponent(cariPengurus))
                .addGap(50, 50, 50)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel13))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jLabel5)
                    .addComponent(txtAsal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
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
                                    .addComponent(cariPengurus)
                                    .addComponent(cbPengurus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(31, 31, 31)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(tNamaPengurus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(39, 39, 39)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(cbTanggal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAsal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(tJumlah, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))))
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

        tabelWargaBaru.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelWargaBaru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelWargaBaruMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tabelWargaBaru);

        add(jScrollPane2);
        jScrollPane2.setBounds(0, 510, 1130, 120);
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
private void isiComboPengurus() {
    koneksi k = new koneksi();
    Connection conn = k.connect();

    try {
        String sql = "SELECT id_pengurus FROM data_pengurus";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();

        cbPengurus.removeAllItems(); // Kosongkan isi sebelumnya

        while (rs.next()) {
            cbPengurus.addItem(rs.getString("id_pengurus"));
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Gagal mengambil data NIK: " + e.getMessage());
    }
}
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try (Connection conn = new koneksi().connect()) {
            String sql = "INSERT INTO data_wargabaru (nik, nama, id_pengurus, nama_pengurus, tanggal_masuk, alasan_masuk, asal_daerah, status_keluarga, jumlah_keluarga, keterangan) VALUES (?, ?, ?, ?, ?, ? , ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, cbNik.getSelectedItem().toString());
            pst.setString(2, tNama.getText());
            pst.setString(3, cbPengurus.getSelectedItem().toString());
            pst.setString(4, tNamaPengurus.getText());
            pst.setDate(5, new java.sql.Date(cbTanggal.getDate().getTime()));
            pst.setString(6, txtMasuk.getText());
            pst.setString(7, txtAsal.getText().toString());
            pst.setString(8, cbStatus.getSelectedItem().toString());
            pst.setString(9, tJumlah.getText());
            pst.setString(10, txtKeterangan.getText());
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil disimpan.");
            tampilData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal simpan: " + e.getMessage());
        }   
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        try (Connection conn = new koneksi().connect()) {
            String sql = "UPDATE data_wargabaru SET nik=?, nama=?, id_pengurus=?, nama_pengurus=?, tanggal_masuk=?, alasan_masuk=?, asal_daerah=?, status_keluarga=?, jumlah_keluarga=?, keterangan=? WHERE id_wargabaru=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, cbNik.getSelectedItem().toString());
            pst.setString(2, tNama.getText());
            pst.setString(3, cbPengurus.getSelectedItem().toString());
            pst.setString(4, tNamaPengurus.getText());
            pst.setDate(5, new java.sql.Date(cbTanggal.getDate().getTime()));
            pst.setString(6, txtMasuk.getText());
            pst.setString(7, txtAsal.getText().toString());
            pst.setString(8, cbStatus.getSelectedItem().toString());
            pst.setString(9, tJumlah.getText());
            pst.setString(10, txtKeterangan.getText());
            pst.setString(11, tId.getText());
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Data berhasil diupdate.");
            tampilData();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Gagal edit: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try (Connection conn = new koneksi().connect()) {
            String sql = "DELETE FROM data_wargabaru WHERE id_wargabaru=?";
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
        // TODO add your handling code here:
        DefaultTableModel model = new DefaultTableModel(
        new String[]{"ID Pindah", "NIK", "Nama", "ID Pengurus" ,"Nama Pengurus" ,"Tanggal Pindah" ,"Alasan Masuk" ,"Kota Tujuan" ,"Status Pindah","Jumlah Keluarga", "Keterangan"}, 0
         ); 
        try (Connection conn = new koneksi().connect()) {
            String sql = "SELECT * FROM data_wargabaru WHERE id_wargabaru LIKE ? OR nama LIKE ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            String keyword = "%" + tCari.getText() + "%";
            pst.setString(1, keyword);
            pst.setString(2, keyword);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id_wargabaru"),
                    rs.getString("nik"),
                    rs.getString("nama"),
                    rs.getString("id_pengurus"),
                    rs.getString("nama_pengurus"),
                    rs.getDate("tanggal_masuk"),
                    rs.getString("alasan_masuk"),
                    rs.getString("asal_daerah"),
                    rs.getString("status_keluarga"),
                    rs.getString("jumlah_keluarga"),
                    rs.getString("keterangan")
                });
            }
            tabelWargaBaru.setModel(model);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal cari: " + e.getMessage());
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here
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

    private void cariPengurusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cariPengurusActionPerformed
        koneksi k = new koneksi();
    Connection conn = k.connect();

    try {
        String pengurus = cbPengurus.getSelectedItem().toString();
        String sql = "SELECT * FROM data_pengurus WHERE id_pengurus =?";
        PreparedStatement pst = conn.prepareStatement(sql);
        pst.setString(1, pengurus);
        ResultSet rs = pst.executeQuery();

        if (rs.next()) {
            // Contoh: tampilkan nama ke text field
            tNamaPengurus.setText(rs.getString("nama_pengurus"));
            // Tambahkan field lain sesuai kebutuhanmu
        } else {
            JOptionPane.showMessageDialog(this, "Data tidak ditemukan");
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error saat mencari data: " + e.getMessage());
    }
    }//GEN-LAST:event_cariPengurusActionPerformed

    private void tJumlahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tJumlahActionPerformed

    }//GEN-LAST:event_tJumlahActionPerformed

    private void tabelWargaBaruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelWargaBaruMouseClicked
        int baris = tabelWargaBaru.rowAtPoint(evt.getPoint());
    if (baris >= 0) {
        String idWargaBaru = tabelWargaBaru.getModel().getValueAt(baris, 0).toString();
        tId.setText(idWargaBaru);
        String nik = tabelWargaBaru.getModel().getValueAt(baris, 1).toString();
        cbNik.setSelectedItem(nik);
        String namaPenduduk = tabelWargaBaru.getModel().getValueAt(baris, 2).toString();
        tNama.setText(namaPenduduk);
        String idPengurus = tabelWargaBaru.getModel().getValueAt(baris, 3).toString();
        cbPengurus.setSelectedItem(idPengurus);
        String namaPengurus = tabelWargaBaru.getModel().getValueAt(baris, 4).toString();
        tNamaPengurus.setText(namaPengurus);
        try {
            Object tanggalObj = tabelWargaBaru.getModel().getValueAt(baris, 5);
            if (tanggalObj instanceof java.util.Date) {
                cbTanggal.setDate((java.util.Date) tanggalObj);
            } else if (tanggalObj != null) {
                String tglStr = tanggalObj.toString();
                java.util.Date tglDate = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(tglStr);
                cbTanggal.setDate(tglDate); 
            } else {
                cbTanggal.setDate(null);
            }
        } catch (Exception ex) {
            cbTanggal.setDate(null); // Kosongkan jika ada error parsing
        }
        String alasanMasuk = tabelWargaBaru.getModel().getValueAt(baris, 6).toString();
        txtMasuk.setText(alasanMasuk);
        String asalDaerah = tabelWargaBaru.getModel().getValueAt(baris, 7).toString();
        txtAsal.setText(asalDaerah);
        String statusKeluarga = tabelWargaBaru.getModel().getValueAt(baris, 8).toString();
        cbStatus.setSelectedItem(statusKeluarga);
        String jumlahKeluarga = tabelWargaBaru.getModel().getValueAt(baris, 9).toString();
        tJumlah.setText(jumlahKeluarga);
        String keterangan = tabelWargaBaru.getModel().getValueAt(baris, 10).toString();
        txtKeterangan.setText(keterangan);
    }

    }//GEN-LAST:event_tabelWargaBaruMouseClicked
    private void clearForm() {
        tId.setText("");
        cbNik.setSelectedItem(null);
        tNama.setText("");
        cbPengurus.setSelectedItem(null);
        tNamaPengurus.setText("");
        cbTanggal.setDate(null);
        txtMasuk.setText("");
        txtAsal.setText("");
        cbStatus.setSelectedItem(null);
        tJumlah.setText("");
        txtKeterangan.setText("");
        tCari.setText("");
    }
    private void tampilData() {
        DefaultTableModel model = new DefaultTableModel(
        new String[]{"ID Pindah", "NIK", "Nama", "ID Pengurus" ,"Nama Pengurus" ,"Tanggal Pindah" ,"Alasan Masuk" ,"Kota Tujuan" ,"Status Pindah","Jumlah Keluarga", "Keterangan"}, 0
         );  
        try (Connection conn = new koneksi().connect()) {
            String sql = "SELECT * FROM data_wargabaru ORDER BY id_wargabaru DESC";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id_wargabaru"),
                    rs.getString("nik"),
                    rs.getString("nama"),
                    rs.getString("id_pengurus"),
                    rs.getString("nama_pengurus"),
                    rs.getDate("tanggal_masuk"),
                    rs.getString("alasan_masuk"),
                    rs.getString("asal_daerah"),
                    rs.getString("status_keluarga"),
                    rs.getString("jumlah_keluarga"),
                    rs.getString("keterangan")
                });
            }
            tabelWargaBaru.setModel(model);
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
    private javax.swing.JButton cariNik;
    private javax.swing.JButton cariPengurus;
    private javax.swing.JComboBox<String> cbNik;
    private javax.swing.JComboBox<String> cbPengurus;
    private javax.swing.JComboBox<String> cbStatus;
    private de.wannawork.jcalendar.JCalendarComboBox cbTanggal;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JTextField tJumlah;
    private javax.swing.JTextField tNama;
    private javax.swing.JTextField tNamaPengurus;
    private javax.swing.JTable tabelWargaBaru;
    private javax.swing.JTextField txtAsal;
    private javax.swing.JTextArea txtKeterangan;
    private javax.swing.JTextArea txtMasuk;
    // End of variables declaration//GEN-END:variables
}
