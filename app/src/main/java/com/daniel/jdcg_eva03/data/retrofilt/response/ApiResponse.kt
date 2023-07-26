package com.daniel.jdcg_eva03.data.retrofilt.response

sealed class ApiResponse<T>(data: T? = null, exception: java.lang.Exception? = null) {
    data class  Success<T>(val data: T): ApiResponse<T>(data)
    data class Error<T>(val exception: Exception): ApiResponse<T>(null,exception)}
