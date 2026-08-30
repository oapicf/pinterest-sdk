@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsProductGroupFilterOperatorTypeCriteria(
    @field:JsonProperty("values")
    val propertyValues: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("filter_operator_type")
    val filterOperatorType: FilterOperatorType? = null,

    @field:JsonProperty("negated")
    val negated: kotlin.Boolean? = null,

)
