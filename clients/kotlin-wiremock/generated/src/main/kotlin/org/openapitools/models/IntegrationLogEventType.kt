@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class IntegrationLogEventType {
    @JsonProperty(value = "APP") APP,
    @JsonProperty(value = "API") API,
}
