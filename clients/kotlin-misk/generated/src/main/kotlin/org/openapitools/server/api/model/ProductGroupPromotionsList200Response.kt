package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProductGroupPromotion
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductGroupPromotionsList200Response(
    val items: kotlin.collections.List<ProductGroupPromotion>,
    val bookmark: kotlin.String? = null
)
