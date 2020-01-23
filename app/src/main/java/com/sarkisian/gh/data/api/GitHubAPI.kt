package com.sarkisian.gh.data.api


import com.sarkisian.gh.data.model.GithubUser
import retrofit2.http.GET

interface GitHubAPI {

    @GET("users")
    suspend fun loadUsers(): List<GithubUser>

}
