package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.AppTypeMultipliers
import org.openapitools.model.CampaignAudienceMultipliers
import org.openapitools.model.PlacementMultipliers
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
 * Object describing the campaign level bid multipliers.
 * @param appTypeMultipliers 
 * @param audienceMultipliers 
 * @param placementMultipliers 
 */
data class CampaignBidOptionsCreate(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("app_type_multipliers") val appTypeMultipliers: AppTypeMultipliers? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("audience_multipliers") val audienceMultipliers: CampaignAudienceMultipliers? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("placement_multipliers") val placementMultipliers: PlacementMultipliers? = null
) {

}

