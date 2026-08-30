@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsHotelItemResponse(
    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("item_response_kind")
    val itemResponseKind: kotlin.String,

    @field:JsonProperty("attributes")
    val attributes: CatalogsHotelAttributes? = null,

    @field:JsonProperty("hotel_id")
    val hotelId: kotlin.String? = null,

    @field:JsonProperty("pins")
    val pins: kotlin.collections.List<Pin>? = null,

)
