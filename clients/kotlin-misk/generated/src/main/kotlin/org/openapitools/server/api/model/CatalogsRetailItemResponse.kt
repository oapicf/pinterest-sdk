package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemAttributes
import org.openapitools.server.api.model.Pin
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailItemResponse(
    val catalogType: kotlin.String,
    /** Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. */
    val itemResponseKind: kotlin.String,
    val attributes: ItemAttributes? = null,
    /** The catalog retail item id in the merchant namespace */
    val itemId: kotlin.String? = null,
    /** The pins mapped to the item */
    val pins: kotlin.collections.List<Pin>? = null
)
