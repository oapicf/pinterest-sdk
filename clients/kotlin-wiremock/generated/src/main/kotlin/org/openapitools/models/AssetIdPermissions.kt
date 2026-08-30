@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssetIdPermissions(
    @field:JsonProperty("asset_id")
    val assetId: kotlin.String,

    @field:JsonProperty("asset_type")
    val assetType: AssetTypeResponse,

    @field:JsonProperty("permissions")
    val permissions: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("asset_group_info")
    val assetGroupInfo: AssetGroupBinding? = null,

)
