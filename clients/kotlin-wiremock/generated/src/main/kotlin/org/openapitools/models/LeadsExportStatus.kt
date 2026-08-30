@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class LeadsExportStatus {
    @JsonProperty(value = "IN_PROGRESS") IN_PROGRESS,
    @JsonProperty(value = "FINISHED") FINISHED,
    @JsonProperty(value = "FAILED") FAILED,
}
