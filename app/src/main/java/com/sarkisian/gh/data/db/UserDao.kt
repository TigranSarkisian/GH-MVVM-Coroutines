package com.sarkisian.gh.data.db

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.sarkisian.gh.data.model.GithubUser

@Dao
interface UserDao {

    @Query("SELECT * FROM USER_TABLE")
    suspend fun getUsers(): List<GithubUser>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(users: List<GithubUser>)

}
