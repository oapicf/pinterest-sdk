package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
data class NullableOptimizationGoalMetadata(

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("conversion_tag_v3_goal_metadata")
    @get:JsonProperty("conversion_tag_v3_goal_metadata") val conversionTagV3GoalMetadata: ConversionTagV3GoalMetadata? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("frequency_goal_metadata")
    @get:JsonProperty("frequency_goal_metadata") val frequencyGoalMetadata: FrequencyGoalMetadata? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("scrollup_goal_metadata")
    @get:JsonProperty("scrollup_goal_metadata") val scrollupGoalMetadata: ScrollupGoalMetadata? = null
) {

}

