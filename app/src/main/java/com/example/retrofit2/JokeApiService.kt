package com.example.retrofit2

import com.example.retrofit2.model.JokeResponse
import retrofit2.Response
import retrofit2.http.GET

interface JokeApiService {
    @GET("joke/any")
    suspend fun getRandomJoke(): Response<JokeResponse>
}