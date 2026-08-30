package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BidOptionsAgeBucketMultipliers(
    val _18_24: java.math.BigDecimal? = null,
    val _25_34: java.math.BigDecimal? = null,
    val _35_44: java.math.BigDecimal? = null,
    val _45_49: java.math.BigDecimal? = null,
    val _50_54: java.math.BigDecimal? = null,
    val _55_64: java.math.BigDecimal? = null,
    val `65plus`: java.math.BigDecimal? = null
)
