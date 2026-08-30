@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsItemsCreateBatchRequest(
    @field:JsonProperty("country")
    val country: Country,

    @field:JsonProperty("items")
    val items: kotlin.collections.List<ItemCreateBatchRecord>,

    @field:JsonProperty("language")
    val language: kotlin.String,

    @field:JsonProperty("operation")
    val operation: kotlin.String,

)
