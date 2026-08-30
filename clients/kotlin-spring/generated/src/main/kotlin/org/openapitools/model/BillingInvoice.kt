package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.BillingInvoiceDocumentType
import org.openapitools.model.BillingInvoiceStatus
import org.openapitools.model.Currency
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * A billing invoice in the advertiser account.
 * @param adAccountId The ID of the ad account this invoice belongs to
 * @param adAccountName The name of the ad account this invoice belongs to
 * @param amountBilledMicroCurrency The amount billed in this invoice. Denoted in micro currency
 * @param amountDiscountMicroCurrency The discount in this invoice. Denoted in micro currency
 * @param amountNetMicroCurrency The net amount in this invoice. Denoted in micro currency
 * @param amountTaxMicroCurrency The tax in this invoice. Denoted in micro currency
 * @param billToCountry The country of the bill to address
 * @param billingPeriodEndDate The end date of the billing period. Format: YYYY-MM-DD
 * @param billingPeriodStartDate The start date of the billing period. Format: YYYY-MM-DD
 * @param currency 
 * @param documentType The type of the document
 * @param id Unique identifier for the billing invoice
 * @param invoiceDueDate The date the invoice is due. Format: YYYY-MM-DD
 * @param paymentTerms The payment terms of the invoice
 * @param status The status of the invoice
 */
data class BillingInvoice(

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "The ID of the ad account this invoice belongs to")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_account_id")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(description = "The name of the ad account this invoice belongs to")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ad_account_name")
    @get:JsonProperty("ad_account_name") val adAccountName: kotlin.String? = null,

    @Schema(description = "The amount billed in this invoice. Denoted in micro currency")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("amount_billed_micro_currency")
    @get:JsonProperty("amount_billed_micro_currency") val amountBilledMicroCurrency: kotlin.Int? = null,

    @Schema(description = "The discount in this invoice. Denoted in micro currency")
    @param:JsonProperty("amount_discount_micro_currency")
    @get:JsonProperty("amount_discount_micro_currency") val amountDiscountMicroCurrency: kotlin.Int? = null,

    @Schema(description = "The net amount in this invoice. Denoted in micro currency")
    @param:JsonProperty("amount_net_micro_currency")
    @get:JsonProperty("amount_net_micro_currency") val amountNetMicroCurrency: kotlin.Int? = null,

    @Schema(description = "The tax in this invoice. Denoted in micro currency")
    @param:JsonProperty("amount_tax_micro_currency")
    @get:JsonProperty("amount_tax_micro_currency") val amountTaxMicroCurrency: kotlin.Int? = null,

    @Schema(description = "The country of the bill to address")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("bill_to_country")
    @get:JsonProperty("bill_to_country") val billToCountry: kotlin.String? = null,

    @field:Valid
    @Schema(description = "The end date of the billing period. Format: YYYY-MM-DD")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("billing_period_end_date")
    @get:JsonProperty("billing_period_end_date") val billingPeriodEndDate: java.time.LocalDate? = null,

    @field:Valid
    @Schema(description = "The start date of the billing period. Format: YYYY-MM-DD")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("billing_period_start_date")
    @get:JsonProperty("billing_period_start_date") val billingPeriodStartDate: java.time.LocalDate? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("currency")
    @get:JsonProperty("currency") val currency: Currency? = null,

    @field:Valid
    @Schema(description = "The type of the document")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("document_type")
    @get:JsonProperty("document_type") val documentType: BillingInvoiceDocumentType? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(description = "Unique identifier for the billing invoice")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("id")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(description = "The date the invoice is due. Format: YYYY-MM-DD")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("invoice_due_date")
    @get:JsonProperty("invoice_due_date") val invoiceDueDate: java.time.LocalDate? = null,

    @Schema(example = "NET 30", description = "The payment terms of the invoice")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("payment_terms")
    @get:JsonProperty("payment_terms") val paymentTerms: kotlin.String? = null,

    @field:Valid
    @Schema(example = "OPEN", description = "The status of the invoice")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("status")
    @get:JsonProperty("status") val status: BillingInvoiceStatus? = null
) {

}

