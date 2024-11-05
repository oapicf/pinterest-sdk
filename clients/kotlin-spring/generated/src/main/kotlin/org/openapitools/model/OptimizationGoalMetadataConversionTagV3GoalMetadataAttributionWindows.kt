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
 * @param clickWindowDays 
 * @param engagementWindowDays 
 * @param viewWindowDays 
 */
data class OptimizationGoalMetadataConversionTagV3GoalMetadataAttributionWindows(

    @Schema(example = "null", description = "")
    @get:JsonProperty("click_window_days") val clickWindowDays: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("engagement_window_days") val engagementWindowDays: kotlin.Int? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("view_window_days") val viewWindowDays: kotlin.Int? = null
    ) {

}

