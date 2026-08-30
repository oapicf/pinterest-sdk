package org.openapitools.server.api.model

import org.openapitools.server.api.model.AssetGroupBinding
import org.openapitools.server.api.model.AssetGroupUpdateError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AssetGroupModification(
    /** A list of errors associated with the asset groups. Will be returned if there is an error. */
    val exceptions: kotlin.collections.List<AssetGroupUpdateError>? = null,
    /** A list of successfully edited asset groups. */
    val updatedAssetGroups: kotlin.collections.List<AssetGroupBinding>? = null
)
