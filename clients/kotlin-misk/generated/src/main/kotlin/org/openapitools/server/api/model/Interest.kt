package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Interest(
    val canonicalUrl: kotlin.String? = null,
    val id: kotlin.String? = null,
    val key: kotlin.String? = null,
    val name: kotlin.String? = null
)
