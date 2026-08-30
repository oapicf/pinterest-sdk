package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DetailedError(
    val code: kotlin.Int,
    val details: kotlin.Any,
    val message: kotlin.String
)
