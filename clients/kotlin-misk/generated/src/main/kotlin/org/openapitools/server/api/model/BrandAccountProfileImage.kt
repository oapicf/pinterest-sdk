package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BrandAccountProfileImage(
    val contentType: kotlin.String,
    val `data`: kotlin.String
)
