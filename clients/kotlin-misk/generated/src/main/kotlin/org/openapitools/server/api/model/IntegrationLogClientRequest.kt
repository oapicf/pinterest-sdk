package org.openapitools.server.api.model

import org.openapitools.server.api.model.HttpMethod
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IntegrationLogClientRequest(
    /** HTTP request host from host header. */
    val host: kotlin.String,
    val method: HttpMethod,
    /** HTTP request path. */
    val path: kotlin.String,
    /** HTTP request headers as key-value pairs. */
    val requestHeaders: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    /** HTTP response headers as key-value pairs. */
    val responseHeaders: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,
    val responseStatusCode: kotlin.Int? = null
)
