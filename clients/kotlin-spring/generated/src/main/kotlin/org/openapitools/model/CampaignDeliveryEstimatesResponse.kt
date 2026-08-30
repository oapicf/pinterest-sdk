package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CampaignDeliveryEstimatesDerivedMetrics
import org.openapitools.model.CampaignPlanningCurveEstimate
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
 * Delivery estimates response for a campaign.
 * @param curves Estimated curves. Each curve will pertain to a single estimation type.
 * @param derivedMetrics 
 * @param maxPotentialSpend Maximum potential spend estimate.
 */
data class CampaignDeliveryEstimatesResponse(

    @field:Valid
    @get:Size(max=20)
    @Schema(description = "Estimated curves. Each curve will pertain to a single estimation type.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("curves")
    @get:JsonProperty("curves") val curves: kotlin.collections.List<CampaignPlanningCurveEstimate>? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("derived_metrics")
    @get:JsonProperty("derived_metrics") val derivedMetrics: CampaignDeliveryEstimatesDerivedMetrics? = null,

    @Schema(example = "50000000", description = "Maximum potential spend estimate.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("max_potential_spend")
    @get:JsonProperty("max_potential_spend") val maxPotentialSpend: kotlin.Int? = null
) {

}

