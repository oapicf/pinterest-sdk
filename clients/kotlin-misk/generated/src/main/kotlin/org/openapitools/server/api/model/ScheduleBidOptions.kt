package org.openapitools.server.api.model

import org.openapitools.server.api.model.ScheduleAgeBucketMultipliers
import org.openapitools.server.api.model.ScheduleAppTypeMultipliers
import org.openapitools.server.api.model.ScheduleAudienceMultipliers
import org.openapitools.server.api.model.ScheduleBidOptionsGenderMultipliers
import org.openapitools.server.api.model.ScheduleBidOptionsPlacementMultipliers
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ScheduleBidOptions(
    val ageBucketMultipliers: ScheduleAgeBucketMultipliers? = null,
    val appTypeMultipliers: ScheduleAppTypeMultipliers? = null,
    val audienceMultipliers: ScheduleAudienceMultipliers? = null,
    val genderMultipliers: ScheduleBidOptionsGenderMultipliers? = null,
    val placementMultipliers: ScheduleBidOptionsPlacementMultipliers? = null
)
