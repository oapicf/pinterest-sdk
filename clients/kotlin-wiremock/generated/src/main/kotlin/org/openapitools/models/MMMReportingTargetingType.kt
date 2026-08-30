@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class MMMReportingTargetingType {
    @JsonProperty(value = "APPTYPE") APPTYPE,
    @JsonProperty(value = "COUNTRY") COUNTRY,
    @JsonProperty(value = "CREATIVE_TYPE") CREATIVE_TYPE,
    @JsonProperty(value = "GENDER") GENDER,
    @JsonProperty(value = "LOCATION") LOCATION,
    @JsonProperty(value = "PLACEMENT") PLACEMENT,
    @JsonProperty(value = "AUDIENCE_INCLUDE") AUDIENCE_INCLUDE,
}
