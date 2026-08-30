@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ScheduleBidOptionsPlacementMultipliers(
    @field:JsonProperty("browse")
    val browse: kotlin.Double? = null,

    @field:JsonProperty("related_pins")
    val relatedPins: kotlin.Double? = null,

    @field:JsonProperty("search")
    val search: kotlin.Double? = null,

)
