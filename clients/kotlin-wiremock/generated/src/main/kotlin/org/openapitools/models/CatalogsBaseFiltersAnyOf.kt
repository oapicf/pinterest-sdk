@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsBaseFiltersAnyOf(
    @field:JsonProperty("any_of")
    val anyOf: kotlin.collections.List<CatalogsBaseFilterKeys>,

)
