package com.sarkisian.gh.screens

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.sarkisian.gh.R
import org.koin.androidx.viewmodel.ext.android.viewModel
import timber.log.Timber

/**
 * INFO
 * https://github.com/leoacevedo/weather-app
 * https://medium.com/swlh/mvvm-on-android-with-the-architecture-components-koin-f53c3c200363
 * https://codelabs.developers.google.com/codelabs/android-room-with-a-view-kotlin/#8
 * https://proandroiddev.com/android-architecture-starring-kotlin-coroutines-jetpack-mvvm-room-paging-retrofit-and-dagger-7749b2bae5f7
 * */
class MainActivity : AppCompatActivity() {

    private val userViewModel by viewModel<UserViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userViewModel.usersLiveData.observe(this, Observer {
            Timber.i("User list: ${it.size}, first user: ${it[0].login}  ")
        })

    }

}
