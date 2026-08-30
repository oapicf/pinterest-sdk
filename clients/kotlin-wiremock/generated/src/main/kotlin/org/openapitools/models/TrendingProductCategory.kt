@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TrendingProductCategory(
    @field:JsonProperty("engagement_type")
    val engagementType: ProductCategoriesEngagementType,

    @field:JsonProperty("pct_change_mom")
    val pctChangeMom: kotlin.Int,

    @field:JsonProperty("percent_relative_volume")
    val percentRelativeVolume: kotlin.Int,

    @field:JsonProperty("pinterest_product_category_id")
    val pinterestProductCategoryId: kotlin.Int,

    @field:JsonProperty("product_category")
    val productCategory: kotlin.String,

    @field:JsonProperty("verticals")
    val verticals: kotlin.collections.List<kotlin.String>? = null,

)
