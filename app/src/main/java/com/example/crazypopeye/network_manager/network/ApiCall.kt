package com.example.crazypopeye.network_manager.network

import com.example.crazypopeye.model.Example
import io.reactivex.Single

class ApiCall(private val serviceOps: ServiceOps = ServiceOps()) {

    fun getExample(): Single<List<Example>> = serviceOps.createService().getPosts()
}