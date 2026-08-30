package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AudienceDemographicValue(
    /** Unique key for demographic item */
    val key: kotlin.String? = null,
    /** Display name for demographic */
    val name: kotlin.String? = null,
    /** Value of demographic item as a percent of total audience */
    val ratio: java.math.BigDecimal? = null
)
