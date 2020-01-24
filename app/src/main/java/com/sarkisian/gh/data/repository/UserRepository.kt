package com.sarkisian.gh.data.repository

import com.sarkisian.gh.data.api.GitHubAPI
import com.sarkisian.gh.data.db.UserDao
import com.sarkisian.gh.data.model.GithubUser
import timber.log.Timber


class UserRepository(
    private val gitHubAPI: GitHubAPI,
    private val userDao: UserDao
) {

    suspend fun getUsers(): List<GithubUser> {
        var users: List<GithubUser>

        try {
            users = gitHubAPI.loadUsers()
            userDao.insert(users)
        } catch (ex: Exception) {
            Timber.e(ex, "Failed to load users from backend!")
            users = userDao.getUsers()
        }

        return users
    }

}
