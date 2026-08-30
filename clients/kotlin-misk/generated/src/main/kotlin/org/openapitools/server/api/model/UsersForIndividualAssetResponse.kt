package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UsersForIndividualAssetResponse(
    /** Unique identifier of a business asset. */
    val assetId: kotlin.String? = null,
    /** Unique identifier of the business member with asset access. */
    val memberId: kotlin.String? = null,
    /** Permission levels member or partner has on an asset. */
    val permissions: kotlin.collections.List<kotlin.String>? = null
)
