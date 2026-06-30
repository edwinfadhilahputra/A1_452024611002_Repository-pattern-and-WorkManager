package com.example.repositorypatternandworkmanager

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.repositorypatternandworkmanager.ui.theme.RepositoryPatternAndWorkManagerTheme

class MainActivity : ComponentActivity() {

    // Mengambil MyViewModel menggunakan Factory yang sudah dibuat sebelumnya
    private val viewModel: MyViewModel by viewModels { MyViewModel.Factory }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RepositoryPatternAndWorkManagerTheme {
                // Menampilkan teks sederhana sebagai tanda aplikasi berhasil berjalan
                GreetingScreen(name = "Android")
            }
        }
    }
}

@Composable
fun GreetingScreen(name: String) {
    // Box ini akan memenuhi seluruh layar dan menyusun kontennya tepat di tengah
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Halo, Aplikasi $name Berhasil Berjalan Tanpa Error!")
    }
}