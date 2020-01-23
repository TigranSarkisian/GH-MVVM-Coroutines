package com.sarkisian.gh.data.repository

import com.sarkisian.gh.data.api.GitHubAPI


class UserRepository(
    private val gitHubAPI: GitHubAPI
) {

    suspend fun loadUsers() = gitHubAPI.loadUsers().await()

}