@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BidOptionsAgeBucketMultipliers(
    @field:JsonProperty("18-24")
    val _18_24: java.math.BigDecimal? = null,

    @field:JsonProperty("25-34")
    val _25_34: java.math.BigDecimal? = null,

    @field:JsonProperty("35-44")
    val _35_44: java.math.BigDecimal? = null,

    @field:JsonProperty("45-49")
    val _45_49: java.math.BigDecimal? = null,

    @field:JsonProperty("50-54")
    val _50_54: java.math.BigDecimal? = null,

    @field:JsonProperty("55-64")
    val _55_64: java.math.BigDecimal? = null,

    @field:JsonProperty("65+")
    val `65plus`: java.math.BigDecimal? = null,

)
