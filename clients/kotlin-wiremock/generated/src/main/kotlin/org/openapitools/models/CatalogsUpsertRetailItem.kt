@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsUpsertRetailItem(
    @field:JsonProperty("attributes")
    val attributes: ItemAttributesRequest,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("operation")
    val operation: kotlin.String,

)
