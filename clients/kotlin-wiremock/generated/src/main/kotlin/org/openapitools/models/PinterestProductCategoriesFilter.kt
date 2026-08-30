@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinterestProductCategoriesFilter(
    @field:JsonProperty("PINTEREST_PRODUCT_CATEGORIES")
    val PINTEREST_PRODUCT_CATEGORIES: CatalogsProductGroupMultiplePinterestProductCategoryCriteria,

)
