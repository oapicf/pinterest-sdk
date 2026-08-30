package org.openapitools.server.api.model

import org.openapitools.server.api.model.InviteAssetsSummaryItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class InviteAssetsSummary(
    /** List of ad account IDs and respective permission levels that will be assigned. */
    val adAccounts: kotlin.collections.List<InviteAssetsSummaryItem>? = null,
    /** List of profile IDs and respective permission levels that will be assigned. */
    val profiles: kotlin.collections.List<InviteAssetsSummaryItem>? = null
)
