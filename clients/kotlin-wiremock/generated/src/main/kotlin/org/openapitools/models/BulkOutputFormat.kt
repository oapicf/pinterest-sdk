@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BulkOutputFormat {
    @JsonProperty(value = "CSV") CSV,
    @JsonProperty(value = "JSON") JSON,
}
