# Aplikasi Pendataan Warga RT/RW 05/05

Aplikasi desktop berbasis **Java NetBeans** untuk mengelola data kependudukan RT 005 RW 005, Kelurahan Kunciran Indah, Kecamatan Pinang, Kota Tangerang. Aplikasi ini dibuat sebagai bagian dari Program Studi Teknik Informatika, Fakultas Teknik dan Ilmu Komputer, Universitas Indraprasta PGRI (2026).

## Fitur

### Login dan Logout
- Login dengan username dan password (tombol **Login** dan **Clear**)
- Logout dari halaman utama untuk kembali ke halaman login

### Dashboard
- Halaman utama dengan menu **Master**, **Transaksi**, dan **Report**

### Data Master (CRUD)
- **Data Warga**: identitas, alamat, pendidikan, pekerjaan, agama, dan status
- **Data Pengurus**: identitas, jabatan, wilayah RT/RW, dan masa jabatan
- **Data Fasilitas**: nama, jenis, kondisi, kapasitas, lokasi, dan status fasilitas

### Data Transaksi (CRUD)
- **Data Pindah**: warga yang pindah beserta alamat dan kota tujuan
- **Data Kegiatan**: kegiatan warga, jadwal, fasilitas, dan jumlah peserta
- **Data Warga Baru**: warga yang baru masuk beserta asal daerah dan status keluarga
- **Data Kematian**: warga yang meninggal, waktu, dan lokasi pemakaman

Setiap form memiliki tombol **Clear**, **Save**, **Edit**, **Delete**, tabel preview data, dan kolom pencarian (**Cari**).

### Laporan
- Laporan Data Warga
- Laporan Data Kematian
- Laporan Data Kegiatan
- Laporan Data Pengurus

Setiap laporan memiliki tombol **Print**, **Tambah Data**, dan kolom pencarian.

## Teknologi
- Java (NetBeans)
- MySQL (XAMPP)
- iReport (untuk pembuatan laporan)

## Cara Menjalankan
1. Install JDK, NetBeans, dan XAMPP.
2. Jalankan **Apache** dan **MySQL** di XAMPP.
3. Buka phpMyAdmin, buat database baru, lalu import file `.sql` dari folder `database/`.
4. Clone repo ini:
   ```
   git clone https://github.com/ArvansyahSaputra/NAMA-REPO.git
   ```
5. Buka NetBeans, pilih **File** > **Open Project**, lalu pilih folder hasil clone.
6. Sesuaikan koneksi database (nama database, user, password) pada class koneksi jika perlu.
7. Klik **Run Project** (F6).

## Struktur Folder
- `src/` : source code aplikasi
- `nbproject/` : konfigurasi project NetBeans
- `database/` : file database (`.sql`)

## Author
Arfansyah Saputra dkk
Program Studi Teknik Informatika, Universitas Indraprasta PGRI
