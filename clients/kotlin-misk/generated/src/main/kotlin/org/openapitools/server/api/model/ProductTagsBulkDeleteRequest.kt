package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProductTagItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductTagsBulkDeleteRequest(
    /** List of product tags to delete. */
    val productTags: kotlin.collections.List<ProductTagItem>
)
