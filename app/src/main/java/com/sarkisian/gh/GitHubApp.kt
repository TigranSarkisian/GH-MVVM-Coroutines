package com.sarkisian.gh

import android.app.Application
import com.sarkisian.gh.di.AppModule.apiModule
import com.sarkisian.gh.di.AppModule.databaseModule
import com.sarkisian.gh.di.AppModule.repositoryModule
import com.sarkisian.gh.di.AppModule.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level
import timber.log.Timber


class GitHubApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Timber.plant(Timber.DebugTree())

        startKoin {
            androidLogger(Level.DEBUG)
            androidContext(this@GitHubApp)
            modules(listOf(viewModelModule, repositoryModule, apiModule, databaseModule))
        }
    }

}
