@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TargetingTemplateAudienceSizingReachEstimate(
    @field:JsonProperty("estimate")
    val estimate: kotlin.Long? = null,

    @field:JsonProperty("lower_bound")
    val lowerBound: kotlin.Long? = null,

    @field:JsonProperty("upper_bound")
    val upperBound: kotlin.Long? = null,

)
