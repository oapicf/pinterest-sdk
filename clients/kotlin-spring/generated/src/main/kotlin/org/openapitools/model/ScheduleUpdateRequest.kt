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
 * @param id Schedule ID.
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
data class ScheduleUpdateRequest(

    @Schema(required = true, description = "Schedule ID.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @get:Pattern(regexp="^[C]?\\d+$")
    @Schema(description = "")
    @param:JsonProperty("entity_id")
    @get:JsonProperty("entity_id") val entityId: kotlin.String? = null,

    @Schema(description = "Entity type")
    @param:JsonProperty("entity_type")
    @get:JsonProperty("entity_type") val entityType: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("delta_value")
    @get:JsonProperty("delta_value") val deltaValue: ScheduleCommonDeltaValue? = null,

    @Schema(description = "Schedule end time. Unix timestamp in seconds.")
    @param:JsonProperty("end_timestamp")
    @get:JsonProperty("end_timestamp") val endTimestamp: kotlin.Int? = null,

    @Schema(description = "")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("schedule_action")
    @get:JsonProperty("schedule_action") val scheduleAction: ScheduleAction? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("schedule_status")
    @get:JsonProperty("schedule_status") val scheduleStatus: ScheduleStatus? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("schedule_type")
    @get:JsonProperty("schedule_type") val scheduleType: ScheduleType? = null,

    @Schema(description = "Schedule start time. Unix timestamp in seconds.")
    @param:JsonProperty("start_timestamp")
    @get:JsonProperty("start_timestamp") val startTimestamp: kotlin.Int? = null
) {

}

