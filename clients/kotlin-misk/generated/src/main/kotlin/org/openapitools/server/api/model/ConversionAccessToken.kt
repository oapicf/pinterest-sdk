package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionAccessToken(
    val accessToken: kotlin.String,
    val tokenType: kotlin.String? = "conversion"
)
