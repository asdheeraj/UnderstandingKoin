package com.android.understandingkoin

import android.app.Application
import com.android.understandingkoin.data.api.repoModule
import com.android.understandingkoin.ui.mainVMmodule
import org.koin.core.context.startKoin

class MainApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(
                listOf(repoModule, mainVMmodule)
            )
        }
    }
}