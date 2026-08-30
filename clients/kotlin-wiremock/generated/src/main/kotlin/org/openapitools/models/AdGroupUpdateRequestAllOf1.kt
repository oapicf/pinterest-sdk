@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdGroupUpdateRequestAllOf1(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("bid_multiplier")
    val bidMultiplier: java.math.BigDecimal? = null,

    @field:JsonProperty("targeting_spec_operations")
    val targetingSpecOperations: kotlin.collections.List<TargetingSpecOperations>? = null,

)
