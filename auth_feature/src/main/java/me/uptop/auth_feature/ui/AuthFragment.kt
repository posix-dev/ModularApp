package me.uptop.auth_feature.ui

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import me.uptop.auth_feature.viewmodel.AuthViewModel

class AuthFragment: Fragment() {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        Injector.provideViewModel(this, AuthViewModel::class.java)
    }
}