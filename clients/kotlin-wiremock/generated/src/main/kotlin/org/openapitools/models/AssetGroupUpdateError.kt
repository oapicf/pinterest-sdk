@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AssetGroupUpdateError(
    @field:JsonProperty("asset_group_id")
    val assetGroupId: kotlin.String? = null,

    @field:JsonProperty("code")
    val code: kotlin.Int? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

)
