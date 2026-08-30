@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class InviteAssetsSummary(
    @field:JsonProperty("ad_accounts")
    val adAccounts: kotlin.collections.List<InviteAssetsSummaryItem>? = null,

    @field:JsonProperty("profiles")
    val profiles: kotlin.collections.List<InviteAssetsSummaryItem>? = null,

)
