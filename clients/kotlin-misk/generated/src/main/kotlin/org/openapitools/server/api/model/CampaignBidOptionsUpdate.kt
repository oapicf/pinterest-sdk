package org.openapitools.server.api.model

import org.openapitools.server.api.model.AgeBucketMultipliers
import org.openapitools.server.api.model.AppTypeMultipliers
import org.openapitools.server.api.model.CampaignAudienceMultipliers
import org.openapitools.server.api.model.CampaignBidOptionsUpdateMaskItems
import org.openapitools.server.api.model.FreqBidMultiplierTimeWindow
import org.openapitools.server.api.model.FrequencyMultipliers
import org.openapitools.server.api.model.GenderMultipliers
import org.openapitools.server.api.model.PlacementMultipliers
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CampaignBidOptionsUpdate(
    /** List of fields to update. Only the fields in the list will be updated. */
    val updateMask: kotlin.collections.List<CampaignBidOptionsUpdateMaskItems>,
    /** Age bucket multipliers for bid adjustments. */
    val ageBucketMultipliers: AgeBucketMultipliers? = null,
    /** App type multipliers for bid adjustments. */
    val appTypeMultipliers: AppTypeMultipliers? = null,
    /** Audience multipliers for bid adjustments. */
    val audienceMultipliers: CampaignAudienceMultipliers? = null,
    /** The time window for frequency bid multipliers. */
    val freqBidMultiplierTimeWindow: FreqBidMultiplierTimeWindow? = null,
    /** Frequency multipliers for bid adjustments. */
    val frequencyMultipliers: FrequencyMultipliers? = null,
    /** Gender multipliers for bid adjustments. */
    val genderMultipliers: GenderMultipliers? = null,
    /** Placement multipliers for bid adjustments. */
    val placementMultipliers: PlacementMultipliers? = null
)
