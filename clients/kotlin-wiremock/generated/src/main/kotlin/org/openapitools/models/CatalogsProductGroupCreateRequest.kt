@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsProductGroupCreateRequest(
    @field:JsonProperty("feed_id")
    val feedId: kotlin.String,

    @field:JsonProperty("filters")
    val filters: CatalogsProductGroupFiltersRequest,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("is_featured")
    val isFeatured: kotlin.Boolean? = null,

)
