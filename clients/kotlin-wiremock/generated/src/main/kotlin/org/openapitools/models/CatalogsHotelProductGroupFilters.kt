@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsHotelProductGroupFilters(
    @field:JsonProperty("any_of")
    val anyOf: kotlin.collections.List<CatalogsHotelProductGroupFilterKeys>,

    @field:JsonProperty("all_of")
    val allOf: kotlin.collections.List<CatalogsHotelProductGroupFilterKeys>,

)
