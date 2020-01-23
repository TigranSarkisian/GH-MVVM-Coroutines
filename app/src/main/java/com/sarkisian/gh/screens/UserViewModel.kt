package com.sarkisian.gh.screens

import androidx.lifecycle.ViewModel
import com.sarkisian.gh.data.model.GithubUser
import com.sarkisian.gh.data.repository.UserRepository


class UserViewModel(
    private val userRepository: UserRepository
) : ViewModel() {

    init {
        // fetchData()
    }

    suspend fun getUsers(): List<GithubUser> {
        return userRepository.getUsers()
    }

    /*private fun fetchData() {
        viewModelScope.launch {
            try {
                _loadingState.value = LoadingState.LOADING
                userRepository.refresh()
                _loadingState.value = LoadingState.LOADED
            } catch (e: Exception) {
                _loadingState.value = LoadingState.error(e.message)
            }
        }
    }*/

}