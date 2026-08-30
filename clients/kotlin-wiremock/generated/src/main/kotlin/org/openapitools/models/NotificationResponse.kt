@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class NotificationResponse(
    @field:JsonProperty("error_msg")
    val errorMsg: kotlin.String? = null,

    @field:JsonProperty("received_at")
    val receivedAt: kotlin.Int? = null,

    @field:JsonProperty("success")
    val success: kotlin.Boolean? = null,

)
