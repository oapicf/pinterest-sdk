package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssetIdWithPermissions
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BusinessMemberAssetsSummary(
    /** List of ad account IDs and respective permission levels. */
    val adAccounts: kotlin.collections.List<AssetIdWithPermissions>? = null,
    /** List of profile IDs and respective permission levels. */
    val profiles: kotlin.collections.List<AssetIdWithPermissions>? = null
)
