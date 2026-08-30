@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsRetailItemsPostFilter(
    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("item_ids")
    val itemIds: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("catalog_id")
    val catalogId: kotlin.String? = null,

)
