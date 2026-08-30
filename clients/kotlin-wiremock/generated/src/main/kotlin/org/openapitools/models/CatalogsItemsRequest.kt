@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsItemsRequest(
    @field:JsonProperty("country")
    val country: Country,

    @field:JsonProperty("filters")
    val filters: CatalogsItemsPostFilters,

    @field:JsonProperty("language")
    val language: kotlin.String,

)
