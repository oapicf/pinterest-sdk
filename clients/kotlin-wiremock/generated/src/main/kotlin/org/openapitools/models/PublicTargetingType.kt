@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PublicTargetingType {
    @JsonProperty(value = "APPTYPE") APPTYPE,
    @JsonProperty(value = "GENDER") GENDER,
    @JsonProperty(value = "LOCALE") LOCALE,
    @JsonProperty(value = "AGE_BUCKET") AGE_BUCKET,
    @JsonProperty(value = "LOCATION") LOCATION,
    @JsonProperty(value = "GEO") GEO,
    @JsonProperty(value = "INTEREST") INTEREST,
    @JsonProperty(value = "KEYWORD") KEYWORD,
    @JsonProperty(value = "AUDIENCE_INCLUDE") AUDIENCE_INCLUDE,
    @JsonProperty(value = "AUDIENCE_EXCLUDE") AUDIENCE_EXCLUDE,
}
