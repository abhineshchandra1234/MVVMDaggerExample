package com.example.mvvmdaggerexample.di

import com.example.mvvmdaggerexample.model.RecyclerList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroServiceInterface {

    @GET("repositories")
    fun getDataFromAPI(@Query("q")query: String): Call<RecyclerList>?
}