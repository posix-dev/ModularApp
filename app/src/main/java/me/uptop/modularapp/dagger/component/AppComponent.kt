package me.uptop.modularapp.dagger.component

import dagger.Component
import me.uptop.modularapp.dagger.module.ActivityModule
import me.uptop.modularapp.dagger.module.AppModule
import javax.inject.Singleton

@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun plus(activityModule: ActivityModule): ActivityComponent
}