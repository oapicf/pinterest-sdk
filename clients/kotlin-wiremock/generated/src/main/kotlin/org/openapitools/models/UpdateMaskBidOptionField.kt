@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class UpdateMaskBidOptionField {
    @JsonProperty(value = "BID") BID,
    @JsonProperty(value = "APP_TYPE_BID_MULTIPLIER_SET") APP_TYPE_BID_MULTIPLIER_SET,
    @JsonProperty(value = "PLACEMENT_BID_MULTIPLIER_SET") PLACEMENT_BID_MULTIPLIER_SET,
}
