package org.example.kotlin.multiplatform.data.responses

import kotlinx.serialization.Serializable
import org.example.kotlin.multiplatform.data.model.Greeting

@Serializable
data class HelloResponse(val greeting: Greeting)
