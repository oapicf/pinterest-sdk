@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CampaignObjectiveType {
    @JsonProperty(value = "AWARENESS") AWARENESS,
    @JsonProperty(value = "CONSIDERATION") CONSIDERATION,
    @JsonProperty(value = "VIDEO_VIEW") VIDEO_VIEW,
    @JsonProperty(value = "WEB_CONVERSION") WEB_CONVERSION,
    @JsonProperty(value = "CATALOG_SALES") CATALOG_SALES,
    @JsonProperty(value = "WEB_SESSIONS") WEB_SESSIONS,
    @JsonProperty(value = "VIDEO_COMPLETION") VIDEO_COMPLETION,
    @JsonProperty(value = "APP_INSTALL") APP_INSTALL,
    @JsonProperty(value = "SALES") SALES,
    @JsonProperty(value = "LEADS") LEADS,
    @JsonProperty(value = "CTV_CONSIDERATION") CTV_CONSIDERATION,
}
