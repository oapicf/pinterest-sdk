@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsHotelProductGroupUpdateRequest(
    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("filters")
    val filters: CatalogsHotelProductGroupFilters? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

)
