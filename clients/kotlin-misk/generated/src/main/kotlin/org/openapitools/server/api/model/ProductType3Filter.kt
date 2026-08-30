package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringListCriteria
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProductType3Filter(
    val PRODUCT_TYPE_3: CatalogsProductGroupMultipleStringListCriteria
)
