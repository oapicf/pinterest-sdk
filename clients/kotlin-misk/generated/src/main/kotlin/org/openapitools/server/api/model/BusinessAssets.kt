package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssetGroupBinding
import org.openapitools.server.api.model.AssetTypeResponse
import org.openapitools.server.api.model.CatalogBinding
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BusinessAssets(
    /** An object containing all the information specific to the provided asset group. This field will be populated only if asset_type equals &#39;ASSET_GROUP&#39;. */
    val assetGroupInfo: AssetGroupBinding? = null,
    /** Unique identifier of a business asset. */
    val assetId: kotlin.String? = null,
    val assetType: AssetTypeResponse? = null,
    /** Permission levels the requesting business has on an asset. */
    val permissions: kotlin.collections.List<kotlin.String>? = null,
    /** An object containing all the information specific to the provided catalog. This field will be populated only if asset_type equals &#39;CATALOG&#39;. */
    val catalogInfo: CatalogBinding? = null
)
