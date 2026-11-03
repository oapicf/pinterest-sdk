package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 */
data class ScheduleUpdateRequestAllOf1(

    @Schema(required = true, description = "Schedule ID.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @get:Pattern(regexp="^[C]?\\d+$")
    @Schema(description = "")
    @param:JsonProperty("entity_id")
    @get:JsonProperty("entity_id") val entityId: kotlin.String? = null,

    @Schema(description = "Entity type")
    @param:JsonProperty("entity_type")
    @get:JsonProperty("entity_type") val entityType: kotlin.String? = null
) {

}

