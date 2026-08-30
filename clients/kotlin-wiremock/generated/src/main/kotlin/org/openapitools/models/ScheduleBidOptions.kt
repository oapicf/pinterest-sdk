@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ScheduleBidOptions(
    @field:JsonProperty("age_bucket_multipliers")
    val ageBucketMultipliers: ScheduleAgeBucketMultipliers? = null,

    @field:JsonProperty("app_type_multipliers")
    val appTypeMultipliers: ScheduleAppTypeMultipliers? = null,

    @field:JsonProperty("audience_multipliers")
    val audienceMultipliers: ScheduleAudienceMultipliers? = null,

    @field:JsonProperty("gender_multipliers")
    val genderMultipliers: ScheduleBidOptionsGenderMultipliers? = null,

    @field:JsonProperty("placement_multipliers")
    val placementMultipliers: ScheduleBidOptionsPlacementMultipliers? = null,

)
