package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinterestLibError(
    val code: kotlin.Int,
    val message: kotlin.String
)
