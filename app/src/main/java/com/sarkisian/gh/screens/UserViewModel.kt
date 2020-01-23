package com.sarkisian.gh.screens

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sarkisian.gh.data.model.GithubUser
import com.sarkisian.gh.data.repository.UserRepository
import kotlinx.coroutines.launch
import timber.log.Timber


class UserViewModel(
    private val userRepository: UserRepository
) : ViewModel() {

    val usersLiveData: MutableLiveData<List<GithubUser>> = MutableLiveData()

    init {
        getUsers()
    }

    private fun getUsers() {
        viewModelScope.launch {
            try {
                val users = userRepository.getUsers()
                usersLiveData.postValue(users)
            } catch (ex: Exception) {
                Timber.e(ex, "Failed to fetch users!")
            }
        }
    }

}
