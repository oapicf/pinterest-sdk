package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class NotificationResponse(
    /** error message when success is false */
    val errorMsg: kotlin.String? = null,
    /** Received time. Unix timestamp in seconds. */
    val receivedAt: kotlin.Int? = null,
    /** Returns true if the notification accepted. */
    val success: kotlin.Boolean? = null
)
