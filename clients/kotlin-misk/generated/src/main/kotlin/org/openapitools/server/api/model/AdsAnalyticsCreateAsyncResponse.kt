package org.openapitools.server.api.model

import org.openapitools.server.api.model.BulkReportingJobStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdsAnalyticsCreateAsyncResponse(
    val message: kotlin.String? = null,
    val reportStatus: BulkReportingJobStatus? = null,
    val token: kotlin.String? = null
)
