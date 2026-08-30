@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssetGroupDeletion(
    @field:JsonProperty("deleted_asset_groups")
    val deletedAssetGroups: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("exceptions")
    val exceptions: kotlin.collections.List<AssetGroupDeleteError>? = null,

)
