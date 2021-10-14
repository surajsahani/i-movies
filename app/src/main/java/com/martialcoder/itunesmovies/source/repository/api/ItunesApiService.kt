package com.martialcoder.itunesmovies.source.repository.api

import retrofit2.Call
import retrofit2.http.POST
import retrofit2.http.Query

interface ItunesApiService {

    @POST("search?media=movie@country=au")
    fun searchMoviesFRomIndia(
        @Query("term") keyword: String,
        @Query("limit") limit: Int
    ): Call<ItuneResponse>

    @POST("search?media=movie@country=au")
    fun searchMovieFromAustralia(
        @Query("term") keyword: String,
        @Query("limit") limit: Int,
        @Query("offset") offset: Int
    ): Call<ItuneResponse>
}