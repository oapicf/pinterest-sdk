package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsFeedProcessingScheduleTimezone
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsFeedProcessingSchedule(
    /** A time in format HH:MM with leading 0 (zero) */
    val time: kotlin.String,
    /** The timezone considered for the processing schedule time. */
    val timezone: CatalogsFeedProcessingScheduleTimezone
)
