package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssetIdPermissions
import org.openapitools.server.api.model.TotalCountByEntityStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BusinessMemberAssetsGetResponse(
    val items: kotlin.collections.List<AssetIdPermissions>,
    /** Total number of assets matching the query */
    val totalDataCount: kotlin.Int,
    val bookmark: kotlin.String? = null,
    /** Breakdown of asset counts by entity status (ad accounts only) */
    val totalDataCountByStatus: TotalCountByEntityStatus? = null
)
