package com.android.understandingkoin.data.api

import org.koin.dsl.module

val repoModule = module {
    single<UserRepo> {
        UserRepoImpl()
    }
}