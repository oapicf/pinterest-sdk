package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ScheduleAgeBucketMultipliers(
    val AGE_BUCKET: kotlin.String? = null
)
