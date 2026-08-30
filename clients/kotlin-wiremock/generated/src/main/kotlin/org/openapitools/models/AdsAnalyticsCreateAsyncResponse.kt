@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdsAnalyticsCreateAsyncResponse(
    @field:JsonProperty("message")
    val message: kotlin.String? = null,

    @field:JsonProperty("report_status")
    val reportStatus: BulkReportingJobStatus? = null,

    @field:JsonProperty("token")
    val token: kotlin.String? = null,

)
