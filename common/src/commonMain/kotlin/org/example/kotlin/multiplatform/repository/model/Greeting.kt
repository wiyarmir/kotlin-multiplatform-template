package org.example.kotlin.multiplatform.repository.model

import org.example.kotlin.multiplatform.data.model.Greeting as DtoGreeting

data class Greeting(val message: String)

fun DtoGreeting.toModel() = Greeting(message = message)
