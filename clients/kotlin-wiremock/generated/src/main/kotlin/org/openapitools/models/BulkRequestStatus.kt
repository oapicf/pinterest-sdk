@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BulkRequestStatus {
    @JsonProperty(value = "RUNNING") RUNNING,
    @JsonProperty(value = "SUCCEEDED") SUCCEEDED,
    @JsonProperty(value = "FAILED") FAILED,
}
