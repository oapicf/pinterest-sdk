@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsRetailBatchRequest(
    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("country")
    val country: Country,

    @field:JsonProperty("items")
    val items: kotlin.collections.List<CatalogsRetailBatchRequestItemsItems>,

    @field:JsonProperty("language")
    val language: kotlin.String,

    @field:JsonProperty("catalog_id")
    val catalogId: kotlin.String? = null,

)
