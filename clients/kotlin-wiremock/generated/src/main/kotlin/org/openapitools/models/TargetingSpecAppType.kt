@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class TargetingSpecAppType {
    @JsonProperty(value = "android_mobile") android_mobile,
    @JsonProperty(value = "android_tablet") android_tablet,
    @JsonProperty(value = "ipad") ipad,
    @JsonProperty(value = "iphone") iphone,
    @JsonProperty(value = "web") web,
    @JsonProperty(value = "web_mobile") web_mobile,
}
