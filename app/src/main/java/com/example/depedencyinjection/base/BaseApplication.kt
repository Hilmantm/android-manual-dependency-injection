package com.example.depedencyinjection.base

import android.app.Application

/**
 * Created by hilma on 09/07/2020.
 */
class BaseApplication: Application() {
    val appContainer = AppContainer()
}