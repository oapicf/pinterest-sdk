package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class GenderDemographics(
    /** Percentage of female users */
    val female: java.math.BigDecimal,
    /** Percentage of male users */
    val male: java.math.BigDecimal,
    /** Percentage of users with unspecified gender */
    val unspecified: java.math.BigDecimal
)
