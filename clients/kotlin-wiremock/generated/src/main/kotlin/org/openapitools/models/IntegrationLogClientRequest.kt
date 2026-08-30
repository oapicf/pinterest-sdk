@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class IntegrationLogClientRequest(
    @field:JsonProperty("host")
    val host: kotlin.String,

    @field:JsonProperty("method")
    val method: HttpMethod,

    @field:JsonProperty("path")
    val path: kotlin.String,

    @field:JsonProperty("request_headers")
    val requestHeaders: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @field:JsonProperty("response_headers")
    val responseHeaders: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @field:JsonProperty("response_status_code")
    val responseStatusCode: kotlin.Int? = null,

)
