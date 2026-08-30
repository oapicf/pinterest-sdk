package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProductGroupPromotion
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductGroupPromotionUpdateRequest(
    /** ID of the ad group the product group belongs to. */
    val adGroupId: kotlin.String,
    val productGroupPromotion: kotlin.collections.List<ProductGroupPromotion>
)
