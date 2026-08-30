@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsProductGroupMultipleCountriesCriteria(
    @field:JsonProperty("values")
    val propertyValues: kotlin.collections.List<Country>,

    @field:JsonProperty("negated")
    val negated: kotlin.Boolean? = null,

)
