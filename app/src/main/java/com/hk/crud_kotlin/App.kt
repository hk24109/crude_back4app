package com.hk.crud_kotlin

import android.app.Application
import com.demarkelabs.android_parsesdk_kotlin.R
import com.parse.Parse

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Parse.initialize(
            Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.back4app_app_id))
                .clientKey(getString(R.string.back4app_client_key))
                .server(getString(R.string.back4app_server_url))
                .build()
        )
    }

}