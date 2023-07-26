package com.daniel.jdcg_eva03.data.retrofilt

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ServiceInstance {
    private  val retrofit= Retrofit.Builder()
        .baseUrl("https://run.mocky.io/v3/")
        .client(OkHttpClient())
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    fun getWhiskiService(): WhiskiService = retrofit.create(WhiskiService::class.java)
}