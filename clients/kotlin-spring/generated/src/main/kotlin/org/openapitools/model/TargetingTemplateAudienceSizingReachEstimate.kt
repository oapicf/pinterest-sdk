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
 * @param estimate 
 * @param lowerBound 
 * @param upperBound 
 */
data class TargetingTemplateAudienceSizingReachEstimate(

    @Schema(example = "63492000", description = "")
    @get:JsonProperty("estimate") val estimate: kotlin.Long? = null,

    @Schema(example = "47619000", description = "")
    @get:JsonProperty("lower_bound") val lowerBound: kotlin.Long? = null,

    @Schema(example = "79365000", description = "")
    @get:JsonProperty("upper_bound") val upperBound: kotlin.Long? = null
    ) {

}

