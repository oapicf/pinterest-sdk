package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ItemDeleteBatchRecord(
    /** The catalog item id in the merchant namespace */
    val itemId: kotlin.String? = null
)
