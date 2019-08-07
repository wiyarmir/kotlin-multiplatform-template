package org.example.kotlin.multiplatform.usecase

import org.example.kotlin.multiplatform.repository.NetworkRepository

class GetHello(
    private val networkRepository: NetworkRepository
) {
    suspend fun execute(name: String) =
        networkRepository.getGreeting(name)
}
