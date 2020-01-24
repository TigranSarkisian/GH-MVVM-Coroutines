package com.sarkisian.gh.di

import androidx.room.Room
import com.sarkisian.gh.data.api.ApiFactory
import com.sarkisian.gh.data.db.AppDatabase
import com.sarkisian.gh.data.db.AppDatabase.Companion.DB_NAME
import com.sarkisian.gh.data.repository.UserRepository
import com.sarkisian.gh.screens.UserViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

object AppModule {

    val viewModelModule = module {
        viewModel {
            UserViewModel(get())
        }
    }

    val apiModule = module {
        single {
            ApiFactory.gitHubAPI
        }
    }

    val repositoryModule = module {
        single {
            UserRepository(get(), get())
        }
    }

    val databaseModule = module {
        single {
            Room.databaseBuilder(
                androidApplication(),
                AppDatabase::class.java,
                DB_NAME
            )
                .fallbackToDestructiveMigration()
                .build()
        }

        single {
            get<AppDatabase>().userDao
        }
    }

}
