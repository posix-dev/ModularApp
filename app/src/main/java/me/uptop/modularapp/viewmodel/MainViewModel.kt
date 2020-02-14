package me.uptop.modularapp.viewmodel

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class MainViewModel @Inject constructor(): ViewModel() {
    fun doSome(s: String) {}
}