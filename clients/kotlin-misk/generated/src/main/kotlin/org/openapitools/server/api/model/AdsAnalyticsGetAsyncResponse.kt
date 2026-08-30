package org.openapitools.server.api.model

import org.openapitools.server.api.model.BulkReportingJobStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdsAnalyticsGetAsyncResponse(
    val reportStatus: BulkReportingJobStatus? = null,
    val propertySize: java.math.BigDecimal? = null,
    val url: kotlin.String? = null
)
