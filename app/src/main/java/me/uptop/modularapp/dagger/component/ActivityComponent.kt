package me.uptop.modularapp.dagger.component

import androidx.lifecycle.ViewModelProvider
import dagger.Subcomponent
import me.uptop.modularapp.ui.MainActivity
import me.uptop.modularapp.dagger.module.ActivityModule
import me.uptop.modularapp.dagger.scope.ActivityScope

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
    fun getViewModelFactory(): ViewModelProvider.Factory
}