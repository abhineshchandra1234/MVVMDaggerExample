package com.example.mvvmdaggerexample

import android.app.Application
import com.example.mvvmdaggerexample.di.DaggerRetroComponent
import com.example.mvvmdaggerexample.di.RetroComponent
import com.example.mvvmdaggerexample.di.RetroModule

class MyApplication: Application() {

    private lateinit var retroComponent: RetroComponent
    override fun onCreate() {
        super.onCreate()

        retroComponent = DaggerRetroComponent.builder()
            .retroModule(RetroModule())
            .build()
    }

    fun getRetroComponent(): RetroComponent {
        return retroComponent
    }
}