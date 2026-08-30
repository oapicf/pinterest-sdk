@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BillingProfileCardType {
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
    @JsonProperty(value = "VISA") VISA,
    @JsonProperty(value = "MASTERCARD") MASTERCARD,
    @JsonProperty(value = "AMERICAN_EXPRESS") AMERICAN_EXPRESS,
    @JsonProperty(value = "DISCOVER") DISCOVER,
    @JsonProperty(value = "ELO") ELO,
}
