package com.dj.myapplication.di

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.bumptech.glide.Glide
import com.bumptech.glide.RequestManager
import com.bumptech.glide.request.RequestOptions
import com.dj.myapplication.R
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class AppModule{ //retrofit, glide etc things that do not change for entire lifecycle   provide -> inject

    @Singleton
    @Provides
    fun provideRequestOptions(): RequestOptions{
        return RequestOptions()
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
    }

    @Singleton
    @Provides
    fun provideGlideInstance(application: Application, requestOptions: RequestOptions): RequestManager{
        return Glide.with(application)
                .setDefaultRequestOptions(requestOptions)
    }

    @Singleton
    @Provides
    fun provideAppDrawable(application: Application): Drawable{
        return ContextCompat.getDrawable(application, R.drawable.ic_launcher_background)!!
    }

}