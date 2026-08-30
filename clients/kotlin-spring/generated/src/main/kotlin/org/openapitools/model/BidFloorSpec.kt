package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.ActionType
import org.openapitools.model.BidFloorObjectiveType
import org.openapitools.model.Country
import org.openapitools.model.CreativeType
import org.openapitools.model.Currency
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
 * Bid floor specification for a given campaign configuration.
 * @param billableEvent Ad group billable event type.
 * @param currency Currency for the bid floor value.
 * @param countries List of ISO 3166-1 alpha-2 country codes.
 * @param creativeType Creative type for the bid floor request.
 * @param objectiveType Campaign objective type.
 * @param optimizationGoalMetadata Optimization goal metadata.
 */
data class BidFloorSpec(

    @field:Valid
    @Schema(required = true, description = "Ad group billable event type.")
    @param:JsonProperty("billable_event")
    @get:JsonProperty("billable_event", required = true) val billableEvent: ActionType,

    @field:Valid
    @Schema(required = true, description = "Currency for the bid floor value.")
    @param:JsonProperty("currency")
    @get:JsonProperty("currency", required = true) val currency: Currency,

    @field:Valid
    @Schema(description = "List of ISO 3166-1 alpha-2 country codes.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("countries")
    @get:JsonProperty("countries") val countries: kotlin.collections.List<Country>? = null,

    @field:Valid
    @Schema(description = "Creative type for the bid floor request.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("creative_type")
    @get:JsonProperty("creative_type") val creativeType: CreativeType? = null,

    @field:Valid
    @Schema(description = "Campaign objective type.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("objective_type")
    @get:JsonProperty("objective_type") val objectiveType: BidFloorObjectiveType? = null,

    @field:Valid
    @Schema(description = "Optimization goal metadata.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("optimization_goal_metadata")
    @get:JsonProperty("optimization_goal_metadata") val optimizationGoalMetadata: OptimizationGoalMetadata? = null
) {

}

