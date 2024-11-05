package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.ActionType
import org.openapitools.model.Country
import org.openapitools.model.CreativeType
import org.openapitools.model.Currency
import org.openapitools.model.ObjectiveType
import org.openapitools.model.OptimizationGoalMetadata
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
 * @param currency 
 * @param billableEvent 
 * @param countries 
 * @param objectiveType 
 * @param optimizationGoalMetadata 
 * @param creativeType 
 */
data class BidFloorSpec(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("currency", required = true) val currency: Currency,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("billable_event", required = true) val billableEvent: ActionType,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("countries") val countries: kotlin.collections.List<Country>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("objective_type") val objectiveType: ObjectiveType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("optimization_goal_metadata") val optimizationGoalMetadata: OptimizationGoalMetadata? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("creative_type") val creativeType: CreativeType? = null
    ) {

}

