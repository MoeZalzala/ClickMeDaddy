package com.example.retrofit2

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object API {
    private val retrofit = Retrofit.Builder()
        .baseUrl("https://v2.jokeapi.dev/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    val apiService: JokeApiService = retrofit.create(JokeApiService::class.java)
}