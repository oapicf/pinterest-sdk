package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsDeleteRetailItem(
    /** The catalog item id in the merchant namespace */
    val itemId: kotlin.String,
    val operation: kotlin.String,
    /** The millisecond timestamp when the item was lastly modified by the merchant. */
    val lastUpdatedTime: kotlin.Long? = null
)
