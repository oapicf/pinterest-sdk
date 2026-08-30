package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupMultiplePinterestProductCategoryCriteria
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PinterestProductCategoriesFilter(
    val PINTEREST_PRODUCT_CATEGORIES: CatalogsProductGroupMultiplePinterestProductCategoryCriteria
)
