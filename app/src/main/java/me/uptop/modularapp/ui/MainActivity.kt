package me.uptop.modularapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.uptop.modularapp.R
import me.uptop.modularapp.dagger.Injector
import me.uptop.modularapp.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        Injector.initAndInjectActivityComponent(this)
        super.onCreate(savedInstanceState)
        viewModel = Injector.provideViewModel(this, MainViewModel::class.java)
        setContentView(R.layout.activity_main)
    }
}
