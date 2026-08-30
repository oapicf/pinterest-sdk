package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BoardOwner(
    val username: kotlin.String? = null
)
