package com.example.crazypopeye.network_manager.network

import com.example.crazypopeye.model.Example
import io.reactivex.Single
import retrofit2.http.GET

interface Api {

    @GET("/posts")
    fun getPosts(): Single<List<Example>>
}