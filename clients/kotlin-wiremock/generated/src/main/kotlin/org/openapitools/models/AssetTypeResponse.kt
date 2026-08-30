@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class AssetTypeResponse {
    @JsonProperty(value = "AD_ACCOUNT") AD_ACCOUNT,
    @JsonProperty(value = "MERCHANT") MERCHANT,
    @JsonProperty(value = "PROFILE") PROFILE,
    @JsonProperty(value = "ASSET_GROUP") ASSET_GROUP,
    @JsonProperty(value = "PINNER_LIST") PINNER_LIST,
    @JsonProperty(value = "CONVERSION_TAG") CONVERSION_TAG,
    @JsonProperty(value = "CATALOG") CATALOG,
    @JsonProperty(value = "CONVERSION_SEGMENT") CONVERSION_SEGMENT,
}
