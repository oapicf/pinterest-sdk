@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class InviteAssetsSummaryItem(
    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("permissions")
    val permissions: kotlin.collections.List<kotlin.String>? = null,

)
