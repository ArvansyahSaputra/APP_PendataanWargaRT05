package Component;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import kelompokan.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.ButtonGroup;
import javax.swing.table.DefaultTableModel;

public class DataPengurusNew extends javax.swing.JPanel {
    Connection conn;
    public DataPengurusNew() {
        initComponents();
        koneksi k = new koneksi(); // membuat objek dari class koneksi
        conn = k.connect();        // mendapatkan koneksi dari method connect()
        tampilData();  
        ButtonGroup groupKelamin = new ButtonGroup();
        groupKelamin.add(tLaki);
        groupKelamin.add(tPerempuan);
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
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tID = new javax.swing.JTextField();
        tNama = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tAlamat = new javax.swing.JTextArea();
        tHP = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        tPerempuan = new javax.swing.JRadioButton();
        tLaki = new javax.swing.JRadioButton();
        tJabatan = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        cbRt = new javax.swing.JComboBox<>();
        cbRw = new javax.swing.JComboBox<>();
        tMulai = new de.wannawork.jcalendar.JCalendarComboBox();
        tSelesai = new de.wannawork.jcalendar.JCalendarComboBox();
        jPanel3 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        tCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tPengurus = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(757, 645));
        setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(768, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pengurus.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel2.setText("Form Data Pengurus");

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 932, Short.MAX_VALUE)
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

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID Pengurus");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nama Pengurus");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Alamat");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("No.Handpone");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Mulai Menjabat");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Selesai Menjabat");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Jabatan");

        tID.setEditable(false);

        tAlamat.setColumns(20);
        tAlamat.setRows(5);
        jScrollPane2.setViewportView(tAlamat);

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Jenis Kelamin");

        tPerempuan.setForeground(new java.awt.Color(255, 255, 255));
        tPerempuan.setText("Perempuan");

        tLaki.setForeground(new java.awt.Color(255, 255, 255));
        tLaki.setText("Laki-laki");
        tLaki.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tLakiActionPerformed(evt);
            }
        });

        tJabatan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ketua", "Wakil Ketua", "Sekertaris", "Bendahara", "Seksi Keamanan", "Seksi Kebersihan", "Seksi Kegiatan", "Seksi Sosial", " " }));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Wilauah RT");

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Wilayah RW");

        cbRt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));

        cbRw.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", " " }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tPerempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57)
                        .addComponent(tLaki, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel11)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tHP, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(92, 92, 92)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel12)
                            .addComponent(jLabel7))
                        .addGap(42, 42, 42))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(35, 35, 35)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cbRt, javax.swing.GroupLayout.Alignment.LEADING, 0, 89, Short.MAX_VALUE)
                        .addComponent(cbRw, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tSelesai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 186, Short.MAX_VALUE)
                        .addComponent(tMulai, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(486, 486, 486))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(tJabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbRt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(cbRw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(tMulai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(tSelesai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tPerempuan)
                            .addComponent(tLaki)
                            .addComponent(jLabel11))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tHP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)))
                .addGap(2, 2, 2)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(81, 81, 81))
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
                .addGap(24, 24, 24)
                .addComponent(btnClear)
                .addGap(18, 18, 18)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 480, Short.MAX_VALUE)
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
        tPengurus.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tPengurusMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tPengurus);

        add(jScrollPane1);
        jScrollPane1.setBounds(0, 510, 1130, 170);
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
            String sql = "SELECT * FROM data_pengurus ORDER BY id_pengurus DESC";
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
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        String jk ="";
        if(tLaki.isSelected()){
         jk = "Laki-laki";
        }else if(tPerempuan.isSelected()){
         jk = "Perempuan";
        }else{
         JOptionPane.showMessageDialog(null,"pilih jenis kelamin terlebih dahulu!");
         return;
        }
        try {
            String sql = "INSERT INTO data_pengurus (nama_pengurus, jenis_kelamin, no_hp, alamat, jabatan, wilayah_rt, wilayah_rw, mulai_menjabat, selesai_menjabat) "
                       + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tNama.getText());
            pst.setString(2, jk);
            pst.setString(3, tHP.getText());
            pst.setString(4, tAlamat.getText());
            pst.setString(5, tJabatan.getSelectedItem().toString());
            pst.setString(6, cbRt.getSelectedItem().toString());
            pst.setString(7, cbRw.getSelectedItem().toString());
            pst.setDate(8, new java.sql.Date(tMulai.getDate().getTime()));
            pst.setDate(9, new java.sql.Date(tSelesai.getDate().getTime()));
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil disimpan!");
            tampilData();
            resetForm();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menyimpan data: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
         String jk ="";
        if(tLaki.isSelected()){
         jk = "Laki-laki";
        }else if(tPerempuan.isSelected()){
         jk = "Perempuan";
        }else{
         JOptionPane.showMessageDialog(null,"pilih jenis kelamin terlebih dahulu!");
         return;
        }
        try {
            String sql = "UPDATE data_pengurus SET nama_pengurus=?, jenis_kelamin=?, no_hp=?, alamat=?, jabatan=?, wilayah_rt=?, wilayah_rw=?, mulai_menjabat=?, selesai_menjabat=? WHERE id_pengurus=?";
            java.sql.Connection conn = new kelompokan.koneksi().connect();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tNama.getText());
            pst.setString(2, jk);
            pst.setString(3, tHP.getText());
            pst.setString(4, tAlamat.getText());
            pst.setString(5, tJabatan.getSelectedItem().toString());
            pst.setString(6, cbRt.getSelectedItem().toString());
            pst.setString(7, cbRw.getSelectedItem().toString());
            pst.setDate(8, new java.sql.Date(tMulai.getDate().getTime()));
            pst.setDate(9, new java.sql.Date(tSelesai.getDate().getTime()));
            pst.setString(10, tID.getText());
            pst.executeUpdate();

            JOptionPane.showMessageDialog(null, "Data berhasil diubah.");
            tampilData();  // method untuk refresh tabel
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal mengedit: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        try {
            String sql = "DELETE FROM data_pengurus WHERE id_pengurus=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tID.getText());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Data berhasil dihapus!");
            tampilData();
            resetForm();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Gagal menghapus data: " + e.getMessage());
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        resetForm();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
        // TODO add your handling code here:
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
            String keyword = tCari.getText();
            String sql = "SELECT * FROM data_pengurus WHERE id_pengurus LIKE ? OR nama_pengurus LIKE ?";
            java.sql.Connection conn = new kelompokan.koneksi().connect();
            java.sql.PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, "%" + keyword + "%");
            pst.setString(2, "%" + keyword + "%");

            java.sql.ResultSet rs = pst.executeQuery();
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
            tPengurus.setModel(model);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Pencarian gagal: " + e.getMessage());
        }
    }//GEN-LAST:event_btnCariActionPerformed

    private void tLakiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tLakiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tLakiActionPerformed

    private void tPengurusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tPengurusMouseClicked
        int baris = tPengurus.rowAtPoint(evt.getPoint());
    
    if (baris >= 0) {
        String idPengurus = tPengurus.getModel().getValueAt(baris, 0).toString();
        tID.setText(idPengurus);
        
        String nama = tPengurus.getModel().getValueAt(baris, 1).toString();
        tNama.setText(nama);
        
        String jenisKelamin = tPengurus.getModel().getValueAt(baris, 2).toString();
        if (jenisKelamin.equalsIgnoreCase("Laki-laki")) {
            tLaki.setSelected(true);
        } else if (jenisKelamin.equalsIgnoreCase("Perempuan")) {
            tPerempuan.setSelected(true);
        } else {
            tLaki.setSelected(false);
            tPerempuan.setSelected(false);
        }
        
        String noHp = tPengurus.getModel().getValueAt(baris, 3).toString();
        tHP.setText(noHp);
        
        String alamat = tPengurus.getModel().getValueAt(baris, 4).toString();
        tAlamat.setText(alamat);
        
        String jabatan = tPengurus.getModel().getValueAt(baris, 5).toString();
        tJabatan.setSelectedItem(jabatan);
        
        // Kolom 6: Wilayah RT (ComboBox)
        String rt = tPengurus.getModel().getValueAt(baris, 6).toString();
        cbRt.setSelectedItem(rt);
        
        String rw = tPengurus.getModel().getValueAt(baris, 7).toString();
        cbRw.setSelectedItem(rw);
        
        try {
            String tglMulaiStr = tPengurus.getModel().getValueAt(baris, 8).toString();
            // Format default SQL DATE adalah yyyy-MM-dd
            java.util.Date tglMulaiDate = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(tglMulaiStr);
            tMulai.setDate(tglMulaiDate); 
        } catch (java.text.ParseException | NullPointerException ex) {
            tMulai.setDate(null); // Kosongkan jika gagal parsing
        }

        try {
            String tglSelesaiStr = tPengurus.getModel().getValueAt(baris, 9).toString();
            // Format default SQL DATE adalah yyyy-MM-dd
            java.util.Date tglSelesaiDate = new java.text.SimpleDateFormat("yyyy-MM-dd").parse(tglSelesaiStr);
            tSelesai.setDate(tglSelesaiDate); 
        } catch (java.text.ParseException | NullPointerException ex) {
            tSelesai.setDate(null); // Kosongkan jika gagal parsing
        }
    }
    }//GEN-LAST:event_tPengurusMouseClicked

    private void resetForm() {
        tID.setText("");
        tNama.setText("");
        tAlamat.setText("");
        tHP.setText("");
        tMulai.setDate(null);
        tJabatan.setSelectedIndex(0);
        tSelesai.setDate(null);
        tPerempuan.setSelected(false);
        tLaki.setSelected(false); 
        cbRt.setSelectedIndex(0);
        cbRw.setSelectedIndex(0);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnSave;
    private javax.swing.JComboBox<String> cbRt;
    private javax.swing.JComboBox<String> cbRw;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea tAlamat;
    private javax.swing.JTextField tCari;
    private javax.swing.JTextField tHP;
    private javax.swing.JTextField tID;
    private javax.swing.JComboBox<String> tJabatan;
    private javax.swing.JRadioButton tLaki;
    private de.wannawork.jcalendar.JCalendarComboBox tMulai;
    private javax.swing.JTextField tNama;
    private javax.swing.JTable tPengurus;
    private javax.swing.JRadioButton tPerempuan;
    private de.wannawork.jcalendar.JCalendarComboBox tSelesai;
    // End of variables declaration//GEN-END:variables
}
