@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class QualityComponentDetails(
    @field:JsonProperty("coverage")
    val coverage: java.math.BigDecimal,

    @field:JsonProperty("issues")
    val issues: kotlin.collections.List<QualityComponentIssue>? = null,

    @field:JsonProperty("overlap")
    val overlap: java.math.BigDecimal? = null,

)
