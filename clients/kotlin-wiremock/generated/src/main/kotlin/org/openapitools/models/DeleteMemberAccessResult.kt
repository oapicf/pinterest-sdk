@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeleteMemberAccessResult(
    @field:JsonProperty("asset_id")
    val assetId: kotlin.String? = null,

    @field:JsonProperty("member_id")
    val memberId: kotlin.String? = null,

)
