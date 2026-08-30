package org.openapitools.server.api.model

import org.openapitools.server.api.model.PromotionArrayElement
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PromotionsResponse(
    val promotions: kotlin.collections.List<PromotionArrayElement>? = null
)
