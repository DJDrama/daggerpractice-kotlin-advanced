package com.dj.myapplication.di.auth

import androidx.lifecycle.ViewModel
import com.dj.myapplication.di.ViewModelKey
import com.dj.myapplication.ui.auth.AuthViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AuthViewModelsModule{
    @Binds
    @IntoMap
    @ViewModelKey(AuthViewModel::class)
    abstract fun bindAuthViewModel(authViewModel: AuthViewModel): ViewModel
}