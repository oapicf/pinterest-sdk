package org.openapitools.server.api.model

import org.openapitools.server.api.model.PinterestLibError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SchedulesCreate200ResponseInnerDataOneOf(
    val id: kotlin.String,
    /** Schedule ID. */
    val scheduleId: kotlin.String,
    val exceptions: PinterestLibError
)
