package com.forever.bee

import io.ktor.server.routing.*
import io.ktor.http.*
import io.ktor.serialization.gson.*
import io.ktor.server.plugins.contentnegotiation.*
import io.ktor.server.auth.*
import io.ktor.util.*
import io.ktor.server.plugins.partialcontent.*
import io.ktor.server.plugins.statuspages.*
import io.ktor.server.sessions.*
import io.ktor.server.http.content.*
import io.ktor.server.html.*
import kotlinx.html.*
import kotlinx.css.*
import io.ktor.server.plugins.callloging.*
import org.slf4j.event.*
import io.ktor.server.request.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.client.request.*
import io.ktor.client.statement.*
import kotlin.test.*
import io.ktor.server.testing.*
import com.forever.bee.plugins.*

class ApplicationTest {
    @Test
    fun testRoot() = testApplication {
        application {
            configureRouting()
        }
        client.get("/").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("Hello World!", bodyAsText())
        }
    }
}