package me.uptop.modularapp

import android.app.Application
import me.uptop.modularapp.dagger.Injector

class App: Application() {
    override fun onCreate() {
        Injector.initAppComponent(this)
        super.onCreate()
    }
}