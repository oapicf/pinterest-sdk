package org.openapitools.server.api.model

import org.openapitools.server.api.model.IntegrationLogsInvalidLogResponseRejectedLogsItems
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IntegrationLogsInvalidLogResponse(
    val rejectedLogs: kotlin.collections.List<IntegrationLogsInvalidLogResponseRejectedLogsItems>? = null
)
