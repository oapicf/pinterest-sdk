package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemIdStoreCodePair(
    /** Catalog item id in the merchant namespace */
    val itemId: kotlin.String,
    /** Store code for the local inventory item */
    val storeCode: kotlin.String
)
