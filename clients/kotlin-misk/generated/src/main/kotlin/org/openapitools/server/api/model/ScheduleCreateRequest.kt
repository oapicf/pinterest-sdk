package org.openapitools.server.api.model

import org.openapitools.server.api.model.ScheduleAction
import org.openapitools.server.api.model.ScheduleCommonDeltaValue
import org.openapitools.server.api.model.ScheduleStatus
import org.openapitools.server.api.model.ScheduleType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ScheduleCreateRequest(
    val entityId: kotlin.String,
    /** Entity type */
    val entityType: kotlin.String,
    val deltaValue: ScheduleCommonDeltaValue,
    /** Schedule end time. Unix timestamp in seconds. */
    val endTimestamp: kotlin.Int,
    val name: kotlin.String,
    val scheduleAction: ScheduleAction,
    val scheduleStatus: ScheduleStatus,
    val scheduleType: ScheduleType,
    /** Schedule start time. Unix timestamp in seconds. */
    val startTimestamp: kotlin.Int
)
