@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemIdStoreCodePair(
    @field:JsonProperty("item_id")
    val itemId: kotlin.String,

    @field:JsonProperty("store_code")
    val storeCode: kotlin.String,

)
