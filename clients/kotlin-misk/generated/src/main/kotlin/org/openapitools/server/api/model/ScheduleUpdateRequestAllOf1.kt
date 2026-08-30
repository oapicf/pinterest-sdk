package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ScheduleUpdateRequestAllOf1(
    /** Schedule ID. */
    val id: kotlin.String,
    val entityId: kotlin.String? = null,
    /** Entity type */
    val entityType: kotlin.String? = null
)
