package com.sarkisian.gh.data.api


import com.sarkisian.gh.data.model.GithubUser
import kotlinx.coroutines.Deferred
import retrofit2.http.GET

interface GitHubAPI {

    @GET("users")
    fun loadUsers(): Deferred<List<GithubUser>>

}
