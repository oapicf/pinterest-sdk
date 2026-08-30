package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProductTagItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductTagsBulkAddRequest(
    /** List of product tags to add. Maximum 24 items allowed. */
    val productTags: kotlin.collections.List<ProductTagItem>
)
