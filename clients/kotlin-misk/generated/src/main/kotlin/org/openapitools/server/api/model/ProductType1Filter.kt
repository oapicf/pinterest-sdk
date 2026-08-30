package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringListCriteria
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductType1Filter(
    val PRODUCT_TYPE_1: CatalogsProductGroupMultipleStringListCriteria
)
