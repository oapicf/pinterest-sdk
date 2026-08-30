package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BrandAccountProfileImageUpdate(
    val contentType: kotlin.String? = null,
    val `data`: kotlin.String? = null
)
