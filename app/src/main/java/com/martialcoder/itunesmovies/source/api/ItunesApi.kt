package com.martialcoder.itunesmovies.source.api

import android.content.Context
import com.martialcoder.itunesmovies.AppApplication.Companion.globalContext
import io.requestly.android.okhttp.api.RQCollector
import io.requestly.android.okhttp.api.RQInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * A singleton implementation of the API.
 */
object ItunesApi {




    val collector = RQCollector(globalContext)
    val rqInterceptor = RQInterceptor.Builder(globalContext).collector(collector).build()
    //val mclient = OkHttpClient.Builder().addInterceptor(rqInterceptor).build()

    private val client = OkHttpClient.Builder()
        .addInterceptor(rqInterceptor)
        .build()



    /**
     * NOTE FROM DOCS : By default, Retrofit can only deserialize HTTP bodies into
     * OkHttp's  ResponseBody type and it can only accept its RequestBod2EnMQpPMy type for  @Body.
     *
     * In 2.0.0+, you need to explicitly specify you want a Gson converter:
     */
    val api = Retrofit.Builder()
        .baseUrl("https://itunes.apple.com/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(client)
        .build().create(ItunesApiService::class.java)!!




}
