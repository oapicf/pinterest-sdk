package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TargetingSpecOperationMaximumAge(
    val `field`: kotlin.String,
    val operation: kotlin.String,
    val `value`: kotlin.String
)
