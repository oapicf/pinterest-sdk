@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsProductGroupMultiplePinterestProductCategoryCriteria(
    @field:JsonProperty("values")
    val propertyValues: kotlin.collections.List<ProductCategoryEnum>,

    @field:JsonProperty("negated")
    val negated: kotlin.Boolean? = null,

)
