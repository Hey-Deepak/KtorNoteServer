package com.androiddevs

import com.androiddevs.data.collections.User
import com.androiddevs.data.registerUser
import io.ktor.application.Application
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

fun main(args: Array<String>): Unit = io.ktor.server.netty.EngineMain.main(args)

@Suppress("unused") // Referenced in application.conf
@kotlin.jvm.JvmOverloads
fun Application.module(testing: Boolean = false) {

    CoroutineScope(Dispatchers.IO).launch {
        registerUser(
            User(
                "deepak@gmail",
                "12345"
            )
        )
    }

}

