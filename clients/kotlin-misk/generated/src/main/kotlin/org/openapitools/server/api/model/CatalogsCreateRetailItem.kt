package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemAttributesRequest
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreateRetailItem(
    val attributes: ItemAttributesRequest,
    /** The catalog item id in the merchant namespace */
    val itemId: kotlin.String,
    val operation: kotlin.String
)
