package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.TargetingTemplateAudienceSizingReachEstimate
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
 * Gets an audience size estimate for a set of given targeting spec data. <p>Returns:</p> An object containing an audience size estimate that has a reach estimate (number of unique users) against the given targeting template. This by default provides a monthly estimate. 
 * @param reachEstimate 
 */
data class TargetingTemplateAudienceSizing(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("reach_estimate") val reachEstimate: TargetingTemplateAudienceSizingReachEstimate? = null
    ) {

}

