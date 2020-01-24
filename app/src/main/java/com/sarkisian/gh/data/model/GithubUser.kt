package com.sarkisian.gh.data.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.sarkisian.gh.data.db.AppDatabase.Companion.USER_TABLE


@Entity(tableName = USER_TABLE)
data class GithubUser(

    @PrimaryKey
    @SerializedName("login")
    val login: String,

    @SerializedName("avatar_url")
    val avatar: String

)
