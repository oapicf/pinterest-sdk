package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
 * A Salesforce SSIO order line.
 * @param acceptedTermsId The SFDC id for the terms
 * @param acceptedTermsTime The UTC timestamp (to the nearest second) when terms were accepted.
 * @param adsManagerOrderLineId Ads manager order line id
 * @param agencyLink Agency link
 * @param billToCompanyName Bill-to company name
 * @param billingContactEmail Billing contact email
 * @param billingContactFirstname Billing contact first name
 * @param billingContactLastname Billing contact last name
 * @param budgetAmount If budget order line, the budget amount.
 * @param currencyInfo 
 * @param endDate End date of the order line.
 * @param estimatedMonthlySpend If ongoing (perpetual) order line, the estimated monthly spend.
 * @param lastModifiedDateTime Last modified date.
 * @param mediaContactEmail Billing media email
 * @param mediaContactFirstname Billing media contact first name
 * @param mediaContactLastname Billing media contact last name
 * @param orderName The order name
 * @param pinOrderId The pin order id associated with the order line in SFDC
 * @param pmpName The Pinterest marketing partner name
 * @param poNumber The PO number
 * @param salesforceOrderLineId Order line id in SFDC
 * @param startDate Start date of the order line.
 */
data class SSIOOrderLine(

    @Schema(description = "The SFDC id for the terms")
    @param:JsonProperty("accepted_terms_id")
    @get:JsonProperty("accepted_terms_id") val acceptedTermsId: kotlin.String? = null,

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2})\\.(\\d{3})Z$")
    @Schema(example = "2020-10-06T13:07:04.000Z", description = "The UTC timestamp (to the nearest second) when terms were accepted.")
    @param:JsonProperty("accepted_terms_time")
    @get:JsonProperty("accepted_terms_time") val acceptedTermsTime: kotlin.String? = null,

    @Schema(description = "Ads manager order line id")
    @param:JsonProperty("ads_manager_order_line_id")
    @get:JsonProperty("ads_manager_order_line_id") val adsManagerOrderLineId: kotlin.String? = null,

    @Schema(example = "", description = "Agency link")
    @param:JsonProperty("agency_link")
    @get:JsonProperty("agency_link") val agencyLink: kotlin.String? = null,

    @Schema(example = "Home Depot Inc.", description = "Bill-to company name")
    @param:JsonProperty("bill_to_company_name")
    @get:JsonProperty("bill_to_company_name") val billToCompanyName: kotlin.String? = null,

    @Schema(example = "mail@test.com", description = "Billing contact email")
    @param:JsonProperty("billing_contact_email")
    @get:JsonProperty("billing_contact_email") val billingContactEmail: kotlin.String? = null,

    @Schema(example = "Mary", description = "Billing contact first name")
    @param:JsonProperty("billing_contact_firstname")
    @get:JsonProperty("billing_contact_firstname") val billingContactFirstname: kotlin.String? = null,

    @Schema(example = "Smith", description = "Billing contact last name")
    @param:JsonProperty("billing_contact_lastname")
    @get:JsonProperty("billing_contact_lastname") val billingContactLastname: kotlin.String? = null,

    @Schema(example = "5000000", description = "If budget order line, the budget amount.")
    @param:JsonProperty("budget_amount")
    @get:JsonProperty("budget_amount") val budgetAmount: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(description = "")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("currency_info")
    @get:JsonProperty("currency_info") val currencyInfo: Currency? = null,

    @field:Valid
    @Schema(description = "End date of the order line.")
    @param:JsonProperty("end_date")
    @get:JsonProperty("end_date") val endDate: java.time.LocalDate? = null,

    @Schema(description = "If ongoing (perpetual) order line, the estimated monthly spend.")
    @param:JsonProperty("estimated_monthly_spend")
    @get:JsonProperty("estimated_monthly_spend") val estimatedMonthlySpend: java.math.BigDecimal? = null,

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})T(\\d{2}):(\\d{2}):(\\d{2})\\.(\\d{3})Z$")
    @Schema(example = "2020-10-06T13:07:04.000Z", description = "Last modified date.")
    @param:JsonProperty("last_modified_date_time")
    @get:JsonProperty("last_modified_date_time") val lastModifiedDateTime: kotlin.String? = null,

    @Schema(example = "mail@test.com", description = "Billing media email")
    @param:JsonProperty("media_contact_email")
    @get:JsonProperty("media_contact_email") val mediaContactEmail: kotlin.String? = null,

    @Schema(example = "John", description = "Billing media contact first name")
    @param:JsonProperty("media_contact_firstname")
    @get:JsonProperty("media_contact_firstname") val mediaContactFirstname: kotlin.String? = null,

    @Schema(example = "Doe", description = "Billing media contact last name")
    @param:JsonProperty("media_contact_lastname")
    @get:JsonProperty("media_contact_lastname") val mediaContactLastname: kotlin.String? = null,

    @Schema(description = "The order name")
    @param:JsonProperty("order_name")
    @get:JsonProperty("order_name") val orderName: kotlin.String? = null,

    @Schema(description = "The pin order id associated with the order line in SFDC")
    @param:JsonProperty("pin_order_id")
    @get:JsonProperty("pin_order_id") val pinOrderId: kotlin.String? = null,

    @Schema(description = "The Pinterest marketing partner name")
    @param:JsonProperty("pmp_name")
    @get:JsonProperty("pmp_name") val pmpName: kotlin.String? = null,

    @Schema(description = "The PO number")
    @param:JsonProperty("po_number")
    @get:JsonProperty("po_number") val poNumber: kotlin.String? = null,

    @Schema(description = "Order line id in SFDC")
    @param:JsonProperty("salesforce_order_line_id")
    @get:JsonProperty("salesforce_order_line_id") val salesforceOrderLineId: kotlin.String? = null,

    @field:Valid
    @Schema(description = "Start date of the order line.")
    @param:JsonProperty("start_date")
    @get:JsonProperty("start_date") val startDate: java.time.LocalDate? = null
) {

}

