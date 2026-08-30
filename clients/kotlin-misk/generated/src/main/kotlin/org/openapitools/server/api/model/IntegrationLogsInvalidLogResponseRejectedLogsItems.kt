package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IntegrationLogsInvalidLogResponseRejectedLogsItems(
    /** The field name containing an invalid value. */
    val `field`: kotlin.String,
    /** The reason the value is invalid. */
    val reason: kotlin.String,
    /** The value that is invalid. */
    val `value`: kotlin.String,
    /** Index of the log in the batch. */
    val logIndex: kotlin.Int? = null
)
