@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class MMMReportLevel {
    @JsonProperty(value = "CAMPAIGN_TARGETING") CAMPAIGN_TARGETING,
    @JsonProperty(value = "AD_GROUP_TARGETING") AD_GROUP_TARGETING,
}
