@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsProductGroupMultipleStringCriteria(
    @field:JsonProperty("values")
    val propertyValues: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("negated")
    val negated: kotlin.Boolean? = null,

)
