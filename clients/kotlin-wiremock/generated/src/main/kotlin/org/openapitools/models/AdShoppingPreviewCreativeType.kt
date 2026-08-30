@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AdShoppingPreviewCreativeType {
    @JsonProperty(value = "SHOPPING") SHOPPING,
    @JsonProperty(value = "COLLECTION") COLLECTION,
    @JsonProperty(value = "CAROUSEL") CAROUSEL,
    @JsonProperty(value = "MAX_WIDTH_COLLECTION") MAX_WIDTH_COLLECTION,
}
