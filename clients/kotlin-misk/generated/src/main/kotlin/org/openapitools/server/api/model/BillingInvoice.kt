package org.openapitools.server.api.model

import org.openapitools.server.api.model.BillingInvoiceDocumentType
import org.openapitools.server.api.model.BillingInvoiceStatus
import org.openapitools.server.api.model.Currency
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BillingInvoice(
    /** The ID of the ad account this invoice belongs to */
    val adAccountId: kotlin.String? = null,
    /** The name of the ad account this invoice belongs to */
    val adAccountName: kotlin.String? = null,
    /** The amount billed in this invoice. Denoted in micro currency */
    val amountBilledMicroCurrency: kotlin.Int? = null,
    /** The discount in this invoice. Denoted in micro currency */
    val amountDiscountMicroCurrency: kotlin.Int? = null,
    /** The net amount in this invoice. Denoted in micro currency */
    val amountNetMicroCurrency: kotlin.Int? = null,
    /** The tax in this invoice. Denoted in micro currency */
    val amountTaxMicroCurrency: kotlin.Int? = null,
    /** The country of the bill to address */
    val billToCountry: kotlin.String? = null,
    /** The end date of the billing period. Format: YYYY-MM-DD */
    val billingPeriodEndDate: java.time.LocalDate? = null,
    /** The start date of the billing period. Format: YYYY-MM-DD */
    val billingPeriodStartDate: java.time.LocalDate? = null,
    val currency: Currency? = null,
    /** The type of the document */
    val documentType: BillingInvoiceDocumentType? = null,
    /** Unique identifier for the billing invoice */
    val id: kotlin.String? = null,
    /** The date the invoice is due. Format: YYYY-MM-DD */
    val invoiceDueDate: java.time.LocalDate? = null,
    /** The payment terms of the invoice */
    val paymentTerms: kotlin.String? = null,
    /** The status of the invoice */
    val status: BillingInvoiceStatus? = null
)
