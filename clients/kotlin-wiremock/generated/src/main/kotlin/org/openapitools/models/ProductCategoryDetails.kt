@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProductCategoryDetails(
    @field:JsonProperty("has_prediction")
    val hasPrediction: kotlin.Boolean,

    @field:JsonProperty("product_category")
    val productCategory: ProductCategoryEnum,

    @field:JsonProperty("demographics")
    val demographics: ProductCategoriesDemographic? = null,

    @field:JsonProperty("metrics_highlights")
    val metricsHighlights: ProductCategoriesMetricsHighlights? = null,

    @field:JsonProperty("predicted_time_series")
    val predictedTimeSeries: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,

    @field:JsonProperty("related_searches")
    val relatedSearches: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("time_series")
    val timeSeries: kotlin.collections.Map<kotlin.String, java.math.BigDecimal>? = null,

)
