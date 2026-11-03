package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.AdAccountEntityType
import org.openapitools.model.ScheduleAction
import org.openapitools.model.ScheduleDeltaValue
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
 * Resource create operation model.
 * @param entityId entity ID.
 * @param deltaValue 
 * @param endTimestamp Schedule end time. Unix timestamp in seconds.
 * @param entityType Specify the entity_type to get summary information
 * @param name Schedule name.
 * @param scheduleAction The schedule action.
 * @param scheduleStatus Schedule status.
 * @param scheduleType The schedule type.
 * @param startTimestamp Schedule start time. Unix timestamp in seconds.
 */
data class ScheduleCreate(

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "entity ID.")
    @param:JsonProperty("entity_id", required = true)
    @get:JsonProperty("entity_id", required = true) val entityId: kotlin.String,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("delta_value")
    @get:JsonProperty("delta_value") val deltaValue: ScheduleDeltaValue? = null,

    @Schema(description = "Schedule end time. Unix timestamp in seconds.")
    @param:JsonProperty("end_timestamp")
    @get:JsonProperty("end_timestamp") val endTimestamp: kotlin.Int? = null,

    @field:Valid
    @Schema(description = "Specify the entity_type to get summary information")
    @param:JsonProperty("entity_type")
    @get:JsonProperty("entity_type") val entityType: AdAccountEntityType? = null,

    @Schema(description = "Schedule name.")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(description = "The schedule action.")
    @param:JsonProperty("schedule_action")
    @get:JsonProperty("schedule_action") val scheduleAction: ScheduleAction? = null,

    @field:Valid
    @Schema(description = "Schedule status.")
    @param:JsonProperty("schedule_status")
    @get:JsonProperty("schedule_status") val scheduleStatus: ScheduleStatus? = null,

    @field:Valid
    @Schema(description = "The schedule type.")
    @param:JsonProperty("schedule_type")
    @get:JsonProperty("schedule_type") val scheduleType: ScheduleType? = null,

    @Schema(description = "Schedule start time. Unix timestamp in seconds.")
    @param:JsonProperty("start_timestamp")
    @get:JsonProperty("start_timestamp") val startTimestamp: kotlin.Int? = null
) {

}

