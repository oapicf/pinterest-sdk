@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsVerticalsListProductsByCatalogBasedFilterRequest(
    @field:JsonProperty("catalog_id")
    val catalogId: kotlin.String,

    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("country")
    val country: Country,

    @field:JsonProperty("filters")
    val filters: CatalogsCreativeAssetsProductGroupFilters,

    @field:JsonProperty("locale")
    val locale: CatalogsLocale,

)
