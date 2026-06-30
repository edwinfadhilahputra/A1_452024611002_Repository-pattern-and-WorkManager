package com.example.repositorypatternandworkmanager

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.lifecycle.viewmodel.initializer
import androidx.lifecycle.viewmodel.viewModelFactory
import kotlinx.coroutines.launch

class MyViewModel(private val repository: DataRepository) : ViewModel() {

    init {
        refresh()
    }

    fun refresh() {
        viewModelScope.launch {
            try {
                repository.refreshData()
            } catch (e: Exception) {
                // Penanganan error jaringan jika diperlukan
            }
        }
    }

    companion object {
        val Factory: ViewModelProvider.Factory = viewModelFactory {
            initializer {
                // Instansiasi langsung yang aman
                val repository = DataRepository()
                MyViewModel(repository = repository)
            }
        }
    }
}