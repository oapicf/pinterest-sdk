@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class SourcePlatformOptions {
    @JsonProperty(value = "WEB") WEB,
    @JsonProperty(value = "MOBILE") MOBILE,
    @JsonProperty(value = "MOBILE_ANDROID") MOBILE_ANDROID,
    @JsonProperty(value = "MOBILE_IOS") MOBILE_IOS,
    @JsonProperty(value = "OFFLINE") OFFLINE,
    @JsonProperty(value = "PINTEREST_WEB") PINTEREST_WEB,
    @JsonProperty(value = "PINTEREST_ANDROID") PINTEREST_ANDROID,
    @JsonProperty(value = "PINTEREST_IOS") PINTEREST_IOS,
    @JsonProperty(value = "POINT_OF_SALE") POINT_OF_SALE,
}
