package org.example.kotlin.multiplatform.data.responses

import kotlinx.serialization.Serializable

@Serializable
data class ErrorResponse(val message: String)
