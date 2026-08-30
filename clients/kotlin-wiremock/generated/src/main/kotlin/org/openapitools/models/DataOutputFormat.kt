@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class DataOutputFormat {
    @JsonProperty(value = "JSON") JSON,
    @JsonProperty(value = "CSV") CSV,
}
