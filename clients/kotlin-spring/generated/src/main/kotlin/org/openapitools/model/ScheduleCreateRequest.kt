package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ScheduleAction
import org.openapitools.model.ScheduleCommonDeltaValue
import org.openapitools.model.ScheduleStatus
import org.openapitools.model.ScheduleType
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * 
 * @param entityId 
 * @param entityType Entity type
 * @param deltaValue 
 * @param endTimestamp Schedule end time. Unix timestamp in seconds.
 * @param name 
 * @param scheduleAction 
 * @param scheduleStatus 
 * @param scheduleType 
 * @param startTimestamp Schedule start time. Unix timestamp in seconds.
 */
data class ScheduleCreateRequest(

    @get:Pattern(regexp="^[C]?\\d+$")
    @Schema(required = true, description = "")
    @param:JsonProperty("entity_id")
    @get:JsonProperty("entity_id", required = true) val entityId: kotlin.String,

    @Schema(required = true, description = "Entity type")
    @param:JsonProperty("entity_type")
    @get:JsonProperty("entity_type", required = true) val entityType: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("delta_value")
    @get:JsonProperty("delta_value", required = true) val deltaValue: ScheduleCommonDeltaValue,

    @Schema(required = true, description = "Schedule end time. Unix timestamp in seconds.")
    @param:JsonProperty("end_timestamp")
    @get:JsonProperty("end_timestamp", required = true) val endTimestamp: kotlin.Int,

    @Schema(required = true, description = "")
    @param:JsonProperty("name")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("schedule_action")
    @get:JsonProperty("schedule_action", required = true) val scheduleAction: ScheduleAction,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("schedule_status")
    @get:JsonProperty("schedule_status", required = true) val scheduleStatus: ScheduleStatus,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("schedule_type")
    @get:JsonProperty("schedule_type", required = true) val scheduleType: ScheduleType,

    @Schema(required = true, description = "Schedule start time. Unix timestamp in seconds.")
    @param:JsonProperty("start_timestamp")
    @get:JsonProperty("start_timestamp", required = true) val startTimestamp: kotlin.Int
) {

}

