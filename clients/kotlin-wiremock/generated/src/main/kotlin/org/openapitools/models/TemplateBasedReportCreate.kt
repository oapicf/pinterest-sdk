@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class TemplateBasedReportCreate(
    @field:JsonProperty("report_status")
    val reportStatus: BulkReportingJobStatus,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

    @field:JsonProperty("token")
    val token: kotlin.String? = null,

)
