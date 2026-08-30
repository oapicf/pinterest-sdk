@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ConversionReportAttributionType {
    @JsonProperty(value = "INDIVIDUAL") INDIVIDUAL,
    @JsonProperty(value = "HOUSEHOLD") HOUSEHOLD,
}
