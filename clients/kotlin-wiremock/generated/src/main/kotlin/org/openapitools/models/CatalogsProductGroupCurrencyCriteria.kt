@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsProductGroupCurrencyCriteria(
    @field:JsonProperty("values")
    val propertyValues: NonNullableCatalogsCurrency,

    @field:JsonProperty("negated")
    val negated: kotlin.Boolean? = null,

)
