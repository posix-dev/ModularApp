package me.uptop.modularapp.dagger.module

import androidx.appcompat.app.AppCompatActivity
import dagger.Module
import dagger.Provides
import me.uptop.modularapp.ui.MainActivity
import me.uptop.modularapp.dagger.vm.ViewModelModule

@Module(includes = [ViewModelModule::class])
class ActivityModule(private val activity: MainActivity) {
    @Provides
    fun provideActivity(): AppCompatActivity = activity
}