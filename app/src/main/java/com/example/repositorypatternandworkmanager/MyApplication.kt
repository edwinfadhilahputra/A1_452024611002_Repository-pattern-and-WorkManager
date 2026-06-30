package com.example.repositorypatternandworkmanager

import android.app.Application
import androidx.work.*
import java.util.concurrent.TimeUnit

class MyApplication : Application() {

    // Tambahkan instansiasi repositori Anda di sini agar bisa diakses oleh Worker nanti
    // Contoh:
    // lateinit var container: AppContainer
    // lateinit var repository: DataRepository

    override fun onCreate() {
        super.onCreate()

        // Inisialisasi container / database Anda di sini
        // container = DefaultAppContainer(this)
        // repository = container.dataRepository

        setupBackgroundWork()
    }

    private fun setupBackgroundWork() {
        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.UNMETERED)
            .setRequiresCharging(true)
            .build()

        val repeatingRequest = PeriodicWorkRequestBuilder<DataSyncWorker>(1, TimeUnit.DAYS)
            .setConstraints(constraints)
            .build()

        WorkManager.getInstance(applicationContext).enqueueUniquePeriodicWork(
            "RefreshDataWorkUniqueName",
            ExistingPeriodicWorkPolicy.KEEP,
            repeatingRequest
        )
    }
}