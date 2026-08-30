package org.openapitools.server.api.model

import org.openapitools.server.api.model.BulkReportingJobStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MMMReport(
    val message: kotlin.String? = null,
    val reportStatus: BulkReportingJobStatus? = null,
    val propertySize: java.math.BigDecimal? = null,
    val status: kotlin.String? = null,
    val token: kotlin.String? = null,
    val url: kotlin.String? = null
)
