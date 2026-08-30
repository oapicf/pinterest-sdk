package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.HttpMethod
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * HTTP request details included in the log sent by the client.
 * @param host HTTP request host from host header.
 * @param method 
 * @param path HTTP request path.
 * @param requestHeaders HTTP request headers as key-value pairs.
 * @param responseHeaders HTTP response headers as key-value pairs.
 * @param responseStatusCode 
 */
data class IntegrationLogClientRequest(

    @Schema(required = true, description = "HTTP request host from host header.")
    @param:JsonProperty("host")
    @get:JsonProperty("host", required = true) val host: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("method")
    @get:JsonProperty("method", required = true) val method: HttpMethod,

    @Schema(required = true, description = "HTTP request path.")
    @param:JsonProperty("path")
    @get:JsonProperty("path", required = true) val path: kotlin.String,

    @Schema(description = "HTTP request headers as key-value pairs.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("request_headers")
    @get:JsonProperty("request_headers") val requestHeaders: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @Schema(description = "HTTP response headers as key-value pairs.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("response_headers")
    @get:JsonProperty("response_headers") val responseHeaders: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("response_status_code")
    @get:JsonProperty("response_status_code") val responseStatusCode: kotlin.Int? = null
) {

}

