@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BillingInvoiceDocumentType {
    @JsonProperty(value = "INVOICE") INVOICE,
    @JsonProperty(value = "CREDIT_MEMO") CREDIT_MEMO,
}
