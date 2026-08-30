@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class MetricsReportingTemplateType {
    @JsonProperty(value = "UNSPECIFIED") UNSPECIFIED,
    @JsonProperty(value = "BULK") BULK,
    @JsonProperty(value = "OVERVIEW") OVERVIEW,
    @JsonProperty(value = "TABLE") TABLE,
    @JsonProperty(value = "MMM") MMM,
    @JsonProperty(value = "BRAND_CATEGORY") BRAND_CATEGORY,
}
