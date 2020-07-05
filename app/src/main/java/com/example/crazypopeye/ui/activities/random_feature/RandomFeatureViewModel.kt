package com.example.crazypopeye.ui.activities.random_feature

import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModel
import com.example.crazypopeye.R
import com.example.crazypopeye.model.Example
import com.example.crazypopeye.network_manager.repository.GeneralRepository
import io.reactivex.SingleObserver
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers


class RandomFeatureViewModel(private val repository: GeneralRepository = GeneralRepository()) :
    ViewModel() {
    var randomText: String = " "

    fun fetchPosts() {
        repository.fetchPosts()
            .subscribeOn(Schedulers.io())
            .subscribe(object : SingleObserver<List<Example>> {
                override fun onSuccess(value: List<Example>) {
                    for (example in value) {
                        println("Here is:" + example.body)
                        randomText = example.body.toString()
                    }
                }

                override fun onSubscribe(d: Disposable?) {
                    println("Here")
                }

                override fun onError(e: Throwable?) {
                    println("Error : " + e?.localizedMessage)
                }
            })
    }

}