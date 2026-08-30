@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ConversionProductReportLevel {
    @JsonProperty(value = "ADVERTISER") ADVERTISER,
    @JsonProperty(value = "CAMPAIGN") CAMPAIGN,
    @JsonProperty(value = "AD_GROUP") AD_GROUP,
}
