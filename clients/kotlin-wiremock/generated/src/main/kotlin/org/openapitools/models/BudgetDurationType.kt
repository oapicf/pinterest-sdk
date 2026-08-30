@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BudgetDurationType {
    @JsonProperty(value = "FIXED_DAILY") FIXED_DAILY,
    @JsonProperty(value = "FLEXIBLE_DAILY") FLEXIBLE_DAILY,
    @JsonProperty(value = "LIFETIME") LIFETIME,
}
