@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class PromotionApplicationLevel {
    @JsonProperty(value = "NONE") NONE,
    @JsonProperty(value = "ITEM") ITEM,
    @JsonProperty(value = "AD_GROUP") AD_GROUP,
}
