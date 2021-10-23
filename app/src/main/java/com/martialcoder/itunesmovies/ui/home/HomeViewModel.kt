package com.martialcoder.itunesmovies.ui.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.martialcoder.itunesmovies.source.repository.MovieRepository
import com.martialcoder.itunesmovies.util.SingleLiveEvent

class HomeViewModel : ViewModel() {
    private val repository = MovieRepository()
    private val search = MutableLiveData<String>()
    private val selectedMovie = MutableLiveData<String>()

//    private val searchBundle = Transformations.map(search) {
//        if (it.isEmpty()) {
//            repository.getMovies("star")
//        } else {
//            repository.getMovies(it)
//        }
//    }

//    val searchedMovies = Transformations.switchMap(searchBundle) { it.boundary }
//    val watchedMovies = repository.getWatchHistory()
//    val viewedMovie = Transformations.switchMap(selectedMovie) { repository.getMovie(it) }

    private val _openFragment = SingleLiveEvent<Void>()
    val openFragment: LiveData<Void>
        get() {
            return _openFragment
        }

    fun search(keyword: String) {
        if (search.value != keyword) search.value = keyword
    }

    fun openMovie(movieId: String) {
        _openFragment.call()
        selectedMovie.value = movieId
    }

    fun setCount(count: Int) {
//        searchBundle.value?.itemCount?.invoke(count)
    }
}