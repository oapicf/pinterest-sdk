package org.openapitools.server.api.model

import org.openapitools.server.api.model.BidOptionsAgeBucketMultipliers
import org.openapitools.server.api.model.BidOptionsAppTypeMultipliers
import org.openapitools.server.api.model.BidOptionsAudienceMultipliers
import org.openapitools.server.api.model.BidOptionsGenderMultipliers
import org.openapitools.server.api.model.BidOptionsPlacementMultipliers
import org.openapitools.server.api.model.ScheduleBidMultipliers
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ScheduleDeltaValue(
    val ageBucketMultipliers: BidOptionsAgeBucketMultipliers? = null,
    val appTypeMultipliers: BidOptionsAppTypeMultipliers? = null,
    val audienceMultipliers: kotlin.collections.List<BidOptionsAudienceMultipliers>? = null,
    val genderMultipliers: BidOptionsGenderMultipliers? = null,
    val placementMultipliers: BidOptionsPlacementMultipliers? = null
)
