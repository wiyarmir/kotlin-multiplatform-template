package org.example.kotlin.multiplatform.data

import io.ktor.client.HttpClient
import io.ktor.client.features.defaultRequest
import io.ktor.client.features.json.Json
import io.ktor.client.features.json.serializer.KotlinxSerializer
import io.ktor.client.features.logging.DEFAULT
import io.ktor.client.features.logging.LogLevel
import io.ktor.client.features.logging.Logger
import io.ktor.client.features.logging.Logging
import io.ktor.client.request.get
import io.ktor.http.URLProtocol
import io.ktor.http.encodeURLPath
import kotlinx.serialization.json.Json
import org.example.kotlin.multiplatform.api.Api
import org.example.kotlin.multiplatform.api.Api.V1.Paths.greeting
import org.example.kotlin.multiplatform.data.responses.HelloResponse

class NetworkDataSource(networkConfig: NetworkConfig = defaultNetworkConfig) {

    private val httpClient: HttpClient =
        makeHttpClient(networkConfig)

    suspend fun getGreeting(who: String): HelloResponse =
        httpClient.get<HelloResponse>(
            path = Api.path(greeting)
        ) {
            url {
                encodedPath += "/${who.encodeURLPath()}"
            }
        }
}

private val json = Json { isLenient = true }

private fun makeHttpClient(
    networkConfig: NetworkConfig
): HttpClient = HttpClient {
    defaultRequest {
        url {
            host = networkConfig.host
            port = networkConfig.port
            protocol = if (networkConfig.secure) URLProtocol.HTTPS else URLProtocol.HTTP
        }
    }
    Json {
        serializer = KotlinxSerializer(json = json)
    }
    Logging {
        logger = Logger.DEFAULT
        level = LogLevel.INFO
    }
}

val defaultNetworkConfig = NetworkConfig()
