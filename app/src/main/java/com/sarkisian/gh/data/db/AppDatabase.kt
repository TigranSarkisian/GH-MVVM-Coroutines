package com.sarkisian.gh.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.sarkisian.gh.data.db.AppDatabase.Companion.DB_VERSION
import com.sarkisian.gh.data.model.GithubUser

@Database(
    entities = [GithubUser::class],
    version = DB_VERSION,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {

    abstract val userDao: UserDao

    companion object {
        const val DB_VERSION = 1
        const val DB_NAME = "room.db"
        const val USER_TABLE = "USER_TABLE"
    }

}
