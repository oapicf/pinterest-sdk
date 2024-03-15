package org.openapitools.model

import java.util.Objects
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
 * @param salesforceOrderLineId OrderLineId in SFDC
 * @param adsManagerOrderLineId Ads manager OrderLineId
 * @param pinOrderId The pin order id associated with the order line in SFDC
 * @param lastModifiedDateTime Last modified date.
 * @param startDate Start date of the order line.
 * @param endDate End date of the order line.
 * @param billToCompanyName Bill To Company name
 * @param billingContactFirstname Billing contact first name
 * @param billingContactLastname Billing contact last name
 * @param billingContactEmail Billing contact email
 * @param mediaContactEmail Billing media email
 * @param mediaContactFirstname Billing contact first name
 * @param mediaContactLastname Billing contact first name
 * @param currencyInfo 
 * @param agencyLink Agency link
 * @param poNumber The po number
 * @param orderName The order name
 * @param pmpName The Pinterest marketing partner name
 * @param acceptedTermsId The SFDC id for the terms
 * @param acceptedTermsTime The UTC timestamp (to the nearest sec) of when terms were accepted
 * @param budgetAmount If Budget order line, the budget amount.
 * @param estimatedMonthlySpend If Ongoing (perpetual) order line, the estimated monthly spend
 */
data class SSIOOrderLine(

    @Schema(example = "null", description = "OrderLineId in SFDC")
    @get:JsonProperty("salesforce_order_line_id") val salesforceOrderLineId: kotlin.String? = null,

    @Schema(example = "null", description = "Ads manager OrderLineId")
    @get:JsonProperty("ads_manager_order_line_id") val adsManagerOrderLineId: kotlin.String? = null,

    @Schema(example = "null", description = "The pin order id associated with the order line in SFDC")
    @get:JsonProperty("pin_order_id") val pinOrderId: kotlin.String? = null,

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$")
    @Schema(example = "2020-10-06T13:07:04.000Z", description = "Last modified date.")
    @get:JsonProperty("last_modified_date_time") val lastModifiedDateTime: kotlin.String? = null,

    @field:Valid
    @Schema(example = "Thu Mar 01 00:00:00 UTC 2018", description = "Start date of the order line.")
    @get:JsonProperty("start_date") val startDate: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "Mon Oct 05 00:00:00 UTC 2020", description = "End date of the order line.")
    @get:JsonProperty("end_date") val endDate: java.time.LocalDate? = null,

    @Schema(example = "Home Depot Inc.", description = "Bill To Company name")
    @get:JsonProperty("bill_to_company_name") val billToCompanyName: kotlin.String? = null,

    @Schema(example = "Mary", description = "Billing contact first name")
    @get:JsonProperty("billing_contact_firstname") val billingContactFirstname: kotlin.String? = null,

    @Schema(example = "Smith", description = "Billing contact last name")
    @get:JsonProperty("billing_contact_lastname") val billingContactLastname: kotlin.String? = null,

    @Schema(example = "mail@test.com", description = "Billing contact email")
    @get:JsonProperty("billing_contact_email") val billingContactEmail: kotlin.String? = null,

    @Schema(example = "mail@test.com", description = "Billing media email")
    @get:JsonProperty("media_contact_email") val mediaContactEmail: kotlin.String? = null,

    @Schema(example = "John", description = "Billing contact first name")
    @get:JsonProperty("media_contact_firstname") val mediaContactFirstname: kotlin.String? = null,

    @Schema(example = "Doe", description = "Billing contact first name")
    @get:JsonProperty("media_contact_lastname") val mediaContactLastname: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("currency_info") val currencyInfo: Currency? = null,

    @Schema(example = "", description = "Agency link")
    @get:JsonProperty("agency_link") val agencyLink: kotlin.String? = null,

    @Schema(example = "null", description = "The po number")
    @get:JsonProperty("po_number") val poNumber: kotlin.String? = null,

    @Schema(example = "null", description = "The order name")
    @get:JsonProperty("order_name") val orderName: kotlin.String? = null,

    @Schema(example = "null", description = "The Pinterest marketing partner name")
    @get:JsonProperty("pmp_name") val pmpName: kotlin.String? = null,

    @Schema(example = "null", description = "The SFDC id for the terms")
    @get:JsonProperty("accepted_terms_id") val acceptedTermsId: kotlin.String? = null,

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2}).(\\d{3})Z$")
    @Schema(example = "2020-10-06T13:07:04.000Z", description = "The UTC timestamp (to the nearest sec) of when terms were accepted")
    @get:JsonProperty("accepted_terms_time") val acceptedTermsTime: kotlin.String? = null,

    @Schema(example = "5000000", description = "If Budget order line, the budget amount.")
    @get:JsonProperty("budget_amount") val budgetAmount: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "If Ongoing (perpetual) order line, the estimated monthly spend")
    @get:JsonProperty("estimated_monthly_spend") val estimatedMonthlySpend: java.math.BigDecimal? = null
) {

}

