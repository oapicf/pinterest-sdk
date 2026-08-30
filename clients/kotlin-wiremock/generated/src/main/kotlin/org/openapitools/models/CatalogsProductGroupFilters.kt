@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsProductGroupFilters(
    @field:JsonProperty("any_of")
    val anyOf: kotlin.collections.List<CatalogsProductGroupFilterKeys>,

    @field:JsonProperty("all_of")
    val allOf: kotlin.collections.List<CatalogsProductGroupFilterKeys>,

)
