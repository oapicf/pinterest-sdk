package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeletePartnerAssetAccessResult(
    /** Unique identifier of a business asset. */
    val assetId: kotlin.String? = null,
    /** Type of asset. Currently we only support AD_ACCOUNT, PROFILE, ASSET_GROUP and CATALOG. */
    val assetType: kotlin.String? = null,
    /** If is_shared_partner&#x3D;FALSE, you terminated a partner&#39;s asset access to your business asset. If is_shared_partner&#x3D;TRUE, you terminated your asset access to your partner&#39;s business asset. */
    val isSharedPartner: kotlin.Boolean? = null,
    /** Unique identifier of a business partner. */
    val partnerId: kotlin.String? = null,
    /** Permission levels member or partner has on an asset. */
    val permissions: kotlin.collections.List<kotlin.String>? = null
)
