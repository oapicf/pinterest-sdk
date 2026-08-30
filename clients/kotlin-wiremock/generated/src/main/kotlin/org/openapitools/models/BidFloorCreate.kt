@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BidFloorCreate(
    @field:JsonProperty("bid_floor_specs")
    val bidFloorSpecs: kotlin.collections.List<BidFloorSpec>,

    @field:JsonProperty("targeting_spec")
    val targetingSpec: TargetingSpecOptimal? = null,

)
