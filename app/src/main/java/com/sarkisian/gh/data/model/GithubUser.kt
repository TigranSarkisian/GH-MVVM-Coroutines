package com.sarkisian.gh.data.model

import com.google.gson.annotations.SerializedName


data class GithubUser(

    @SerializedName("login")
    val login: String,

    @SerializedName("avatar_url")
    val avatar_url: String

)