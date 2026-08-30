package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CampaignPlanningConversionAttribution
import org.openapitools.model.CampaignPlanningConversionEvent
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
 * Conversion rate estimate for a specific conversion event and attribution window combination.
 * @param attributionWindows 
 * @param conversionEvent 
 * @param conversionRate Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.
 */
data class CampaignPlanningConversionRate(

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("attribution_windows")
    @get:JsonProperty("attribution_windows", required = true) val attributionWindows: CampaignPlanningConversionAttribution,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("conversion_event")
    @get:JsonProperty("conversion_event", required = true) val conversionEvent: CampaignPlanningConversionEvent,

    @Schema(example = "2.32600002288818", required = true, description = "Conversion rate estimate. Used to translate impressions into conversions for oCPM ads.")
    @param:JsonProperty("conversion_rate")
    @get:JsonProperty("conversion_rate", required = true) val conversionRate: kotlin.Float
) {

}

