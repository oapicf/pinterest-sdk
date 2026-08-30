package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeywordInfo(
    /** Keyword Name */
    val name: kotlin.String,
    /** MoM growth as a percentage, if there is no growth rate, this field is not present */
    val pctGrowthMom: java.math.BigDecimal? = null
)
