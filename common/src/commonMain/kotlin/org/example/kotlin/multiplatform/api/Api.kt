package org.example.kotlin.multiplatform.api

object Api {
    const val path = "/api"

    object V1 {
        const val path = "/v1"

        object Paths {
            const val greeting = "/greeting"
        }
    }

    fun path(path: String) = "${Api.path}${V1.path}$path"
}
