@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BidFloor(
    @field:JsonProperty("bid_floors")
    val bidFloors: kotlin.collections.List<kotlin.Int>? = null,

    @field:JsonProperty("type")
    val type: kotlin.String? = "bidfloor",

)
