@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProductGroupPromotionCreateRequest(
    @field:JsonProperty("ad_group_id")
    val adGroupId: kotlin.String,

    @field:JsonProperty("product_group_promotion")
    val productGroupPromotion: kotlin.collections.List<ProductGroupPromotion>,

)
