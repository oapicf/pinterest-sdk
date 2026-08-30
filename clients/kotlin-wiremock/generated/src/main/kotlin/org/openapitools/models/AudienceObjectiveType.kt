@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AudienceObjectiveType {
    @JsonProperty(value = "AWARENESS") AWARENESS,
    @JsonProperty(value = "CONSIDERATION") CONSIDERATION,
    @JsonProperty(value = "WEB_CONVERSION") WEB_CONVERSION,
    @JsonProperty(value = "CATALOG_SALES") CATALOG_SALES,
    @JsonProperty(value = "VIDEO_COMPLETION") VIDEO_COMPLETION,
    @JsonProperty(value = "SALES") SALES,
}
