@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssetGroupInputCreate(
    @field:JsonProperty("asset_group_description")
    val assetGroupDescription: kotlin.String,

    @field:JsonProperty("asset_group_name")
    val assetGroupName: kotlin.String,

    @field:JsonProperty("asset_group_types")
    val assetGroupTypes: kotlin.collections.List<AssetGroupType>,

    @field:JsonProperty("asset_group")
    val assetGroup: AssetGroupBinding? = null,

)
