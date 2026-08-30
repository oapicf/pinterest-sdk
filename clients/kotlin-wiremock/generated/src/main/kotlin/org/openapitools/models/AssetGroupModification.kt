@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssetGroupModification(
    @field:JsonProperty("exceptions")
    val exceptions: kotlin.collections.List<AssetGroupUpdateError>? = null,

    @field:JsonProperty("updated_asset_groups")
    val updatedAssetGroups: kotlin.collections.List<AssetGroupBinding>? = null,

)
