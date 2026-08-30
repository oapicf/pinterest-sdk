@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BillingInvoice(
    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String? = null,

    @field:JsonProperty("ad_account_name")
    val adAccountName: kotlin.String? = null,

    @field:JsonProperty("amount_billed_micro_currency")
    val amountBilledMicroCurrency: kotlin.Int? = null,

    @field:JsonProperty("amount_discount_micro_currency")
    val amountDiscountMicroCurrency: kotlin.Int? = null,

    @field:JsonProperty("amount_net_micro_currency")
    val amountNetMicroCurrency: kotlin.Int? = null,

    @field:JsonProperty("amount_tax_micro_currency")
    val amountTaxMicroCurrency: kotlin.Int? = null,

    @field:JsonProperty("bill_to_country")
    val billToCountry: kotlin.String? = null,

    @field:JsonProperty("billing_period_end_date")
    val billingPeriodEndDate: java.time.LocalDate? = null,

    @field:JsonProperty("billing_period_start_date")
    val billingPeriodStartDate: java.time.LocalDate? = null,

    @field:JsonProperty("currency")
    val currency: Currency? = null,

    @field:JsonProperty("document_type")
    val documentType: BillingInvoiceDocumentType? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("invoice_due_date")
    val invoiceDueDate: java.time.LocalDate? = null,

    @field:JsonProperty("payment_terms")
    val paymentTerms: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: BillingInvoiceStatus? = null,

)
