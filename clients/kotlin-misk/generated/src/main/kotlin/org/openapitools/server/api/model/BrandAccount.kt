package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BrandAccount(
    val brandAccountId: kotlin.String
)
