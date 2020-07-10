package com.example.depedencyinjection.network

import com.example.depedencyinjection.models.Movie
import io.reactivex.rxjava3.core.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by hilma on 17/06/2020.
 */
interface Service {

    @GET("discover/movie")
    fun getMovieContent(
        @Query("api_key") apiKey: String
    ): Observable<BaseResponse<Movie>>

}