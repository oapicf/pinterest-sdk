package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.AgeBucketMultipliers
import org.openapitools.model.AppTypeMultipliers
import org.openapitools.model.CampaignAudienceMultipliers
import org.openapitools.model.FreqBidMultiplierTimeWindow
import org.openapitools.model.FrequencyMultipliers
import org.openapitools.model.GenderMultipliers
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
 * @param ageBucketMultipliers Age bucket multipliers for bid adjustments.
 * @param appTypeMultipliers App type multipliers for bid adjustments.
 * @param audienceMultipliers Audience multipliers for bid adjustments.
 * @param freqBidMultiplierTimeWindow The time window for frequency bid multipliers.
 * @param frequencyMultipliers Frequency multipliers for bid adjustments.
 * @param genderMultipliers Gender multipliers for bid adjustments.
 * @param placementMultipliers Placement multipliers for bid adjustments.
 */
data class CampaignBidOptions(

    @field:Valid
    @Schema(description = "Age bucket multipliers for bid adjustments.")
    @param:JsonProperty("age_bucket_multipliers")
    @get:JsonProperty("age_bucket_multipliers") val ageBucketMultipliers: AgeBucketMultipliers? = null,

    @field:Valid
    @Schema(description = "App type multipliers for bid adjustments.")
    @param:JsonProperty("app_type_multipliers")
    @get:JsonProperty("app_type_multipliers") val appTypeMultipliers: AppTypeMultipliers? = null,

    @field:Valid
    @Schema(description = "Audience multipliers for bid adjustments.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("audience_multipliers")
    @get:JsonProperty("audience_multipliers") val audienceMultipliers: CampaignAudienceMultipliers? = null,

    @field:Valid
    @Schema(description = "The time window for frequency bid multipliers.")
    @param:JsonProperty("freq_bid_multiplier_time_window")
    @get:JsonProperty("freq_bid_multiplier_time_window") val freqBidMultiplierTimeWindow: FreqBidMultiplierTimeWindow? = null,

    @field:Valid
    @Schema(description = "Frequency multipliers for bid adjustments.")
    @param:JsonProperty("frequency_multipliers")
    @get:JsonProperty("frequency_multipliers") val frequencyMultipliers: FrequencyMultipliers? = null,

    @field:Valid
    @Schema(description = "Gender multipliers for bid adjustments.")
    @param:JsonProperty("gender_multipliers")
    @get:JsonProperty("gender_multipliers") val genderMultipliers: GenderMultipliers? = null,

    @field:Valid
    @Schema(description = "Placement multipliers for bid adjustments.")
    @param:JsonProperty("placement_multipliers")
    @get:JsonProperty("placement_multipliers") val placementMultipliers: PlacementMultipliers? = null
) {

}

