@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class ScheduleType {
    @JsonProperty(value = "CAMPAIGN_BUDGET_CHANGE") CAMPAIGN_BUDGET_CHANGE,
    @JsonProperty(value = "CAMPAIGN_BID_MULTIPLIERS") CAMPAIGN_BID_MULTIPLIERS,
}
