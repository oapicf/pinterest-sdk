@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BillingProfilePaymentMethodBrand {
    @JsonProperty(value = "UNKNOWN") UNKNOWN,
    @JsonProperty(value = "VISA") VISA,
    @JsonProperty(value = "MASTERCARD") MASTERCARD,
    @JsonProperty(value = "AMERICAN_EXPRESS") AMERICAN_EXPRESS,
    @JsonProperty(value = "DISCOVER") DISCOVER,
    @JsonProperty(value = "SOFORT") SOFORT,
    @JsonProperty(value = "DINERS_CLUB") DINERS_CLUB,
    @JsonProperty(value = "ELO") ELO,
    @JsonProperty(value = "CARTE_BANCAIRE") CARTE_BANCAIRE,
}
