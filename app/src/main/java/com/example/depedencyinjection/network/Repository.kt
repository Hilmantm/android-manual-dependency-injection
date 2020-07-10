package com.example.depedencyinjection.network

import com.example.depedencyinjection.models.Movie
import io.reactivex.rxjava3.core.Observable
import retrofit2.Retrofit

/**
 * Created by hilma on 17/06/2020.
 */
class Repository(retrofit: Retrofit) {

    private val dataManager = retrofit.create(Service::class.java)

    fun getMovieContent(): Observable<BaseResponse<Movie>> = dataManager.getMovieContent("f76368dd8174f33f2ea3d5f032f831c0")

}