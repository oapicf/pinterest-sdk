@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsHotelItemsPostFilter(
    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("hotel_ids")
    val hotelIds: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("catalog_id")
    val catalogId: kotlin.String? = null,

)
