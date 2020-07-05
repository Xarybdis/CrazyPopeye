package com.example.crazypopeye.ui.activities.random_feature

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.crazypopeye.R
import com.example.crazypopeye.databinding.ActivityRandomFeatureBinding
import kotlinx.android.synthetic.main.activity_random_feature.*

class RandomFeature : AppCompatActivity() {
    lateinit var viewModel: RandomFeatureViewModel
    lateinit var binding: ActivityRandomFeatureBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_random_feature)

        viewModel = ViewModelProvider(this).get(RandomFeatureViewModel::class.java)
        viewModel.fetchPosts()

        binding.viewModel = viewModel
    }
}