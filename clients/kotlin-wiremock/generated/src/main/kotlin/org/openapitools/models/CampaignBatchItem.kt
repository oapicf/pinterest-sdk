@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CampaignBatchItem(
    @field:JsonProperty("data")
    val `data`: CampaignBatchResponseData? = null,

    @field:JsonProperty("exceptions")
    val exceptions: kotlin.collections.List<Exception>? = null,

)
