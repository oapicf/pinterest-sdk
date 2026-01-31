package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * 
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
data class BillingInvoiceResponse(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "The ID of the ad account this invoice belongs to")
    @get:JsonProperty("ad_account_id") val adAccountId: kotlin.String? = null,

    @Schema(example = "null", description = "The name of the ad account this invoice belongs to")
    @get:JsonProperty("ad_account_name") val adAccountName: kotlin.String? = null,

    @Schema(example = "null", description = "The amount billed in this invoice. Denoted in micro currency")
    @get:JsonProperty("amount_billed_micro_currency") val amountBilledMicroCurrency: kotlin.Int? = null,

    @Schema(example = "null", description = "The discount in this invoice. Denoted in micro currency")
    @get:JsonProperty("amount_discount_micro_currency") val amountDiscountMicroCurrency: kotlin.Int? = null,

    @Schema(example = "null", description = "The net amount in this invoice. Denoted in micro currency")
    @get:JsonProperty("amount_net_micro_currency") val amountNetMicroCurrency: kotlin.Int? = null,

    @Schema(example = "null", description = "The tax in this invoice. Denoted in micro currency")
    @get:JsonProperty("amount_tax_micro_currency") val amountTaxMicroCurrency: kotlin.Int? = null,

    @Schema(example = "null", description = "The country of the bill to address")
    @get:JsonProperty("bill_to_country") val billToCountry: kotlin.String? = null,

    @field:Valid
    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @Schema(example = "null", description = "The end date of the billing period. Format: YYYY-MM-DD")
    @get:JsonProperty("billing_period_end_date") val billingPeriodEndDate: java.time.LocalDate? = null,

    @field:Valid
    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @Schema(example = "null", description = "The start date of the billing period. Format: YYYY-MM-DD")
    @get:JsonProperty("billing_period_start_date") val billingPeriodStartDate: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currency") val currency: Currency? = null,

    @Schema(example = "null", description = "The type of the document")
    @get:JsonProperty("document_type") val documentType: BillingInvoiceResponse.DocumentType? = null,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "null", description = "Unique identifier for the billing invoice")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @Schema(example = "null", description = "The date the invoice is due. Format: YYYY-MM-DD")
    @get:JsonProperty("invoice_due_date") val invoiceDueDate: java.time.LocalDate? = null,

    @Schema(example = "NET 30", description = "The payment terms of the invoice")
    @get:JsonProperty("payment_terms") val paymentTerms: kotlin.String? = null,

    @Schema(example = "OPEN", description = "The status of the invoice")
    @get:JsonProperty("status") val status: BillingInvoiceResponse.Status? = null
) {

    /**
    * The type of the document
    * Values: INVOICE,CREDIT_MEMO
    */
    enum class DocumentType(@get:JsonValue val value: kotlin.String) {

        INVOICE("INVOICE"),
        CREDIT_MEMO("CREDIT_MEMO");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): DocumentType {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'BillingInvoiceResponse'")
            }
        }
    }

    /**
    * The status of the invoice
    * Values: OPEN,CLOSED
    */
    enum class Status(@get:JsonValue val value: kotlin.String) {

        OPEN("OPEN"),
        CLOSED("CLOSED");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Status {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'BillingInvoiceResponse'")
            }
        }
    }

}

