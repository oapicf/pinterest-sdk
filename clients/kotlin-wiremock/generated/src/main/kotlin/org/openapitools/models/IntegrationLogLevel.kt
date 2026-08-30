@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class IntegrationLogLevel {
    @JsonProperty(value = "INFO") INFO,
    @JsonProperty(value = "WARN") WARN,
    @JsonProperty(value = "ERROR") ERROR,
}
