package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BoardSection(
    val name: kotlin.String,
    val id: kotlin.String? = null
)
