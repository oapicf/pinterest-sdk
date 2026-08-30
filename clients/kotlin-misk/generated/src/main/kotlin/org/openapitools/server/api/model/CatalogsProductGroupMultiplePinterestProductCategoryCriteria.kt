package org.openapitools.server.api.model

import org.openapitools.server.api.model.ProductCategoryEnum
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsProductGroupMultiplePinterestProductCategoryCriteria(
    val propertyValues: kotlin.collections.List<ProductCategoryEnum>,
    val negated: kotlin.Boolean? = null
)
