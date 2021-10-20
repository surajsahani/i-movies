package com.martialcoder.itunesmovies.ui.home

import androidx.recyclerview.widget.RecyclerView
import com.martialcoder.itunesmovies.R
import com.martialcoder.itunesmovies.databinding.ItemSearchedMovieBinding
import com.martialcoder.itunesmovies.databinding.ItemWatchedMovieBinding
import com.martialcoder.itunesmovies.source.cache.MovieEntity
import com.martialcoder.itunesmovies.util.toCurrency
import com.squareup.picasso.Picasso

/**
 * Manages how the [ItemSearchedMovieBinding] will look like and its state!
 */
class SearchResultViewHolder(private val binder: ItemSearchedMovieBinding) : RecyclerView.ViewHolder(binder.root) {

    /**
     * Set the movie information to the View.
     */
    fun init(item: MovieEntity) {
        binder.movie = item
        binder.apply {
            movieTitle.text = item.name
            price.text = item.price.toCurrency(item.currency)
            movieShortDesc.text = item.shortDesc
            genre.text = item.genre
            Picasso.get()
                .load(item.image)
                .placeholder(R.drawable.ic_film)
                .centerCrop()
                .fit()
                .into(movieImage)
        }
    }

    /**
     * Remove the movie information from the view.
     */
    fun clear() {
        binder.movie = null
        binder.apply {
            movieImage.setImageBitmap(null)
            movieTitle.text = null
            price.text = null
            movieShortDesc.text = null
            genre.text = null
        }
    }
}

/**
 * Manages how the [ItemWatchedMovieBinding] will look like and its state!
 */
class WatchResultViewHolder(val binder: ItemWatchedMovieBinding) : RecyclerView.ViewHolder(binder.root)