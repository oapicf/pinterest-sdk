@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BidOptionsPlacementMultipliers(
    @field:JsonProperty("browse")
    val browse: java.math.BigDecimal? = null,

    @field:JsonProperty("related_pins")
    val relatedPins: java.math.BigDecimal? = null,

    @field:JsonProperty("search")
    val search: java.math.BigDecimal? = null,

)
