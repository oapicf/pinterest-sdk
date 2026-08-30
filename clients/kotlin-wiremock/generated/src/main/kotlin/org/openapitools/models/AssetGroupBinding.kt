@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssetGroupBinding(
    @field:JsonProperty("ad_accounts_ids")
    val adAccountsIds: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("asset_group_description")
    val assetGroupDescription: kotlin.String,

    @field:JsonProperty("asset_group_name")
    val assetGroupName: kotlin.String,

    @field:JsonProperty("asset_group_types")
    val assetGroupTypes: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("catalogs_ids")
    val catalogsIds: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("created_by")
    val createdBy: BusinessAccessUserSummary,

    @field:JsonProperty("created_time")
    val createdTime: kotlin.Int,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("owner")
    val owner: BusinessAccessUserSummary,

    @field:JsonProperty("profiles_ids")
    val profilesIds: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("updated_time")
    val updatedTime: kotlin.Int,

)
