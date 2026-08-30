@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class KeywordInfo(
    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("pct_growth_mom")
    val pctGrowthMom: java.math.BigDecimal? = null,

)
