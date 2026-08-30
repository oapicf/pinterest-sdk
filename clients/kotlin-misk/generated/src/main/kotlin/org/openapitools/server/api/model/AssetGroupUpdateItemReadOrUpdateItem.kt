package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssetGroupType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssetGroupUpdateItemReadOrUpdateItem(
    /** Unique identifier of the asset group to update. */
    val assetGroupId: kotlin.String,
    /** Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. */
    val assetGroupTypes: kotlin.collections.List<AssetGroupType>? = null,
    /** A list of asset ids to add to the asset group. */
    val assetsToAdd: kotlin.collections.List<kotlin.String>? = null,
    /** A list of asset ids to remove from the asset group. */
    val assetsToRemove: kotlin.collections.List<kotlin.String>? = null,
    /** Asset group description. */
    val description: kotlin.String? = null,
    /** Asset Group name. */
    val name: kotlin.String? = null
)
