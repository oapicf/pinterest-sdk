@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsItemsUpdateBatchRequest(
    @field:JsonProperty("country")
    val country: Country,

    @field:JsonProperty("items")
    val items: kotlin.collections.List<ItemUpdateBatchRecord>,

    @field:JsonProperty("language")
    val language: kotlin.String,

    @field:JsonProperty("operation")
    val operation: kotlin.String,

)
