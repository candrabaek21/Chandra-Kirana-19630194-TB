/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualantiketpesawat;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cacan
 */
public class JadwalPenerbangan extends javax.swing.JFrame {
    String[] Judul={"Maskapai","No Penerbangan","Waktu","Tujuan","Bagasi","Keterangan","Economy","Business","First Class"};
   String[] Field={"maskapai","nopenerbangan","waktu","tujuan","bagasi","keterangan","ekonomi","bisnis","firstclass"};
   String SQL ="SELECT*FROM datajadwalpenerbangan";

    /**
     * Creates new form DataPesawat
     */
    public JadwalPenerbangan() {
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        textMaskapai = new javax.swing.JTextField();
        textPenerbangan = new javax.swing.JTextField();
        textBagasi = new javax.swing.JTextField();
        textWaktu = new javax.swing.JTextField();
        cbTujuan = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        buttonUbah = new javax.swing.JButton();
        buttonHapus = new javax.swing.JButton();
        buttonRefresh = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelJadwal = new javax.swing.JTable();
        textKeterangan = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        textEkonomi = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        textBisnis = new javax.swing.JTextField();
        textFirst = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("JADWAL PENERBANGAN");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel2.setText("Maskapai");

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel3.setText("No Penerbangan");

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel4.setText("Tujuan");

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel5.setText("Bagasi");

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel6.setText("Waktu");

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel7.setText("Keterangan");

        textMaskapai.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N

        textPenerbangan.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N

        textBagasi.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N

        textWaktu.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N

        cbTujuan.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        cbTujuan.setForeground(new java.awt.Color(102, 153, 255));
        cbTujuan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih", "Jakarta - Banjarmasin", "Banjarmasin - Jakarta", "Jakarta - Surabaya", "Surabaya - Jakarta" }));
        cbTujuan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTujuanActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 153, 255));
        jButton1.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jButton1.setText("Masukkan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonUbah.setBackground(new java.awt.Color(102, 153, 255));
        buttonUbah.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        buttonUbah.setText("Ubah");
        buttonUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonUbahActionPerformed(evt);
            }
        });

        buttonHapus.setBackground(new java.awt.Color(255, 102, 102));
        buttonHapus.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        buttonHapus.setText("Hapus");
        buttonHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonHapusActionPerformed(evt);
            }
        });

        buttonRefresh.setBackground(new java.awt.Color(102, 153, 255));
        buttonRefresh.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        buttonRefresh.setText("Refresh");
        buttonRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRefreshActionPerformed(evt);
            }
        });

        tabelJadwal.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        tabelJadwal.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Maskapai", "No Penerbangan", "Tujuan", "Bagasi", "Waktu", "Keterangan", "Economy", "Business", "First Class"
            }
        ));
        tabelJadwal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelJadwalMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelJadwal);

        textKeterangan.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel8.setText("Harga Tiket");

        textEkonomi.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel9.setText("Economy");
        jLabel9.setToolTipText("");

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel10.setText("Business");

        textBisnis.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N

        textFirst.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jLabel11.setText("First Class");

        jLabel12.setText("Rp.");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Trebuchet MS", 0, 11)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/The Noun Project_1.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(textEkonomi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textBisnis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10)))
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textFirst, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel11)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(148, 148, 148)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(textMaskapai)
                                            .addComponent(textPenerbangan)
                                            .addComponent(cbTujuan, 0, 245, Short.MAX_VALUE))
                                        .addComponent(textBagasi, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(textKeterangan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textWaktu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(buttonHapus)
                                .addGap(135, 135, 135)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(123, 123, 123)
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonUbah)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(buttonRefresh))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbTujuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textMaskapai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textPenerbangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textBagasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textWaktu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textKeterangan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textEkonomi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textBisnis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textFirst, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel12))
                .addGap(75, 75, 75)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonRefresh)
                    .addComponent(buttonUbah)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonHapus)
                    .addComponent(jButton2)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbTujuanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTujuanActionPerformed
        if(cbTujuan.getSelectedItem().equals("Pilih")){
         textMaskapai.setText("");
         textPenerbangan.setText("");
         textBagasi.setText("");
         textWaktu.setText("");
         textKeterangan.setText("");
         textEkonomi.setText("");
     } else if(cbTujuan.getSelectedItem().equals("Jakarta - Banjarmasin")){
         textMaskapai.setText("Lion Air");
         textPenerbangan.setText("JT 610");
         textBagasi.setText("06");
         textWaktu.setText("13:20,27 Desember");
         textKeterangan.setText("Berangkat");
         textEkonomi.setText("799200");
         textBisnis.setText("2032200");
         textFirst.setText("5100200");
     }else if(cbTujuan.getSelectedItem().equals("Banjarmasin - Jakarta")){
         textMaskapai.setText("Lion Air");
         textPenerbangan.setText("JT 610");
         textBagasi.setText("06");
         textWaktu.setText("16:10,28 Desember");
         textKeterangan.setText("Dibatalkan");
         textEkonomi.setText("845800");
         textBisnis.setText("3032200");
         textFirst.setText("6100200");
     }else if(cbTujuan.getSelectedItem().equals("Jakarta - Surabaya")){
         textMaskapai.setText("Citilink Indonesia");
         textPenerbangan.setText("QG 300");
         textBagasi.setText("3U");
         textWaktu.setText("20:30,27 Desember");
         textKeterangan.setText("Berangkat");
         textEkonomi.setText("908400");
         textBisnis.setText("4032200");
         textFirst.setText("5092200");
     }else if(cbTujuan.getSelectedItem().equals("Surabaya - Jakarta")){
         textMaskapai.setText("Citilink Indonesia");
         textPenerbangan.setText("QG 0001");
         textBagasi.setText("3U");
         textWaktu.setText("00:45,27 Desember");
         textKeterangan.setText("Mendarat");
         textEkonomi.setText("908400");
         textBisnis.setText("4400200");
         textFirst.setText("7100200");
     }
    }//GEN-LAST:event_cbTujuanActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 DefaultTableModel model = (DefaultTableModel) tabelJadwal.getModel();
        if (textMaskapai.getText().trim().equals("")){
 JOptionPane.showMessageDialog(null, "Maskapai Belum diisi");
 textMaskapai.requestFocus();
 }else if (textPenerbangan.getText().trim().equals("")){
 JOptionPane.showMessageDialog(null, "No Penerbangan Belum diisi");
 textPenerbangan.requestFocus();
 }else if (textWaktu.getText().trim().equals("")){
 JOptionPane.showMessageDialog(null, "Waktu Belum diisi");
 textWaktu.requestFocus();
 }else if (cbTujuan.getSelectedItem().toString().equals("")){
 JOptionPane.showMessageDialog(null, "Waktu Belum diisi");
 cbTujuan.requestFocus();
 }else if (textBagasi.getText().trim().equals("")){
 JOptionPane.showMessageDialog(null, "Bagasi Belum diisi");
 textBagasi.requestFocus();
 }else if (textKeterangan.getText().trim().equals("")){
 JOptionPane.showMessageDialog(null, "Keterangan Belum diisi");
 textKeterangan.requestFocus();
 }else if (textEkonomi.getText().trim().equals("")){
 JOptionPane.showMessageDialog(null, "Waktu Belum diisi");
 textEkonomi.requestFocus();
 }else if (textBisnis.getText().trim().equals("")){
 JOptionPane.showMessageDialog(null, "Waktu Belum diisi");
 textBisnis.requestFocus();
 }else if (textFirst.getText().trim().equals("")){
 JOptionPane.showMessageDialog(null, "Waktu Belum diisi");
 textFirst.requestFocus();
 }else{
     String[] field ={"maskapai","nopenerbangan","waktu","tujuan","bagasi","keterangan","ekonomi","bisnis","firstclass"};
     String[] isi ={textMaskapai.getText(),textPenerbangan.getText(),textWaktu.getText(),cbTujuan.getSelectedItem().toString(),
         textBagasi.getText(),textKeterangan.getText(),textEkonomi.getText(),textBisnis.getText(),textFirst.getText()};
 new Koneksi().SimpanDinamis("datajadwalpenerbangan", field, isi);
 new Koneksi().settingJudulTabel(tabelJadwal, Judul);
 new Koneksi().tampilTabel(tabelJadwal, SQL, Judul);
 }
        model.addRow(new Object[]{textMaskapai.getText(),textPenerbangan.getText(),textWaktu.getText(),cbTujuan.getSelectedItem().toString(),
     textBagasi.getText(),textKeterangan.getText(),textEkonomi.getText(),textBisnis.getText(),textFirst.getText()});
 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tabelJadwalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelJadwalMouseClicked
         int row = tabelJadwal.getSelectedRow();
        textMaskapai.setText(tabelJadwal.getModel().getValueAt(row,0).toString());
        textPenerbangan.setText(tabelJadwal.getModel().getValueAt(row,1).toString());
        textWaktu.setText(tabelJadwal.getModel().getValueAt(row,2).toString());
        cbTujuan.setSelectedItem(tabelJadwal.getModel().getValueAt(row,3).toString());
        textBagasi.setText(tabelJadwal.getModel().getValueAt(row,4).toString());
        textKeterangan.setText(tabelJadwal.getModel().getValueAt(row,5).toString());
        textEkonomi.setText(tabelJadwal.getModel().getValueAt(row,6).toString());
        textBisnis.setText(tabelJadwal.getModel().getValueAt(row,7).toString());
        textFirst.setText(tabelJadwal.getModel().getValueAt(row,8).toString());
    }//GEN-LAST:event_tabelJadwalMouseClicked

    private void buttonUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonUbahActionPerformed
        try {
            String[] field = {"maskapai","nopenerbangan","tujuan","bagasi","waktu","keterangan","ekonomi","bisnis","firstclass"};
            String[] isi = {textMaskapai.getText(),textPenerbangan.getText(),textWaktu.getText(),cbTujuan.getSelectedItem().toString(),textBagasi.getText(),textKeterangan.getText(),textEkonomi.getText(),textBisnis.getText(),textFirst.getText()};
            new Koneksi().UbahDinamis("datajadwalpenerbangan", "maskapai", textMaskapai.getText(), field, field);
            JOptionPane.showMessageDialog(null, "Data Berhasil di Edit");
            new Koneksi().settingJudulTabel(tabelJadwal, Judul);
            new Koneksi().tampilTabel(tabelJadwal, SQL, Judul);
        } catch (Exception e){
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_buttonUbahActionPerformed

    private void buttonHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonHapusActionPerformed
        new Koneksi().HapusDinamis("datajadwalpenerbangan", "maskapai", textMaskapai.getText());
        JOptionPane.showMessageDialog(null, "Berhasil Dihapus");
        new Koneksi().settingJudulTabel(tabelJadwal, Judul);
        new Koneksi().tampilTabel(tabelJadwal, SQL, Judul);
        textMaskapai.setText("");
        textPenerbangan.setText("");
        textWaktu.setText("");
        cbTujuan.setSelectedItem("");
        textBagasi.setText("");
        textKeterangan.setText("");
        textEkonomi.setText("");
        textBisnis.setText("");
        textFirst.setText("");
    }//GEN-LAST:event_buttonHapusActionPerformed

    private void buttonRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRefreshActionPerformed
         textMaskapai.setText("");
        textPenerbangan.setText("");
        textWaktu.setText("");
        textBagasi.setText("");
        textKeterangan.setText("");
        textEkonomi.setText("");
        textBisnis.setText("");
        textFirst.setText("");
    }//GEN-LAST:event_buttonRefreshActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new MenuUtama().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(JadwalPenerbangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JadwalPenerbangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JadwalPenerbangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JadwalPenerbangan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JadwalPenerbangan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonHapus;
    private javax.swing.JButton buttonRefresh;
    private javax.swing.JButton buttonUbah;
    private javax.swing.JComboBox<String> cbTujuan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelJadwal;
    private javax.swing.JTextField textBagasi;
    private javax.swing.JTextField textBisnis;
    private javax.swing.JTextField textEkonomi;
    private javax.swing.JTextField textFirst;
    private javax.swing.JTextField textKeterangan;
    private javax.swing.JTextField textMaskapai;
    private javax.swing.JTextField textPenerbangan;
    private javax.swing.JTextField textWaktu;
    // End of variables declaration//GEN-END:variables
}
