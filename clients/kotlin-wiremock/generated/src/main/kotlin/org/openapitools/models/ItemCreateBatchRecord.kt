@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemCreateBatchRecord(
    @field:JsonProperty("attributes")
    val attributes: ItemAttributesRequest? = null,

    @field:JsonProperty("item_id")
    val itemId: kotlin.String? = null,

)
