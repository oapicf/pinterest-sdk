package org.openapitools.server.api.model

import org.openapitools.server.api.model.BulkReportingJobStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TemplateBasedReport(
    val reportStatus: BulkReportingJobStatus,
    /** Unique identifier of a template. */
    val templateId: kotlin.String,
    val message: kotlin.String? = null,
    val token: kotlin.String? = null
)
