@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocalInventoryItemsGetCreate(
    @field:JsonProperty("item_filters")
    val itemFilters: kotlin.collections.List<ItemIdStoreCodePair>,

)
