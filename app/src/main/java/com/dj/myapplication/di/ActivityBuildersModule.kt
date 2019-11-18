package com.dj.myapplication.di

import com.dj.myapplication.AuthActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule{

    @ContributesAndroidInjector
    abstract fun contributeAuthActivity(): AuthActivity

}