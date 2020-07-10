package com.example.depedencyinjection.base

import com.example.depedencyinjection.network.Repository
import com.example.depedencyinjection.network.Retrofit
import com.example.depedencyinjection.viewmodel.MovieViewModelFactory

/**
 * Created by hilma on 09/07/2020.
 */
class AppContainer {
    private val retrofit = Retrofit().getRetrofit()
    private val repository = Repository(retrofit)
    val movieViewModel = MovieViewModelFactory(repository)
}