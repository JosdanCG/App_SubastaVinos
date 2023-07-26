package com.daniel.jdcg_eva03.data.retrofilt.repository

import com.daniel.jdcg_eva03.data.retrofilt.ServiceInstance
import com.daniel.jdcg_eva03.data.retrofilt.response.ApiResponse
import com.daniel.jdcg_eva03.data.retrofilt.response.WhiskiResponse

class WhiskiRepository {
    suspend fun  getWhiski():ApiResponse<WhiskiResponse>{
        return try {
            val response= ServiceInstance.getWhiskiService().getWhiskis()
            ApiResponse.Success(response)
        }catch (e : java.lang.Exception){
            ApiResponse.Error(e)
        }
    }
}