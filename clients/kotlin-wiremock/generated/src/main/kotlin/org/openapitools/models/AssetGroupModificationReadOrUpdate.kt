@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssetGroupModificationReadOrUpdate(
    @field:JsonProperty("asset_groups_to_update")
    val assetGroupsToUpdate: kotlin.collections.List<AssetGroupUpdateItemReadOrUpdateItem>? = null,

    @field:JsonProperty("exceptions")
    val exceptions: kotlin.collections.List<AssetGroupUpdateError>? = null,

    @field:JsonProperty("updated_asset_groups")
    val updatedAssetGroups: kotlin.collections.List<AssetGroupBinding>? = null,

)
