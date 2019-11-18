package com.dj.myapplication

import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.util.Log
import com.bumptech.glide.RequestManager

import javax.inject.Inject

import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_auth.*

class AuthActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var logo: Drawable

    @Inject
    lateinit var requestManager: RequestManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_auth)

        setLogo()
    }

    private fun setLogo(){
        requestManager.load(logo)
                .into(login_logo)
    }
}
