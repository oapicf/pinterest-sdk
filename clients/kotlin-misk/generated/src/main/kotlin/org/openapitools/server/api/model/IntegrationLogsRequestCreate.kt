package org.openapitools.server.api.model

import org.openapitools.server.api.model.IntegrationLog
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IntegrationLogsRequestCreate(
    val logs: kotlin.collections.List<IntegrationLog>
)
