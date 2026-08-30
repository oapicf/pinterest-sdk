package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeleteMemberAssetAccessItem(
    /** Id of the asset on which to remove member permissions. */
    val assetId: kotlin.String,
    /** Unique identifier of the member on which to perform the asset permission removal */
    val memberId: kotlin.String
)
