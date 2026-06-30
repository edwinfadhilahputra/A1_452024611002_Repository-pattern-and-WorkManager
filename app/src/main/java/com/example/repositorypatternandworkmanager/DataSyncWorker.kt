package com.example.repositorypatternandworkmanager

import android.content.Context
import android.util.Log
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class DataSyncWorker(
    appContext: Context,
    params: WorkerParameters
) : CoroutineWorker(appContext, params) {

    override suspend fun doWork(): Result {
        return try {
            Log.d("DataSyncWorker", "Memulai sinkronisasi data di latar belakang...")

            // TODO: Panggil repositori Anda di sini untuk mengambil data dari internet
            // Contoh: repository.refreshData()

            Log.d("DataSyncWorker", "Sinkronisasi berhasil!")
            Result.success()
        } catch (e: Exception) {
            Log.e("DataSyncWorker", "Sinkronisasi gagal, mencoba kembali nanti.", e)
            Result.retry()
        }
    }
}