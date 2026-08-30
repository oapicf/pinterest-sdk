@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreateAssetAccessRequestBody(
    @field:JsonProperty("asset_requests")
    val assetRequests: kotlin.collections.List<CreateAssetAccessRequestItem>,

)
