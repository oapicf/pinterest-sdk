package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.OptimizationGoalMetadataConversionTagV3GoalMetadata
import org.openapitools.model.OptimizationGoalMetadataFrequencyGoalMetadata
import org.openapitools.model.OptimizationGoalMetadataScrollupGoalMetadata
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
 * @param conversionTagV3GoalMetadata 
 * @param frequencyGoalMetadata 
 * @param scrollupGoalMetadata 
 */
data class OptimizationGoalMetadata(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("conversion_tag_v3_goal_metadata") val conversionTagV3GoalMetadata: OptimizationGoalMetadataConversionTagV3GoalMetadata? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("frequency_goal_metadata") val frequencyGoalMetadata: OptimizationGoalMetadataFrequencyGoalMetadata? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("scrollup_goal_metadata") val scrollupGoalMetadata: OptimizationGoalMetadataScrollupGoalMetadata? = null
    ) {

}

