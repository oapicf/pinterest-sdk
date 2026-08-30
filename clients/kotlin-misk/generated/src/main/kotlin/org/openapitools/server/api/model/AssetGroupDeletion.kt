package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssetGroupDeleteError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssetGroupDeletion(
    val deletedAssetGroups: kotlin.collections.List<kotlin.String>? = null,
    val exceptions: kotlin.collections.List<AssetGroupDeleteError>? = null
)
