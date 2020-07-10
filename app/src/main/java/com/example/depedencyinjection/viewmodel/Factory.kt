package com.example.depedencyinjection.viewmodel

/**
 * Created by hilma on 09/07/2020.
 */
interface Factory {
    fun <T> create(): T
}