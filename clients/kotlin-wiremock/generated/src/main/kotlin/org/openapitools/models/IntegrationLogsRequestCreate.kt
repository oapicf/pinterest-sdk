@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class IntegrationLogsRequestCreate(
    @field:JsonProperty("logs")
    val logs: kotlin.collections.List<IntegrationLog>,

)
