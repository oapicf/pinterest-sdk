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
 * @param entityId 
 * @param entityType Entity type
 */
data class ScheduleCreateRequestAllOf1(

    @get:Pattern(regexp="^[C]?\\d+$")
    @Schema(required = true, description = "")
    @param:JsonProperty("entity_id")
    @get:JsonProperty("entity_id", required = true) val entityId: kotlin.String,

    @Schema(required = true, description = "Entity type")
    @param:JsonProperty("entity_type")
    @get:JsonProperty("entity_type", required = true) val entityType: kotlin.String
) {

}

