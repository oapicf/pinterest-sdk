package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Exception(
    val message: kotlin.String,
    val code: kotlin.Int? = null
)
