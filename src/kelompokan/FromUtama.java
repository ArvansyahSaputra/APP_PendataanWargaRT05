package kelompokan;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import Component.DataWargaNew;
import Component.DataPengurusNew;
import Component.dataFasilitas;
import Component.dataPindah;
import Component.dataWbaru;
import Component.dataKegiatan;
import Component.data_kematian;
import Component.data_warga_baru;
import Component.panelBeranda;
import Report.laporan_data_warga;
import Report.laporan_data_kegiatan;
import Report.laporan_data_kematian;
import Report.laporan_data_pengurus;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

public class FromUtama extends javax.swing.JFrame {

   public void tampilkanPanelAwal() {
    panelUtama.removeAll();
    panelUtama.setLayout(new BorderLayout());

    panelBeranda panelBeranda = new panelBeranda(); // ganti JPanel kosong menjadi PanelBeranda
    panelUtama.add(panelBeranda, BorderLayout.CENTER);

    panelUtama.revalidate();
    panelUtama.repaint();
}

    public FromUtama() {
    // PENTING: harus sebelum initComponents & setVisible
    setUndecorated(true);  

    initComponents();
    tampilkanPanelAwal();

    setExtendedState(JFrame.MAXIMIZED_BOTH);
    setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        panelMenu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnDataWarga = new javax.swing.JButton();
        btnDataPengurus = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        btnDataFasilitas = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dataWargaBaru = new javax.swing.JButton();
        dataKematian = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        ReportDataWarga = new javax.swing.JButton();
        btnKematian = new javax.swing.JButton();
        btnKegiatan = new javax.swing.JButton();
        btnPengurus = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        foterPanel = new javax.swing.JPanel();
        panelUtama = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHeader.setBackground(new java.awt.Color(51, 102, 255));
        panelHeader.setPreferredSize(new java.awt.Dimension(807, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Icon Family.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setText("Aplikasi Data Penduduk");

        jLabel3.setText("RT 005 RW 005 Kelurahan Kunciran Indah, Kecamatan Pinang, Kota Tangerang");

        javax.swing.GroupLayout panelHeaderLayout = new javax.swing.GroupLayout(panelHeader);
        panelHeader.setLayout(panelHeaderLayout);
        panelHeaderLayout.setHorizontalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addContainerGap(531, Short.MAX_VALUE))
        );
        panelHeaderLayout.setVerticalGroup(
            panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelHeaderLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addComponent(jLabel1))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(panelHeader, java.awt.BorderLayout.PAGE_START);

        panelMenu.setBackground(new java.awt.Color(38, 50, 56));
        panelMenu.setPreferredSize(new java.awt.Dimension(230, 362));
        panelMenu.setLayout(null);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Menu.png"))); // NOI18N
        panelMenu.add(jLabel4);
        jLabel4.setBounds(10, 10, 25, 20);

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Menu");
        panelMenu.add(jLabel5);
        jLabel5.setBounds(40, 10, 40, 20);
        panelMenu.add(jSeparator1);
        jSeparator1.setBounds(10, 40, 210, 2);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Master.png"))); // NOI18N
        panelMenu.add(jLabel6);
        jLabel6.setBounds(10, 50, 30, 30);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Master");
        panelMenu.add(jLabel7);
        jLabel7.setBounds(50, 47, 110, 30);

        btnDataWarga.setBackground(new java.awt.Color(38, 50, 56));
        btnDataWarga.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDataWarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Warga.png"))); // NOI18N
        btnDataWarga.setText("Data Warga");
        btnDataWarga.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDataWarga.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDataWarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataWargaActionPerformed(evt);
            }
        });
        panelMenu.add(btnDataWarga);
        btnDataWarga.setBounds(40, 90, 180, 30);

        btnDataPengurus.setBackground(new java.awt.Color(38, 50, 56));
        btnDataPengurus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDataPengurus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pengurus.png"))); // NOI18N
        btnDataPengurus.setText("Data Pengurus");
        btnDataPengurus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDataPengurus.setPreferredSize(new java.awt.Dimension(123, 33));
        btnDataPengurus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataPengurusActionPerformed(evt);
            }
        });
        panelMenu.add(btnDataPengurus);
        btnDataPengurus.setBounds(40, 130, 180, 30);

        jButton3.setBackground(new java.awt.Color(38, 50, 56));
        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Kegiatan.png"))); // NOI18N
        jButton3.setText("Data Kegiatan");
        jButton3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton3.setPreferredSize(new java.awt.Dimension(123, 33));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        panelMenu.add(jButton3);
        jButton3.setBounds(40, 300, 180, 30);
        panelMenu.add(jSeparator2);
        jSeparator2.setBounds(10, 210, 210, 2);

        btnDataFasilitas.setBackground(new java.awt.Color(38, 50, 56));
        btnDataFasilitas.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnDataFasilitas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Fasilitas.png"))); // NOI18N
        btnDataFasilitas.setText("Data Fasilitas");
        btnDataFasilitas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnDataFasilitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDataFasilitasActionPerformed(evt);
            }
        });
        panelMenu.add(btnDataFasilitas);
        btnDataFasilitas.setBounds(40, 170, 180, 30);

        jButton5.setBackground(new java.awt.Color(38, 50, 56));
        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Pindah.png"))); // NOI18N
        jButton5.setText("Data Pindah");
        jButton5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        panelMenu.add(jButton5);
        jButton5.setBounds(40, 260, 180, 30);

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Transaksi1.png"))); // NOI18N
        jLabel8.setText("Transaksi");
        panelMenu.add(jLabel8);
        jLabel8.setBounds(10, 220, 30, 30);

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Transaksi");
        panelMenu.add(jLabel9);
        jLabel9.setBounds(50, 220, 90, 30);

        dataWargaBaru.setBackground(new java.awt.Color(38, 50, 56));
        dataWargaBaru.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        dataWargaBaru.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Wbaru.png"))); // NOI18N
        dataWargaBaru.setText("Data Warga Baru");
        dataWargaBaru.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dataWargaBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataWargaBaruActionPerformed(evt);
            }
        });
        panelMenu.add(dataWargaBaru);
        dataWargaBaru.setBounds(40, 340, 180, 30);

        dataKematian.setBackground(new java.awt.Color(38, 50, 56));
        dataKematian.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        dataKematian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Kematian.png"))); // NOI18N
        dataKematian.setText("Data Kematian");
        dataKematian.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dataKematian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataKematianActionPerformed(evt);
            }
        });
        panelMenu.add(dataKematian);
        dataKematian.setBounds(40, 380, 180, 30);
        panelMenu.add(jSeparator3);
        jSeparator3.setBounds(10, 420, 210, 20);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Report.png"))); // NOI18N
        panelMenu.add(jLabel10);
        jLabel10.setBounds(10, 430, 43, 40);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Report");
        panelMenu.add(jLabel11);
        jLabel11.setBounds(60, 440, 90, 20);

        ReportDataWarga.setBackground(new java.awt.Color(38, 50, 56));
        ReportDataWarga.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        ReportDataWarga.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Lapor.png"))); // NOI18N
        ReportDataWarga.setText("Laporan Data Warga");
        ReportDataWarga.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        ReportDataWarga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReportDataWargaActionPerformed(evt);
            }
        });
        panelMenu.add(ReportDataWarga);
        ReportDataWarga.setBounds(40, 480, 180, 30);

        btnKematian.setBackground(new java.awt.Color(38, 50, 56));
        btnKematian.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnKematian.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Lapor.png"))); // NOI18N
        btnKematian.setText("Laporan Data Kematian");
        btnKematian.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKematian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKematianActionPerformed(evt);
            }
        });
        panelMenu.add(btnKematian);
        btnKematian.setBounds(40, 520, 180, 30);

        btnKegiatan.setBackground(new java.awt.Color(38, 50, 56));
        btnKegiatan.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnKegiatan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Lapor.png"))); // NOI18N
        btnKegiatan.setText("Laporan Data Kegiatan");
        btnKegiatan.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnKegiatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKegiatanActionPerformed(evt);
            }
        });
        panelMenu.add(btnKegiatan);
        btnKegiatan.setBounds(40, 560, 180, 30);

        btnPengurus.setBackground(new java.awt.Color(38, 50, 56));
        btnPengurus.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        btnPengurus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/Lapor.png"))); // NOI18N
        btnPengurus.setText("Laporan Data Pengurus");
        btnPengurus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnPengurus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPengurusActionPerformed(evt);
            }
        });
        panelMenu.add(btnPengurus);
        btnPengurus.setBounds(40, 600, 180, 30);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/LogOut.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });
        panelMenu.add(btnLogout);
        btnLogout.setBounds(200, 10, 20, 20);

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        foterPanel.setBackground(new java.awt.Color(0, 102, 255));
        foterPanel.setPreferredSize(new java.awt.Dimension(807, 30));

        javax.swing.GroupLayout foterPanelLayout = new javax.swing.GroupLayout(foterPanel);
        foterPanel.setLayout(foterPanelLayout);
        foterPanelLayout.setHorizontalGroup(
            foterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 987, Short.MAX_VALUE)
        );
        foterPanelLayout.setVerticalGroup(
            foterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        getContentPane().add(foterPanel, java.awt.BorderLayout.PAGE_END);

        panelUtama.setBackground(new java.awt.Color(59, 89, 118));
        panelUtama.setLayout(new java.awt.BorderLayout());
        getContentPane().add(panelUtama, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDataWargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataWargaActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.setLayout(new BorderLayout());

        DataWargaNew panelWarga = new DataWargaNew(); // Ini sekarang JPanel
        panelUtama.add(panelWarga, BorderLayout.CENTER);

        panelUtama.revalidate();
        panelUtama.repaint();
        
    }//GEN-LAST:event_btnDataWargaActionPerformed

    private void btnDataPengurusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataPengurusActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.setLayout(new BorderLayout());

        DataPengurusNew panelPengurus = new DataPengurusNew();
        panelUtama.add(panelPengurus, BorderLayout.CENTER);

        panelUtama.revalidate();
        panelUtama.repaint();
    }//GEN-LAST:event_btnDataPengurusActionPerformed

    private void btnDataFasilitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDataFasilitasActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.setLayout(new BorderLayout());

        dataFasilitas panelFasilitas = new dataFasilitas();
        panelUtama.add(panelFasilitas, BorderLayout.CENTER);

        panelUtama.revalidate();
        panelUtama.repaint();
    }//GEN-LAST:event_btnDataFasilitasActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.setLayout(new BorderLayout());

        dataPindah panelPindah = new dataPindah();
        panelUtama.add(panelPindah, BorderLayout.CENTER);

        panelUtama.revalidate();
        panelUtama.repaint();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void dataWargaBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataWargaBaruActionPerformed
        // TODO add your handling code here:
        
        panelUtama.removeAll();
        panelUtama.setLayout(new BorderLayout());

        data_warga_baru panelWargaBaru = new data_warga_baru();
        panelUtama.add(panelWargaBaru, BorderLayout.CENTER);

        panelUtama.revalidate();
        panelUtama.repaint();
    }//GEN-LAST:event_dataWargaBaruActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.setLayout(new BorderLayout());

        dataKegiatan panelKegiatan = new dataKegiatan();
        panelUtama.add(panelKegiatan, BorderLayout.CENTER);

        panelUtama.revalidate();
        panelUtama.repaint();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dataKematianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataKematianActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.setLayout(new BorderLayout());

        data_kematian panelKematian = new data_kematian();
        panelUtama.add(panelKematian, BorderLayout.CENTER);

        panelUtama.revalidate();
        panelUtama.repaint();
    }//GEN-LAST:event_dataKematianActionPerformed

    private void ReportDataWargaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReportDataWargaActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.setLayout(new BorderLayout());

        laporan_data_warga panelReportWarga = new laporan_data_warga();
        panelUtama.add(panelReportWarga, BorderLayout.CENTER);

        panelUtama.revalidate();
        panelUtama.repaint();
    }//GEN-LAST:event_ReportDataWargaActionPerformed

    private void btnKematianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKematianActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.setLayout(new BorderLayout());

        laporan_data_kematian panelReportKematian = new laporan_data_kematian();
        panelUtama.add(panelReportKematian, BorderLayout.CENTER);

        panelUtama.revalidate();
        panelUtama.repaint();
    }//GEN-LAST:event_btnKematianActionPerformed

    private void btnKegiatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKegiatanActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.setLayout(new BorderLayout());

        laporan_data_kegiatan panelReportKegiatan = new laporan_data_kegiatan();
        panelUtama.add(panelReportKegiatan, BorderLayout.CENTER);

        panelUtama.revalidate();
        panelUtama.repaint();
    }//GEN-LAST:event_btnKegiatanActionPerformed

    private void btnPengurusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPengurusActionPerformed
        // TODO add your handling code here:
        panelUtama.removeAll();
        panelUtama.setLayout(new BorderLayout());

        laporan_data_pengurus panelReportPengurus = new laporan_data_pengurus();
        panelUtama.add(panelReportPengurus, BorderLayout.CENTER);

        panelUtama.revalidate();
        panelUtama.repaint();
    }//GEN-LAST:event_btnPengurusActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
        int konfirmasi = JOptionPane.showConfirmDialog(null, "Yakin ingin logout?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
    
    if(konfirmasi == JOptionPane.YES_OPTION) {
        new login().setVisible(true);
        this.dispose();
    }
    }//GEN-LAST:event_btnLogoutActionPerformed

    public static void main(String args[]) {
      
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FromUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FromUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FromUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FromUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FromUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ReportDataWarga;
    private javax.swing.JButton btnDataFasilitas;
    private javax.swing.JButton btnDataPengurus;
    private javax.swing.JButton btnDataWarga;
    private javax.swing.JButton btnKegiatan;
    private javax.swing.JButton btnKematian;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPengurus;
    private javax.swing.JButton dataKematian;
    private javax.swing.JButton dataWargaBaru;
    private javax.swing.JPanel foterPanel;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelUtama;
    // End of variables declaration//GEN-END:variables

    private static class panelUtama {

        public panelUtama() {
        }
    }
}
