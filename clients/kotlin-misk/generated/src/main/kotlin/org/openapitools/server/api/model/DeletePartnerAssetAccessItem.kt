package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeletePartnerAssetAccessItem(
    /** Unique identifier of the business asset. */
    val assetId: kotlin.String,
    /** Unique identifier of a business partner to update asset access to. */
    val partnerId: kotlin.String,
    /** If partner_type&#x3D;INTERNAL, the deleted asset access is for the access the partner has to your business asset. If partner_type&#x3D;EXTERNAL, the deleted asset access is for the access you have to the partner&#39;s business asset. */
    val partnerType: kotlin.String? = PartnerType.INTERNAL
)
