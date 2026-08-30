package org.openapitools.server.api.model

import org.openapitools.server.api.model.Schedule
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SchedulesList200Response(
    val items: kotlin.collections.List<Schedule>,
    val bookmark: kotlin.String? = null
)
