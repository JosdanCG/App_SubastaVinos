package com.daniel.jdcg_eva03.data.retrofilt

import com.daniel.jdcg_eva03.data.retrofilt.response.WhiskiResponse
import retrofit2.http.GET

interface WhiskiService {
    @GET("f8c762f6-a9e0-4e7c-953c-29b39fc1ba70")
    suspend fun  getWhiskis(): WhiskiResponse
}