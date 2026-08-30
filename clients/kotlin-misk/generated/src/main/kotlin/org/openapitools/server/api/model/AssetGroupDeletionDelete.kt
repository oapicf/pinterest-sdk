package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssetGroupDeletionDelete(
    val assetGroupsToDelete: kotlin.collections.List<kotlin.String>
)
