//package me.uptop.core.dagger.vm
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.ViewModelProvider
//import dagger.Binds
//import dagger.Module
//import dagger.multibindings.IntoMap
//import me.uptop.auth_feature.viewmodel.AuthViewModel
//import me.uptop.core.dagger.vm.ViewModelFactory
//import me.uptop.core.dagger.vm.ViewModelKey
//import me.uptop.modularapp.viewmodel.MainViewModel
//
//@Module
//interface ViewModelModule {
//
//    @Binds
//    @IntoMap
//    @ViewModelKey(MainViewModel::class)
//    fun bindMainViewModel(viewModel: MainViewModel): ViewModel
//
//    @Binds
//    @IntoMap
//    @ViewModelKey(AuthViewModel::class)
//    fun bindAuthViewModel(viewModel: AuthViewModel): ViewModel
//
//    @Binds
//    fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
//}