package org.openapitools.server.api.model

import org.openapitools.server.api.model.BulkReportingJobStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ConversionProductReport(
    /** Message returned from the create report request */
    val message: kotlin.String? = null,
    /** Async report status */
    val reportStatus: BulkReportingJobStatus? = null,
    /** Size of the report in bytes */
    val propertySize: java.math.BigDecimal? = null,
    /** Token returned from the create report request */
    val token: kotlin.String? = null,
    /** URL of the report */
    val url: kotlin.String? = null
)
