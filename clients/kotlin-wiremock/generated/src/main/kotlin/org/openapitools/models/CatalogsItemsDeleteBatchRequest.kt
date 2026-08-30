@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsItemsDeleteBatchRequest(
    @field:JsonProperty("country")
    val country: Country,

    @field:JsonProperty("items")
    val items: kotlin.collections.List<ItemDeleteBatchRecord>,

    @field:JsonProperty("language")
    val language: kotlin.String,

    @field:JsonProperty("operation")
    val operation: kotlin.String,

)
