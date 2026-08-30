@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BusinessMemberAssetsSummary(
    @field:JsonProperty("ad_accounts")
    val adAccounts: kotlin.collections.List<AssetIdWithPermissions>? = null,

    @field:JsonProperty("profiles")
    val profiles: kotlin.collections.List<AssetIdWithPermissions>? = null,

)
