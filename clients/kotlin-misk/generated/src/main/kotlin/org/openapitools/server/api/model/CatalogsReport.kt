package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsReport(
    val reportStatus: kotlin.String? = null,
    /** Size of the report in bytes */
    val propertySize: java.math.BigDecimal? = null,
    /** URL to download the report */
    val url: kotlin.String? = null
)
