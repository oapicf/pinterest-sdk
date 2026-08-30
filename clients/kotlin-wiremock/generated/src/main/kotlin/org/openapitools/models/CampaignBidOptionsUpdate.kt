@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignBidOptionsUpdate(
    @field:JsonProperty("update_mask")
    val updateMask: kotlin.collections.List<CampaignBidOptionsUpdateMaskItems>,

    @field:JsonProperty("age_bucket_multipliers")
    val ageBucketMultipliers: AgeBucketMultipliers? = null,

    @field:JsonProperty("app_type_multipliers")
    val appTypeMultipliers: AppTypeMultipliers? = null,

    @field:JsonProperty("audience_multipliers")
    val audienceMultipliers: CampaignAudienceMultipliers? = null,

    @field:JsonProperty("freq_bid_multiplier_time_window")
    val freqBidMultiplierTimeWindow: FreqBidMultiplierTimeWindow? = null,

    @field:JsonProperty("frequency_multipliers")
    val frequencyMultipliers: FrequencyMultipliers? = null,

    @field:JsonProperty("gender_multipliers")
    val genderMultipliers: GenderMultipliers? = null,

    @field:JsonProperty("placement_multipliers")
    val placementMultipliers: PlacementMultipliers? = null,

)
