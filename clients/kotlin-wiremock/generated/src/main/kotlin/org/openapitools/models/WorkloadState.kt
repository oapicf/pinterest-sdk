@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class WorkloadState {
    @JsonProperty(value = "NOT_STARTED") NOT_STARTED,
    @JsonProperty(value = "RUNNING") RUNNING,
    @JsonProperty(value = "PAUSED") PAUSED,
    @JsonProperty(value = "SUCCEEDED") SUCCEEDED,
    @JsonProperty(value = "FAILED") FAILED,
}
