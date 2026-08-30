package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssetGroupBinding
import org.openapitools.server.api.model.AssetTypeResponse
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BaseBusinessAssets(
    /** An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. */
    val assetGroupInfo: AssetGroupBinding? = null,
    /** Unique identifier of a business asset. */
    val assetId: kotlin.String? = null,
    val assetType: AssetTypeResponse? = null,
    /** Permission levels the requesting business has on an asset. */
    val permissions: kotlin.collections.List<kotlin.String>? = null
)
