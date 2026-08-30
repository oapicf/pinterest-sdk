@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsProductGroupMultipleMediaTypesCriteria(
    @field:JsonProperty("values")
    val propertyValues: kotlin.collections.List<MediaType>,

    @field:JsonProperty("negated")
    val negated: kotlin.Boolean? = null,

)
