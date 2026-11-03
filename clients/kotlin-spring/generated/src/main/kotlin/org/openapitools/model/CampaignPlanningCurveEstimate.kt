package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CampaignPlanningEstimationType
import org.openapitools.model.CampaignPlanningPointEstimate
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
 * @param estimationType Estimation type for campaign planning estimated curve
 * @param points The estimation points that make up the estimated curve.
 */
data class CampaignPlanningCurveEstimate(

    @field:Valid
    @Schema(example = "IMPRESSION", description = "Estimation type for campaign planning estimated curve")
    @param:JsonProperty("estimation_type")
    @get:JsonProperty("estimation_type") val estimationType: CampaignPlanningEstimationType? = null,

    @field:Valid
    @get:Size(max=100)
    @Schema(description = "The estimation points that make up the estimated curve.")
    @param:JsonProperty("points")
    @get:JsonProperty("points") val points: kotlin.collections.List<CampaignPlanningPointEstimate>? = null
) {

}

