package org.openapitools.server.api.model

import org.openapitools.server.api.model.Permissions
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UpdatePartnerAssetAccessItem(
    /** Unique identifier of the business asset. */
    val assetId: kotlin.String,
    /** Unique identifier of a business partner to update asset access to. */
    val partnerId: kotlin.String,
    /** A non-empty array of permissions to assign to the partner. */
    val permissions: kotlin.collections.List<Permissions>
)
