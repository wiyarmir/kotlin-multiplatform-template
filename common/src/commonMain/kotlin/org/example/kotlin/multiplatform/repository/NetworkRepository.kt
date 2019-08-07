package org.example.kotlin.multiplatform.repository

import org.example.kotlin.multiplatform.data.NetworkDataSource
import org.example.kotlin.multiplatform.repository.model.Greeting
import org.example.kotlin.multiplatform.repository.model.toModel

class NetworkRepository(
    private val dataSource: NetworkDataSource
) {

    suspend fun getGreeting(who: String): Greeting =
        dataSource.getGreeting(who)
            .greeting
            .toModel()
}
