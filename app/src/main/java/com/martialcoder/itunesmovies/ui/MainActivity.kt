package com.martialcoder.itunesmovies.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.transaction
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.martialcoder.itunesmovies.R
import com.martialcoder.itunesmovies.databinding.ActivityMainBinding
import com.martialcoder.itunesmovies.ui.detail.MovieDetailsFragment
import com.martialcoder.itunesmovies.ui.home.HomeViewModel

class MainActivity : AppCompatActivity() {

    val homeViewModel by lazy {
        ViewModelProviders.of(this)[HomeViewModel::class.java]
    }

    lateinit var binder: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binder = DataBindingUtil.setContentView(this, R.layout.activity_main)

        homeViewModel.openFragment.observe(this, Observer {
            supportFragmentManager.transaction {

                /**
                 * Using add rather than replace lets the HomeViewModel::watchedMovies
                 * forces an update trigger!
                 */
                add(R.id.container, MovieDetailsFragment())
                addToBackStack(null)
            }
        })
    }

}
