package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsProductGroupMultipleStringListCriteria
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GoogleProductCategory1Filter(
    val GOOGLE_PRODUCT_CATEGORY_1: CatalogsProductGroupMultipleStringListCriteria
)
