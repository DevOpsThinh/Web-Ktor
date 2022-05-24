package com.forever.bee

import io.ktor.server.engine.*
import io.ktor.server.netty.*
import com.forever.bee.plugins.*

fun main() {
    embeddedServer(Netty, port = 8081, host = "0.0.0.0") {
        configureRouting()
        configureSerialization()
        configureSecurity()
        configureHTTP()
        configureTemplating()
        configureMonitoring()
    }.start(wait = true)
}
