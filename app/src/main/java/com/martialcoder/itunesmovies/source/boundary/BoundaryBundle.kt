package com.martialcoder.itunesmovies.source.boundary

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.martialcoder.itunesmovies.source.api.Movie

/**
 * This packages the Boundary and the trigger for count.
 */
data class BoundaryBundle<T : Any>(
    val boundary: LiveData<PagedList<T>>,
    val itemCount: (Int) -> Unit
) : @JvmSuppressWildcards List<Movie> {
    override val size: Int
        get() = TODO("Not yet implemented")

    override fun contains(element: Movie): Boolean {
        TODO("Not yet implemented")
    }

    override fun containsAll(elements: Collection<Movie>): Boolean {
        TODO("Not yet implemented")
    }

    override fun get(index: Int): Movie {
        TODO("Not yet implemented")
    }

    override fun indexOf(element: Movie): Int {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun iterator(): Iterator<Movie> {
        TODO("Not yet implemented")
    }

    override fun lastIndexOf(element: Movie): Int {
        TODO("Not yet implemented")
    }

    override fun listIterator(): ListIterator<Movie> {
        TODO("Not yet implemented")
    }

    override fun listIterator(index: Int): ListIterator<Movie> {
        TODO("Not yet implemented")
    }

    override fun subList(fromIndex: Int, toIndex: Int): List<Movie> {
        TODO("Not yet implemented")
    }
}