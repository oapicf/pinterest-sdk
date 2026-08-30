package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CampaignDeliveryEstimatesDerivedMetrics
import org.openapitools.model.CampaignPlanningAdGroupAudienceSize
import org.openapitools.model.CampaignPlanningConversionRate
import org.openapitools.model.CampaignPlanningCurveEstimate
import org.openapitools.model.CampaignPlanningResponseError
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
 * Delivery estimate result for a single campaign within a bulk request.
 * @param adgroupAudienceSizes Range audience sizes for each ad group, in the same order as the ad groups in the request.
 * @param conversionRate Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.
 * @param conversionRates Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.
 * @param curves Estimated curves. Each curve will pertain to a single estimation type.
 * @param derivedMetrics 
 * @param errors Errors encountered during estimation for this campaign.
 * @param estimateId UUID used to track delivery estimates when they are generated as part of a saved campaign.
 * @param maxPotentialSpend Maximum potential spend estimate.
 */
data class BulkCampaignDeliveryEstimatesItem(

    @field:Valid
    @Schema(description = "Range audience sizes for each ad group, in the same order as the ad groups in the request.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("adgroup_audience_sizes")
    @get:JsonProperty("adgroup_audience_sizes") val adgroupAudienceSizes: kotlin.collections.List<CampaignPlanningAdGroupAudienceSize>? = null,

    @Schema(example = "2.32600002288818", description = "Conversion rate estimate. Used to translate impressions into conversions for oCPM ads, adapted based on the input conversion event and attribution windows.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("conversion_rate")
    @get:JsonProperty("conversion_rate") val conversionRate: kotlin.Float? = null,

    @field:Valid
    @Schema(description = "Conversion rate estimates. Used to translate impressions into conversions for oCPM ads based on different conversion event and attribution windows settings.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("conversion_rates")
    @get:JsonProperty("conversion_rates") val conversionRates: kotlin.collections.List<CampaignPlanningConversionRate>? = null,

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

    @field:Valid
    @Schema(description = "Errors encountered during estimation for this campaign.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("errors")
    @get:JsonProperty("errors") val errors: kotlin.collections.List<CampaignPlanningResponseError>? = null,

    @Schema(example = "db1b0d75-4386-4db3-8a85-e5725d4dff51", description = "UUID used to track delivery estimates when they are generated as part of a saved campaign.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("estimate_id")
    @get:JsonProperty("estimate_id") val estimateId: kotlin.String? = null,

    @Schema(example = "50000000", description = "Maximum potential spend estimate.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("max_potential_spend")
    @get:JsonProperty("max_potential_spend") val maxPotentialSpend: kotlin.Int? = null
) {

}

