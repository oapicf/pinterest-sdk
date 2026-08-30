@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class HotelProcessingRecord(
    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<ItemValidationEvent>? = null,

    @field:JsonProperty("hotel_id")
    val hotelId: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: ItemProcessingStatus? = null,

    @field:JsonProperty("warnings")
    val warnings: kotlin.collections.List<ItemValidationEvent>? = null,

)
