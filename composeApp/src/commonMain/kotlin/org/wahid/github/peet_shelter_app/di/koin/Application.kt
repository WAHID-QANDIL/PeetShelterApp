package org.wahid.github.peet_shelter_app.di.koin

import io.ktor.client.HttpClient
import io.ktor.client.engine.cio.CIO
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.client.plugins.defaultRequest
import io.ktor.serialization.kotlinx.json.json
import org.koin.dsl.module
import org.wahid.github.peet_shelter_app.utils.Constants.BASE_URL


//val androidModule = module {
//    single {
//        HttpClient {
//            install(ContentNegotiation) {
//                json()
//            }
//            defaultRequest {
//                url {
//                    host = BASE_URL
//                    protocol = if (BASE_URL.startsWith("https")) {
//                        io.ktor.http.URLProtocol.HTTPS
//                    } else {
//                        io.ktor.http.URLProtocol.HTTP
//                    }
//                    port = if (BASE_URL.startsWith("https")) {
//                        443
//                    } else {
//                        80
//                    }
//                }
//            }
//        }
//    }
//
//
//}

