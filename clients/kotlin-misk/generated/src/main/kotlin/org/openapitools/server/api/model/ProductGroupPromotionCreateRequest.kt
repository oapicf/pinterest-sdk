package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProductGroupPromotion
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductGroupPromotionCreateRequest(
    /** ID of the Ad Group the Product Group Promotion belongs to. */
    val adGroupId: kotlin.String,
    val productGroupPromotion: kotlin.collections.List<ProductGroupPromotion>
)
