@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsProductGroupMultipleGenderCriteria(
    @field:JsonProperty("values")
    val propertyValues: kotlin.collections.List<Gender>,

    @field:JsonProperty("negated")
    val negated: kotlin.Boolean? = null,

)
