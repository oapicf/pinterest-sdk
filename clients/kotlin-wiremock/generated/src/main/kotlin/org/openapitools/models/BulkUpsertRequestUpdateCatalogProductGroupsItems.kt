@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BulkUpsertRequestUpdateCatalogProductGroupsItems(
    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("filters")
    val filters: CatalogsProductGroupFiltersRequest? = null,

    @field:JsonProperty("is_featured")
    val isFeatured: kotlin.Boolean? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String? = null,

    @field:JsonProperty("country")
    val country: Country? = null,

    @field:JsonProperty("locale")
    val locale: CatalogsLocale? = null,

)
