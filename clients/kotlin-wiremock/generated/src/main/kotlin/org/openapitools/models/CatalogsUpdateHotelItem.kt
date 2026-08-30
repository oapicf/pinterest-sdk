@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsUpdateHotelItem(
    @field:JsonProperty("attributes")
    val attributes: CatalogsUpdatableHotelAttributes,

    @field:JsonProperty("hotel_id")
    val hotelId: kotlin.String,

    @field:JsonProperty("operation")
    val operation: kotlin.String,

)
