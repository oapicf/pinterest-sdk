@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class CreativeType {
    @JsonProperty(value = "REGULAR") REGULAR,
    @JsonProperty(value = "VIDEO") VIDEO,
    @JsonProperty(value = "SHOPPING") SHOPPING,
    @JsonProperty(value = "CAROUSEL") CAROUSEL,
    @JsonProperty(value = "MAX_VIDEO") MAX_VIDEO,
    @JsonProperty(value = "SHOP_THE_PIN") SHOP_THE_PIN,
    @JsonProperty(value = "COLLECTION") COLLECTION,
    @JsonProperty(value = "IDEA") IDEA,
    @JsonProperty(value = "SHOWCASE") SHOWCASE,
    @JsonProperty(value = "QUIZ") QUIZ,
    @JsonProperty(value = "COLLAGE") COLLAGE,
    @JsonProperty(value = "MAX_WIDTH_REGULAR_COLLECTION") MAX_WIDTH_REGULAR_COLLECTION,
    @JsonProperty(value = "MAX_WIDTH_VIDEO_COLLECTION") MAX_WIDTH_VIDEO_COLLECTION,
    @JsonProperty(value = "APP") APP,
}
