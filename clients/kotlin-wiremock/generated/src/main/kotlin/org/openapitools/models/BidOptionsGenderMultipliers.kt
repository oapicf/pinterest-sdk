@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BidOptionsGenderMultipliers(
    @field:JsonProperty("female")
    val female: java.math.BigDecimal? = null,

    @field:JsonProperty("male")
    val male: java.math.BigDecimal? = null,

)
