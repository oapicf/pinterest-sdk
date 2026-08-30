package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssetTypeResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UpdatePartnerAssetsResult(
    /** Unique identifier of a business asset. */
    val assetId: kotlin.String? = null,
    val assetType: AssetTypeResponse? = null,
    /** Unique identifier of a business partner. */
    val partnerId: kotlin.String? = null,
    /** Permission levels member or partner has on an asset. */
    val permissions: kotlin.collections.List<kotlin.String>? = null
)
