package com.sarkisian.gh.di

import com.sarkisian.gh.data.api.ApiFactory
import com.sarkisian.gh.data.repository.UserRepository
import com.sarkisian.gh.screens.UserViewModel
import org.koin.dsl.module

object AppModule {

    val viewModelModule = module {
        single { UserViewModel(get()) }
    }

    val apiModule = module {
        single { ApiFactory.gitHubAPI }
    }

    val repositoryModule = module {
        single { UserRepository(get()) }
    }

}
