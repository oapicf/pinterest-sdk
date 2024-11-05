package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * @param method 
 * @param host HTTP request host from host header.
 * @param path HTTP request path.
 * @param requestHeaders HTTP request headers as key-value pairs.
 * @param responseHeaders HTTP response headers as key-value pairs.
 * @param responseStatusCode 
 */
data class IntegrationLogClientRequest(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("method", required = true) val method: IntegrationLogClientRequest.Method,

    @Schema(example = "null", required = true, description = "HTTP request host from host header.")
    @get:JsonProperty("host", required = true) val host: kotlin.String,

    @Schema(example = "null", required = true, description = "HTTP request path.")
    @get:JsonProperty("path", required = true) val path: kotlin.String,

    @Schema(example = "null", description = "HTTP request headers as key-value pairs.")
    @get:JsonProperty("request_headers") val requestHeaders: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @Schema(example = "null", description = "HTTP response headers as key-value pairs.")
    @get:JsonProperty("response_headers") val responseHeaders: kotlin.collections.Map<kotlin.String, kotlin.String>? = null,

    @Schema(example = "null", description = "")
    @get:JsonProperty("response_status_code") val responseStatusCode: kotlin.Int? = null
    ) {

    /**
    * 
    * Values: GET,HEAD,POST,PUT,DELETE,CONNECT,OPTIONS,TRACE,PATCH
    */
    enum class Method(@get:JsonValue val value: kotlin.String) {

        GET("GET"),
        HEAD("HEAD"),
        POST("POST"),
        PUT("PUT"),
        DELETE("DELETE"),
        CONNECT("CONNECT"),
        OPTIONS("OPTIONS"),
        TRACE("TRACE"),
        PATCH("PATCH");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Method {
                return values().first{it -> it.value == value}
            }
        }
    }

}

