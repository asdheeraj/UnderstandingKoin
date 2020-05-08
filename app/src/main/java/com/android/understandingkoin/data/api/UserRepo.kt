package com.android.understandingkoin.data.api

import com.android.understandingkoin.data.model.User

interface UserRepo {

    fun getUserInfo(): User
}