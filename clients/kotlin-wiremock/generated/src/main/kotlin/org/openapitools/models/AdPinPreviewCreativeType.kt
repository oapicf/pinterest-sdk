@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AdPinPreviewCreativeType {
    @JsonProperty(value = "SHOPPING") SHOPPING,
    @JsonProperty(value = "COLLECTION") COLLECTION,
    @JsonProperty(value = "MAX_VIDEO") MAX_VIDEO,
    @JsonProperty(value = "MAX_WIDTH_VIDEO_COLLECTION") MAX_WIDTH_VIDEO_COLLECTION,
    @JsonProperty(value = "MAX_WIDTH_REGULAR_COLLECTION") MAX_WIDTH_REGULAR_COLLECTION,
}
