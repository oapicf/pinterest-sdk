@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsRetailProductGroup(
    @field:JsonProperty("catalog_id")
    val catalogId: kotlin.String,

    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("feed_id")
    val feedId: kotlin.String,

    @field:JsonProperty("filters")
    val filters: CatalogsProductGroupFilters,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("type")
    val type: CatalogsProductGroupType,

    @field:JsonProperty("country")
    val country: kotlin.String? = null,

    @field:JsonProperty("created_at")
    val createdAt: kotlin.Int? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("is_featured")
    val isFeatured: kotlin.Boolean? = null,

    @field:JsonProperty("locale")
    val locale: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: CatalogsProductGroupStatus? = null,

    @field:JsonProperty("updated_at")
    val updatedAt: kotlin.Int? = null,

)
