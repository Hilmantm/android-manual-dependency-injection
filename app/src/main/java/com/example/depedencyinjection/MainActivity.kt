package com.example.depedencyinjection

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.depedencyinjection.adapter.MovieAdapter
import com.example.depedencyinjection.base.BaseApplication
import com.example.depedencyinjection.network.Repository
import com.example.depedencyinjection.network.Retrofit
import com.example.depedencyinjection.viewmodel.MovieViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var rvMovie: RecyclerView
    private lateinit var movieAdapter: MovieAdapter

    private lateinit var movieViewModel: MovieViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvMovie = findViewById(R.id.rv_movie)
        rvMovie.layoutManager = LinearLayoutManager(this)

        val appContainer = (application as BaseApplication).appContainer
        movieViewModel = appContainer.movieViewModel.create()
        movieViewModel.getMovieContent()

        observeViewModel()
    }

    private fun observeViewModel() {
        movieViewModel.getResults().observe(this, Observer {
            if(it.isNotEmpty()) {
                movieAdapter = MovieAdapter(it)
                rvMovie.adapter = movieAdapter
            }
        })
    }
}