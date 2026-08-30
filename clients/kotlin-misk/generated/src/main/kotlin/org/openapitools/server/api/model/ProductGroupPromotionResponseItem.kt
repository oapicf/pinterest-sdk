package org.openapitools.server.api.model

import org.openapitools.server.api.model.Exception
import org.openapitools.server.api.model.ProductGroupPromotion
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductGroupPromotionResponseItem(
    val `data`: ProductGroupPromotion? = null,
    val exceptions: kotlin.collections.List<Exception>? = null
)
