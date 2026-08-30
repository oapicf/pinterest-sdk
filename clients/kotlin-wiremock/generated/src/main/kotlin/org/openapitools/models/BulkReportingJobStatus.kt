@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BulkReportingJobStatus {
    @JsonProperty(value = "DOES_NOT_EXIST") DOES_NOT_EXIST,
    @JsonProperty(value = "FINISHED") FINISHED,
    @JsonProperty(value = "IN_PROGRESS") IN_PROGRESS,
    @JsonProperty(value = "EXPIRED") EXPIRED,
    @JsonProperty(value = "FAILED") FAILED,
    @JsonProperty(value = "CANCELLED") CANCELLED,
}
