@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class DeliveryEstimateObjectiveType {
    @JsonProperty(value = "AWARENESS") AWARENESS,
    @JsonProperty(value = "CONSIDERATION") CONSIDERATION,
    @JsonProperty(value = "CATALOG_SALES") CATALOG_SALES,
    @JsonProperty(value = "WEB_CONVERSION") WEB_CONVERSION,
}
