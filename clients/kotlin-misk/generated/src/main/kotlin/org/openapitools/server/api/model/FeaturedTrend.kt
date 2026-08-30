package org.openapitools.server.api.model

import org.openapitools.server.api.model.InterestsEnum
import org.openapitools.server.api.model.ProductCategoryRegion
import org.openapitools.server.api.model.TrendingTopic
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class FeaturedTrend(
    /** The main interest category */
    val interest: InterestsEnum,
    /** Market code (e.g., &#39;US&#39;, &#39;UK&#39;, etc.) */
    val market: ProductCategoryRegion? = null,
    /** List of trending topics within this interest category */
    val trends: kotlin.collections.List<TrendingTopic>? = null
)
