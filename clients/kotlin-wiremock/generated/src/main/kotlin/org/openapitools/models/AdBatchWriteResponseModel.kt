@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdBatchWriteResponseModel(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<AdBatchItem>,

)
