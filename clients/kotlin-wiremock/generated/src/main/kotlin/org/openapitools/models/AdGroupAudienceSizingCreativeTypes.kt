@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AdGroupAudienceSizingCreativeTypes {
    @JsonProperty(value = "REGULAR") REGULAR,
    @JsonProperty(value = "VIDEO") VIDEO,
    @JsonProperty(value = "SHOPPING") SHOPPING,
    @JsonProperty(value = "CAROUSEL") CAROUSEL,
    @JsonProperty(value = "MAX_VIDEO") MAX_VIDEO,
    @JsonProperty(value = "SHOP_THE_PIN") SHOP_THE_PIN,
    @JsonProperty(value = "COLLECTION") COLLECTION,
    @JsonProperty(value = "IDEA") IDEA,
}
