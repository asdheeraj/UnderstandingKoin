package com.android.understandingkoin.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.android.understandingkoin.data.api.UserRepo
import com.android.understandingkoin.data.model.User

class MainViewModel(private val userRepo: UserRepo) : ViewModel() {

    val userDetails = MutableLiveData<User>()

    fun getUserInfo() {
        userDetails.postValue(userRepo.getUserInfo())
    }
}