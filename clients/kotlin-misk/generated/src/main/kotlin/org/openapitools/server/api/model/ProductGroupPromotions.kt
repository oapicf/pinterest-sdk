package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProductGroupPromotionResponseItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductGroupPromotions(
    /** Response-only: created or updated product group promotions, or exceptions. */
    val items: kotlin.collections.List<ProductGroupPromotionResponseItem>? = null
)
