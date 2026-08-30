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
 * A JSON object that represents a single estimation point. An estimation point contains the expected budget used and the estimated result, Y, along with an expected range based for the budget.
 * @param budget The budget value of the point.
 * @param doubleY Y value as a decimal.
 * @param maxY The maximum Y value of the point.
 * @param minY The minimum Y value of the point.
 * @param y The expected Y value of the point.
 */
data class CampaignPlanningPointEstimate(

    @Schema(example = "5000000", required = true, description = "The budget value of the point.")
    @param:JsonProperty("budget")
    @get:JsonProperty("budget", required = true) val budget: kotlin.Int,

    @Schema(example = "10.68", required = true, description = "Y value as a decimal.")
    @param:JsonProperty("double_y")
    @get:JsonProperty("double_y", required = true) val doubleY: kotlin.Double?,

    @Schema(example = "2000", required = true, description = "The maximum Y value of the point.")
    @param:JsonProperty("max_y")
    @get:JsonProperty("max_y", required = true) val maxY: kotlin.Int?,

    @Schema(example = "1000", required = true, description = "The minimum Y value of the point.")
    @param:JsonProperty("min_y")
    @get:JsonProperty("min_y", required = true) val minY: kotlin.Int?,

    @Schema(example = "1500", required = true, description = "The expected Y value of the point.")
    @param:JsonProperty("y")
    @get:JsonProperty("y", required = true) val y: kotlin.Int?
) {

}

