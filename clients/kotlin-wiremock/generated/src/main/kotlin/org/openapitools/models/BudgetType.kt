@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BudgetType {
    @JsonProperty(value = "DAILY") DAILY,
    @JsonProperty(value = "LIFETIME") LIFETIME,
    @JsonProperty(value = "CBO_ADGROUP") CBO_ADGROUP,
}
