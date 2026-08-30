@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AdsAnalyticsAccountTargetingType {
    @JsonProperty(value = "KEYWORD") KEYWORD,
    @JsonProperty(value = "APPTYPE") APPTYPE,
    @JsonProperty(value = "GENDER") GENDER,
    @JsonProperty(value = "LOCATION") LOCATION,
    @JsonProperty(value = "PLACEMENT") PLACEMENT,
    @JsonProperty(value = "COUNTRY") COUNTRY,
    @JsonProperty(value = "TARGETED_INTEREST") TARGETED_INTEREST,
    @JsonProperty(value = "PINNER_INTEREST") PINNER_INTEREST,
    @JsonProperty(value = "AUDIENCE_INCLUDE") AUDIENCE_INCLUDE,
    @JsonProperty(value = "GEO") GEO,
    @JsonProperty(value = "AGE_BUCKET") AGE_BUCKET,
    @JsonProperty(value = "REGION") REGION,
    @JsonProperty(value = "AGE_BUCKET_AND_GENDER") AGE_BUCKET_AND_GENDER,
}
