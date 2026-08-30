@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignBatchWriteResponseModel(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<CampaignBatchItem>,

)
