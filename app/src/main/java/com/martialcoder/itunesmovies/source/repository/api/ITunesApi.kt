package com.martialcoder.itunesmovies.source.repository.api

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ITunesApi {

    private val client = OkHttpClient.Builder()
        .build()

    val api = Retrofit.Builder()
        .baseUrl("http://itunes.apple.com")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build().create(ItunesApiService::class.java)
}