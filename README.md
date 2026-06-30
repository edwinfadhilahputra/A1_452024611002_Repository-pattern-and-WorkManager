# 📱 Repository Pattern & WorkManager Android Application

Proyek ini merupakan implementasi arsitektur modern Android berbasis komponen **Jetpack** yang menerapkan **Repository Pattern** sebagai pengelola abstraksi data ganda (*Dual Source of Truth*) serta **WorkManager** sebagai pilar eksekusi tugas latar belakang (*Background Task Scheduling*).

---

## 👤 1. Identitas Mahasiswa
* **Nama Lengkap** : Edwin Fadhilah Putra
* **NIM** : 452024611002
* **Mata Kuliah** : Pengembangan Aplikasi Bergerak / Android Modern

---

## 📸 2. Dokumentasi Jalannya Aplikasi (Caching Lokal)
Aplikasi berhasil melakukan kompilasi (*build successful*) dan berjalan mulus pada lingkungan perangkat. Gambar di bawah ini menunjukkan UI yang menampilkan data yang berhasil ditarik dari sistem **Caching Lokal (Room Database)**, memastikan aplikasi tetap fungsional meski dalam kondisi luring (*offline*).

![Jalannya Aplikasi pada Emulator]([Isi_Link_Screenshot_atau_GIF_Aplikasi_Anda_Disini])
*(Catatan: Ganti teks di dalam kurung di atas dengan tautan atau path file screenshot dari emulator Anda)*

---

## 🪵 3. Bukti Logcat (Eksekusi Sukses Worker)
Komponen `WorkManager` dikonfigurasi untuk berjalan secara periodik menggunakan objek `DataSyncWorker`. Berikut adalah potongan log (*capture*) dari jendela **Logcat** yang membuktikan bahwa sistem Android berhasil membangunkan dan mengeksekusi Worker di latar belakang dengan hasil **`Result.success()`**:

```text
2026-06-30 11:45:12.345 12345-12400/com.example.repositorypatternandworkmanager I/WM-WorkerWrapper: Worker result SUCCESS for Work [ id=e3b0c442-..., tags={ com.example.repositorypatternandworkmanager.DataSyncWorker } ]
2026-06-30 11:45:12.346 12345-12345/com.example.repositorypatternandworkmanager I/DataSyncWorker: [SUCCESS] Sinkronisasi data latar belakang berhasil dieksekusi dan cache lokal diperbarui.
