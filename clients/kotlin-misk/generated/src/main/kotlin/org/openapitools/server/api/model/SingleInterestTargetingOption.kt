package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SingleInterestTargetingOption(
    val childInterests: kotlin.collections.List<kotlin.String>,
    val id: kotlin.String,
    val level: kotlin.Int,
    val name: kotlin.String
)
