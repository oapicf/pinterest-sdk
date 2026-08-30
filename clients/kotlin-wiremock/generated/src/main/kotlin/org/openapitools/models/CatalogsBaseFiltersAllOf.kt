@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsBaseFiltersAllOf(
    @field:JsonProperty("all_of")
    val allOf: kotlin.collections.List<CatalogsBaseFilterKeys>,

)
