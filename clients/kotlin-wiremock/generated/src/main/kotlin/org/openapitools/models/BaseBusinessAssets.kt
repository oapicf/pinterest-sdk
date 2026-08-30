@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BaseBusinessAssets(
    @field:JsonProperty("asset_group_info")
    val assetGroupInfo: AssetGroupBinding? = null,

    @field:JsonProperty("asset_id")
    val assetId: kotlin.String? = null,

    @field:JsonProperty("asset_type")
    val assetType: AssetTypeResponse? = null,

    @field:JsonProperty("permissions")
    val permissions: kotlin.collections.List<kotlin.String>? = null,

)
