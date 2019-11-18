package com.dj.myapplication.di

import com.dj.myapplication.di.auth.AuthViewModelsModule
import com.dj.myapplication.ui.auth.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule{

    @ContributesAndroidInjector(
            modules = [AuthViewModelsModule::class]
    )
    abstract fun contributeAuthActivity(): AuthActivity

}