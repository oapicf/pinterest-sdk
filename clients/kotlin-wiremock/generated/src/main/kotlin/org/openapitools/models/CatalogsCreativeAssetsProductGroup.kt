@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsCreativeAssetsProductGroup(
    @field:JsonProperty("catalog_id")
    val catalogId: kotlin.String,

    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("filters")
    val filters: CatalogsCreativeAssetsProductGroupFilters,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("updated_at")
    val updatedAt: kotlin.Int? = null,

)
