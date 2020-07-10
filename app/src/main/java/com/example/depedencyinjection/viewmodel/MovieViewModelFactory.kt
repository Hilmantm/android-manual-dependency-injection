package com.example.depedencyinjection.viewmodel

import com.example.depedencyinjection.network.Repository

/**
 * Created by hilma on 09/07/2020.
 */

class MovieViewModelFactory(private val repository: Repository): Factory {
    override fun <T> create(): T {
        return MovieViewModel(repository) as T
    }
}