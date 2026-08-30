package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssetGroupUpdateError(
    val assetGroupId: kotlin.String? = null,
    val code: kotlin.Int? = null,
    val message: kotlin.String? = null
)
