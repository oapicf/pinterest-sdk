@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class HttpMethod {
    @JsonProperty(value = "GET") GET,
    @JsonProperty(value = "HEAD") HEAD,
    @JsonProperty(value = "POST") POST,
    @JsonProperty(value = "PUT") PUT,
    @JsonProperty(value = "DELETE") DELETE,
    @JsonProperty(value = "CONNECT") CONNECT,
    @JsonProperty(value = "OPTIONS") OPTIONS,
    @JsonProperty(value = "TRACE") TRACE,
    @JsonProperty(value = "PATCH") PATCH,
}
