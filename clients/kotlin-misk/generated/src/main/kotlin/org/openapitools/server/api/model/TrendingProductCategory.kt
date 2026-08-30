package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProductCategoriesEngagementType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TrendingProductCategory(
    /** Engagement type */
    val engagementType: ProductCategoriesEngagementType,
    /** Month-over-month change percentage */
    val pctChangeMom: kotlin.Int,
    /** Relative volume percentage */
    val percentRelativeVolume: kotlin.Int,
    /** Pinterest Product Category Id */
    val pinterestProductCategoryId: kotlin.Int,
    /** Product Category Name */
    val productCategory: kotlin.String,
    /** Vertical name associated with the product category */
    val verticals: kotlin.collections.List<kotlin.String>? = null
)
