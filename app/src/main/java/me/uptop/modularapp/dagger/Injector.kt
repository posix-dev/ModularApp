package me.uptop.modularapp.dagger

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProviders
import me.uptop.modularapp.ui.MainActivity
import me.uptop.modularapp.dagger.component.ActivityComponent
import me.uptop.modularapp.dagger.component.AppComponent
import me.uptop.modularapp.dagger.component.DaggerAppComponent
import me.uptop.modularapp.dagger.module.ActivityModule
import me.uptop.modularapp.dagger.module.AppModule

object Injector {
    private lateinit var appComponent: AppComponent
    private lateinit var activityComponent: ActivityComponent

    fun initAppComponent(application: Application) {
        appComponent = DaggerAppComponent
            .builder()
            .appModule(AppModule(application))
            .build()
    }

//    fun initTestAppComponent(application: Application) {
//        appComponent = DaggerAppComponent
//            .builder()
//            .appModule(TestAppModule(application))
//            .build()
//    }

    fun initAndInjectActivityComponent(activity: MainActivity) {
        activityComponent = appComponent.plus(ActivityModule(activity))
        activityComponent.inject(activity)
    }

    fun <VM : ViewModel> provideViewModel(fragment: Fragment, type: Class<VM>): VM =
        ViewModelProviders
            .of(
                fragment,
                activityComponent.getViewModelFactory()
            )
            .get(type)

    fun <VM : ViewModel> provideViewModel(activity: AppCompatActivity, type: Class<VM>): VM =
        ViewModelProviders
            .of(
                activity,
                activityComponent.getViewModelFactory()
            )
            .get(type)
}