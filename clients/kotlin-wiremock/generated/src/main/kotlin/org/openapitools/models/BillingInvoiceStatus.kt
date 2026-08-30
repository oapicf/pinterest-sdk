@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BillingInvoiceStatus {
    @JsonProperty(value = "OPEN") OPEN,
    @JsonProperty(value = "CLOSED") CLOSED,
}
