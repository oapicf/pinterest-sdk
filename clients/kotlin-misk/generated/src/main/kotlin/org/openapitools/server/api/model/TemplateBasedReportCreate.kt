package org.openapitools.server.api.model

import org.openapitools.server.api.model.BulkReportingJobStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TemplateBasedReportCreate(
    val reportStatus: BulkReportingJobStatus,
    val message: kotlin.String? = null,
    val token: kotlin.String? = null
)
