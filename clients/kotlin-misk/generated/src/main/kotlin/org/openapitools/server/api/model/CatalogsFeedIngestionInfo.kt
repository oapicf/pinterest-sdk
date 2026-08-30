package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsFeedIngestionInfo(
    /** The number of ingested products that are in stock. */
    val IN_STOCK: kotlin.Int? = null,
    /** The number of ingested products that are in out of stock. */
    val OUT_OF_STOCK: kotlin.Int? = null,
    /** The number of ingested products that are in preorder. */
    val PREORDER: kotlin.Int? = null
)
