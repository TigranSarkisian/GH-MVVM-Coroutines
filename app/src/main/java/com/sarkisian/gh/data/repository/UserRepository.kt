package com.sarkisian.gh.data.repository

import com.sarkisian.gh.data.api.GitHubAPI
import com.sarkisian.gh.data.model.GithubUser


class UserRepository(
    private val gitHubAPI: GitHubAPI
) {

    suspend fun getUsers(): List<GithubUser> {
        return gitHubAPI.loadUsers()
    }

}
