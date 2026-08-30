package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ScheduleCreateRequestAllOf1(
    val entityId: kotlin.String,
    /** Entity type */
    val entityType: kotlin.String
)
