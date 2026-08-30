package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdAccountEntityType
import org.openapitools.server.api.model.ScheduleAction
import org.openapitools.server.api.model.ScheduleDeltaValue
import org.openapitools.server.api.model.ScheduleStatus
import org.openapitools.server.api.model.ScheduleType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Schedule(
    /** entity ID. */
    val entityId: kotlin.String,
    /** Schedule ID. */
    val scheduleId: kotlin.String,
    val deltaValue: ScheduleDeltaValue? = null,
    /** Schedule end time. Unix timestamp in seconds. */
    val endTimestamp: kotlin.Int? = null,
    /** Specify the entity_type to get summary information */
    val entityType: AdAccountEntityType? = null,
    /** Schedule name. */
    val name: kotlin.String? = null,
    /** The schedule action. */
    val scheduleAction: ScheduleAction? = null,
    /** Schedule status. */
    val scheduleStatus: ScheduleStatus? = null,
    /** The schedule type. */
    val scheduleType: ScheduleType? = null,
    /** Schedule start time. Unix timestamp in seconds. */
    val startTimestamp: kotlin.Int? = null
)
