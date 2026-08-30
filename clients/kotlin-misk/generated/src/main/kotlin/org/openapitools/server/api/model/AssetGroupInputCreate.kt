package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssetGroupBinding
import org.openapitools.server.api.model.AssetGroupType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssetGroupInputCreate(
    /** Asset group description. */
    val assetGroupDescription: kotlin.String,
    /** Asset Group name. */
    val assetGroupName: kotlin.String,
    /** Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. */
    val assetGroupTypes: kotlin.collections.List<AssetGroupType>,
    val assetGroup: AssetGroupBinding? = null
)
