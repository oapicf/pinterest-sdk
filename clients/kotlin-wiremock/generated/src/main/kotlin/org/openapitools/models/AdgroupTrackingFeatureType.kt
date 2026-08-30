@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AdgroupTrackingFeatureType {
    @JsonProperty(value = "TRENDS") TRENDS,
    @JsonProperty(value = "CLONE_META") CLONE_META,
    @JsonProperty(value = "BULK_EDITOR") BULK_EDITOR,
    @JsonProperty(value = "AD_ROTATION") AD_ROTATION,
}
