@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AdCollectionsHeaderType {
    @JsonProperty(value = "SHOP_THIS_COLLECTION") SHOP_THIS_COLLECTION,
    @JsonProperty(value = "EXPLORE_THIS_COLLECTION") EXPLORE_THIS_COLLECTION,
    @JsonProperty(value = "NO_HEADER") NO_HEADER,
}
