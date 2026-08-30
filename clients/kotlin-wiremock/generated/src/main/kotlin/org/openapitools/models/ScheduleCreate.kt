@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ScheduleCreate(
    @field:JsonProperty("entity_id")
    val entityId: kotlin.String,

    @field:JsonProperty("delta_value")
    val deltaValue: ScheduleDeltaValue? = null,

    @field:JsonProperty("end_timestamp")
    val endTimestamp: kotlin.Int? = null,

    @field:JsonProperty("entity_type")
    val entityType: AdAccountEntityType? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("schedule_action")
    val scheduleAction: ScheduleAction? = null,

    @field:JsonProperty("schedule_status")
    val scheduleStatus: ScheduleStatus? = null,

    @field:JsonProperty("schedule_type")
    val scheduleType: ScheduleType? = null,

    @field:JsonProperty("start_timestamp")
    val startTimestamp: kotlin.Int? = null,

)
