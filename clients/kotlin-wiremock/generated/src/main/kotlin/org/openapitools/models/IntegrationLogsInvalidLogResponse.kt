@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class IntegrationLogsInvalidLogResponse(
    @field:JsonProperty("rejected_logs")
    val rejectedLogs: kotlin.collections.List<IntegrationLogsInvalidLogResponseRejectedLogsItems>? = null,

)
