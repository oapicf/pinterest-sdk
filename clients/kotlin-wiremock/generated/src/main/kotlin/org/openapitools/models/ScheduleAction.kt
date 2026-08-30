@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ScheduleAction {
    @JsonProperty(value = "INCREASE_BY_VALUE") INCREASE_BY_VALUE,
    @JsonProperty(value = "INCREASE_BY_PERCENT") INCREASE_BY_PERCENT,
}
