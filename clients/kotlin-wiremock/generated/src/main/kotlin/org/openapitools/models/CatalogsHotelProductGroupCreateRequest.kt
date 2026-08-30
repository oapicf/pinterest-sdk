@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsHotelProductGroupCreateRequest(
    @field:JsonProperty("catalog_id")
    val catalogId: kotlin.String,

    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("filters")
    val filters: CatalogsHotelProductGroupFilters,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

)
