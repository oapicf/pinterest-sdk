@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class FrequencyGoalMetadataTimerange {
    @JsonProperty(value = "THIRTY_DAY") THIRTY_DAY,
    @JsonProperty(value = "DAY") DAY,
    @JsonProperty(value = "SEVEN_DAY") SEVEN_DAY,
    @JsonProperty(value = "TWENTY_MINUTE") TWENTY_MINUTE,
    @JsonProperty(value = "TEN_MINUTE") TEN_MINUTE,
    @JsonProperty(value = "TWENTY_FOUR_HOUR") TWENTY_FOUR_HOUR,
}
