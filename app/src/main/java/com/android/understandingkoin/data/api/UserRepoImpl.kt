package com.android.understandingkoin.data.api

import com.android.understandingkoin.data.model.User

class UserRepoImpl: UserRepo {

    override fun getUserInfo() = User(name = "John", age = 20)

}