@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ScheduleBidMultipliers(
    @field:JsonProperty("age_bucket_multipliers")
    val ageBucketMultipliers: BidOptionsAgeBucketMultipliers? = null,

    @field:JsonProperty("app_type_multipliers")
    val appTypeMultipliers: BidOptionsAppTypeMultipliers? = null,

    @field:JsonProperty("audience_multipliers")
    val audienceMultipliers: kotlin.collections.List<BidOptionsAudienceMultipliers>? = null,

    @field:JsonProperty("gender_multipliers")
    val genderMultipliers: BidOptionsGenderMultipliers? = null,

    @field:JsonProperty("placement_multipliers")
    val placementMultipliers: BidOptionsPlacementMultipliers? = null,

)
