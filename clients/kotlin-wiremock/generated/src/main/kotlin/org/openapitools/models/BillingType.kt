@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BillingType {
    @JsonProperty(value = "CREDIT_CARD") CREDIT_CARD,
    @JsonProperty(value = "INVOICE") INVOICE,
    @JsonProperty(value = "INTERNAL") INTERNAL,
    @JsonProperty(value = "RECURRING") RECURRING,
    @JsonProperty(value = "PREPAID") PREPAID,
}
