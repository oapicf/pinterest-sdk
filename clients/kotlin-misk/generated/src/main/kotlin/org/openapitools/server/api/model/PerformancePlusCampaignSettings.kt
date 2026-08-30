package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PerformancePlusCampaignSettings(
    /** Whether to boost prospecting ad group bid. */
    val boostProspectingAdGroupBid: kotlin.Boolean? = null,
    /** List of campaign-level exclusion pinner list IDs. */
    val pinnerListExclusions: kotlin.collections.List<kotlin.String>? = null
)
