@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TargetingSpecShoppingRetargeting(
    @field:JsonProperty("exclusion_window")
    val exclusionWindow: kotlin.Int? = null,

    @field:JsonProperty("lookback_window")
    val lookbackWindow: kotlin.Int? = null,

    @field:JsonProperty("tag_types")
    val tagTypes: kotlin.collections.List<kotlin.Int>? = null,

)
