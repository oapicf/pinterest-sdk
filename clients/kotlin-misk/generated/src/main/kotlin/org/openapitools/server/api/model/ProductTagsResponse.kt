package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProductTagItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductTagsResponse(
    /** List of product tags on the pin. */
    val productTags: kotlin.collections.List<ProductTagItem>
)
