@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssetGroupUpdateItemReadOrUpdateItem(
    @field:JsonProperty("asset_group_id")
    val assetGroupId: kotlin.String,

    @field:JsonProperty("asset_group_types")
    val assetGroupTypes: kotlin.collections.List<AssetGroupType>? = null,

    @field:JsonProperty("assets_to_add")
    val assetsToAdd: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("assets_to_remove")
    val assetsToRemove: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

)
