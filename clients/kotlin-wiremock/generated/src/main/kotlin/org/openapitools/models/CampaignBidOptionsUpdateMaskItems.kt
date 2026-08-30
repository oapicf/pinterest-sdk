@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CampaignBidOptionsUpdateMaskItems {
    @JsonProperty(value = "AUDIENCE") AUDIENCE,
    @JsonProperty(value = "APP_TYPE") APP_TYPE,
    @JsonProperty(value = "PLACEMENT") PLACEMENT,
    @JsonProperty(value = "GENDER") GENDER,
    @JsonProperty(value = "AGE_BUCKET") AGE_BUCKET,
    @JsonProperty(value = "FREQUENCY") FREQUENCY,
}
