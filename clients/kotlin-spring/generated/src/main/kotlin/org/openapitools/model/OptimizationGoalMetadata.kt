package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.ConversionTagV3GoalMetadata
import org.openapitools.model.FrequencyGoalMetadata
import org.openapitools.model.ScrollupGoalMetadata
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
    @Schema(description = "")
    @param:JsonProperty("conversion_tag_v3_goal_metadata")
    @get:JsonProperty("conversion_tag_v3_goal_metadata") val conversionTagV3GoalMetadata: ConversionTagV3GoalMetadata? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("frequency_goal_metadata")
    @get:JsonProperty("frequency_goal_metadata") val frequencyGoalMetadata: FrequencyGoalMetadata? = null,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("scrollup_goal_metadata")
    @get:JsonProperty("scrollup_goal_metadata") val scrollupGoalMetadata: ScrollupGoalMetadata? = null
) {

}

