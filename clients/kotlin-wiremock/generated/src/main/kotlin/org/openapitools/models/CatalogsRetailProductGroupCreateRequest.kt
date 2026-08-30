@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsRetailProductGroupCreateRequest(
    @field:JsonProperty("catalog_id")
    val catalogId: kotlin.String,

    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("filters")
    val filters: CatalogsProductGroupFiltersRequest,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("country")
    val country: Country? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("locale")
    val locale: CatalogsLocale? = null,

)
