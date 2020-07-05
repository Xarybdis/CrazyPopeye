package com.example.crazypopeye.network_manager.repository

import com.example.crazypopeye.model.Example
import com.example.crazypopeye.network_manager.network.ApiCall
import io.reactivex.Single

class GeneralRepository(private val apiRequest: ApiCall = ApiCall()) {

    fun fetchPosts(): Single<List<Example>> = apiRequest.getExample()
}