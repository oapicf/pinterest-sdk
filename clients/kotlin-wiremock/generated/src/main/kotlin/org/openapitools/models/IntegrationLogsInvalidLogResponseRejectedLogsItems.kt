@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class IntegrationLogsInvalidLogResponseRejectedLogsItems(
    @field:JsonProperty("field")
    val `field`: kotlin.String,

    @field:JsonProperty("reason")
    val reason: kotlin.String,

    @field:JsonProperty("value")
    val `value`: kotlin.String,

    @field:JsonProperty("log_index")
    val logIndex: kotlin.Int? = null,

)
