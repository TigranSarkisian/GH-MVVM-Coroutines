package com.sarkisian.gh.screens

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.sarkisian.gh.R
import org.koin.androidx.viewmodel.ext.android.viewModel
import timber.log.Timber

/*
  Some other examples:
  MVP and Coroutines - https://github.com/leoacevedo/weather-app
  MVVM, Coroutines, Architecture Components + Koin - https://medium.com/swlh/mvvm-on-android-with-the-architecture-components-koin-f53c3c200363
 */
class MainActivity : AppCompatActivity() {

    private val userViewModel by viewModel<UserViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        userViewModel.usersLiveData.observe(this, Observer {
            if (it.isNotEmpty()) {
                Timber.i("User list: ${it.size}, first user: ${it[0].login}  ")

                Toast.makeText(
                    this,
                    it[0].login,
                    Toast.LENGTH_SHORT
                ).show()
            }
        })

    }

}
