@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PerformancePlusCampaignSettings(
    @field:JsonProperty("boost_prospecting_ad_group_bid")
    val boostProspectingAdGroupBid: kotlin.Boolean? = null,

    @field:JsonProperty("pinner_list_exclusions")
    val pinnerListExclusions: kotlin.collections.List<kotlin.String>? = null,

)
