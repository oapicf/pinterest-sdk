package org.openapitools.server.api.model

import org.openapitools.server.api.model.Permissions
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UpdateMemberAssetAccessItem(
    /** Id of the asset to update. */
    val assetId: kotlin.String,
    /** Unique identifier of the member on which to perform the update */
    val memberId: kotlin.String,
    /** A non-empty array of permissions to assign to the member. */
    val permissions: kotlin.collections.List<Permissions>
)
