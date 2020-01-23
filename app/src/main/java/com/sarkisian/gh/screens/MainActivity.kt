package com.sarkisian.gh.screens

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.lifecycle.Observer
import com.sarkisian.gh.R
import org.koin.androidx.viewmodel.ext.android.viewModel

/**
 * INFO
 * https://github.com/leoacevedo/weather-app
 * https://medium.com/swlh/mvvm-on-android-with-the-architecture-components-koin-f53c3c200363
 * https://codelabs.developers.google.com/codelabs/android-room-with-a-view-kotlin/#8
 * */
class MainActivity : AppCompatActivity() {

    private val userViewModel by viewModel<UserViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*userViewModel.getUsers().observe(this, Observer {
            // Todo: Populate the recyclerView here
            it.forEach { githubUser ->
                Toast.makeText(baseContext, githubUser.login, Toast.LENGTH_SHORT).show()
            }
        })*/

    }

}
