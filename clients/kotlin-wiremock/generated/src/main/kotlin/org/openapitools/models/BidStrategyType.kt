@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BidStrategyType {
    @JsonProperty(value = "AUTOMATIC_BID") AUTOMATIC_BID,
    @JsonProperty(value = "MAX_BID") MAX_BID,
    @JsonProperty(value = "TARGET_AVG") TARGET_AVG,
}
