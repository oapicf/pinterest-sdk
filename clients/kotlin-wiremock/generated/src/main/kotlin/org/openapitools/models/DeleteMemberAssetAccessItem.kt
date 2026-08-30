@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeleteMemberAssetAccessItem(
    @field:JsonProperty("asset_id")
    val assetId: kotlin.String,

    @field:JsonProperty("member_id")
    val memberId: kotlin.String,

)
