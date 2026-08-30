@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

enum class BillingInvoiceSortField {
    @JsonProperty(value = "DUE_DATE") DUE_DATE,
    @JsonProperty(value = "BILLING_PERIOD") BILLING_PERIOD,
    @JsonProperty(value = "DOCUMENT_TYPE") DOCUMENT_TYPE,
    @JsonProperty(value = "TOTAL_AMOUNT") TOTAL_AMOUNT,
    @JsonProperty(value = "INVOICE_NUMBER") INVOICE_NUMBER,
}
