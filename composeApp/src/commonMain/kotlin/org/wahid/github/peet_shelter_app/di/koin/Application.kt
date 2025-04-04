package org.wahid.github.peet_shelter_app.di.koin

import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.serialization.kotlinx.json.json
import org.koin.dsl.module
import org.wahid.github.peet_shelter_app.utils.Constants.BASE_URL


val androidModule = module {
    single {
        HttpClient {
            install(ContentNegotiation) {
                json()
            }
            defaultRequest {
                url(BASE_URL)
            }
        }
    }


}

