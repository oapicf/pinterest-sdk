@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssetGroupDeletionDelete(
    @field:JsonProperty("asset_groups_to_delete")
    val assetGroupsToDelete: kotlin.collections.List<kotlin.String>,

)
