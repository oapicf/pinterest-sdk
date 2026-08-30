@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ScheduleCreateRequest(
    @field:JsonProperty("entity_id")
    val entityId: kotlin.String,

    @field:JsonProperty("entity_type")
    val entityType: kotlin.String,

    @field:JsonProperty("delta_value")
    val deltaValue: ScheduleCommonDeltaValue,

    @field:JsonProperty("end_timestamp")
    val endTimestamp: kotlin.Int,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("schedule_action")
    val scheduleAction: ScheduleAction,

    @field:JsonProperty("schedule_status")
    val scheduleStatus: ScheduleStatus,

    @field:JsonProperty("schedule_type")
    val scheduleType: ScheduleType,

    @field:JsonProperty("start_timestamp")
    val startTimestamp: kotlin.Int,

)
