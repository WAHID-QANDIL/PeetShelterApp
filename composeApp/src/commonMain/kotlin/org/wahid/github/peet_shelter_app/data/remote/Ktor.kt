package org.wahid.github.peet_shelter_app.data.remote

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.serialization.kotlinx.json.json

object Ktor {
    const val BASE_URL = "https://freetestapi.com/api/v1/"

    val client: HttpClient = HttpClient {
        install(ContentNegotiation) {
            json()
        }
        defaultRequest {
            url {
                host = BASE_URL
                protocol = if (BASE_URL.startsWith("https")) {
                    io.ktor.http.URLProtocol.HTTPS
                } else {
                    io.ktor.http.URLProtocol.HTTP
                }
                port = if (BASE_URL.startsWith("https")) {
                    443
                } else {
                    80
                }
            }
        }
    }


}