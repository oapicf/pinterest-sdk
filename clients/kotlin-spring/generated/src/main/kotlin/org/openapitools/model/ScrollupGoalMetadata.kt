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
 * @param scrollupGoalValueInMicroCurrency 
 */
data class ScrollupGoalMetadata(

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "")
    @param:JsonProperty("scrollup_goal_value_in_micro_currency")
    @get:JsonProperty("scrollup_goal_value_in_micro_currency") val scrollupGoalValueInMicroCurrency: kotlin.String? = null
) {

}

