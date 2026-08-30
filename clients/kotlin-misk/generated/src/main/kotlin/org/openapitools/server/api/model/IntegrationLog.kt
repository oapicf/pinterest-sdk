package org.openapitools.server.api.model

import org.openapitools.server.api.model.IntegrationLogClientError
import org.openapitools.server.api.model.IntegrationLogClientRequest
import org.openapitools.server.api.model.IntegrationLogEventType
import org.openapitools.server.api.model.IntegrationLogLevel
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IntegrationLog(
    /** Timestamp in milliseconds of when the log was executed at the client. */
    val clientTimestamp: kotlin.Int,
    /** Log event type */
    val eventType: IntegrationLogEventType,
    /** Log level type */
    val logLevel: IntegrationLogLevel,
    val advertiserId: kotlin.String? = null,
    /** Version number of the integration application. */
    val appVersionNumber: kotlin.String? = null,
    val error: IntegrationLogClientError? = null,
    val externalBusinessId: kotlin.String? = null,
    val feedProfileId: kotlin.String? = null,
    val merchantId: kotlin.String? = null,
    /** Explanation of the event that occured. */
    val message: kotlin.String? = null,
    /** Version number of the platform the integration application is running on. */
    val platformVersionNumber: kotlin.String? = null,
    val request: IntegrationLogClientRequest? = null,
    val tagId: kotlin.String? = null
)
