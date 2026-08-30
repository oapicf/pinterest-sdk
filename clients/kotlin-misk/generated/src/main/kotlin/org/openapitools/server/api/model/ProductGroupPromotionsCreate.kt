package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProductGroupPromotion
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductGroupPromotionsCreate(
    /** ID of the ad group the product group promotion belongs to. */
    val adGroupId: kotlin.String,
    /** List of product group promotions to create or update. */
    val productGroupPromotion: kotlin.collections.List<ProductGroupPromotion>
)
