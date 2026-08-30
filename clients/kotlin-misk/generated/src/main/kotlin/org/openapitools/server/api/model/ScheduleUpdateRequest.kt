package org.openapitools.server.api.model

import org.openapitools.server.api.model.ScheduleAction
import org.openapitools.server.api.model.ScheduleCommonDeltaValue
import org.openapitools.server.api.model.ScheduleStatus
import org.openapitools.server.api.model.ScheduleType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ScheduleUpdateRequest(
    /** Schedule ID. */
    val id: kotlin.String,
    val entityId: kotlin.String? = null,
    /** Entity type */
    val entityType: kotlin.String? = null,
    val deltaValue: ScheduleCommonDeltaValue? = null,
    /** Schedule end time. Unix timestamp in seconds. */
    val endTimestamp: kotlin.Int? = null,
    val name: kotlin.String? = null,
    val scheduleAction: ScheduleAction? = null,
    val scheduleStatus: ScheduleStatus? = null,
    val scheduleType: ScheduleType? = null,
    /** Schedule start time. Unix timestamp in seconds. */
    val startTimestamp: kotlin.Int? = null
)
