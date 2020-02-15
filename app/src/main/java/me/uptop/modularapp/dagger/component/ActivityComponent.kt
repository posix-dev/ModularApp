package me.uptop.modularapp.dagger.component

import androidx.lifecycle.ViewModelProvider
import dagger.Subcomponent
import me.uptop.auth_feature.dagger.component.AuthComponent
import me.uptop.auth_feature.dagger.module.AuthModule
import me.uptop.core.dagger.scope.ActivityScope
import me.uptop.modularapp.dagger.module.ActivityModule
import me.uptop.modularapp.ui.MainActivity

@ActivityScope
@Subcomponent(modules = [ActivityModule::class])
interface ActivityComponent {
    fun inject(activity: MainActivity)
    fun getViewModelFactory(): ViewModelProvider.Factory
    fun plus(activityModule: AuthModule): AuthComponent
}