package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssetGroupBinding
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssetGroupInput(
    val assetGroup: AssetGroupBinding? = null
)
