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
 * @param startDate Starting date of time period. Format: YYYY-MM-DD
 * @param poNumber The po number
 * @param billingContactFirstname The billing contact first name
 * @param billingContactLastname The billing contact last name
 * @param billingContactEmail The billing contact email
 * @param mediaContactFirstname The media contact first name
 * @param mediaContactLastname The media contact last name
 * @param mediaContactEmail The media contact email
 * @param pmpId The pmp id
 * @param orderName The order name
 * @param orderLineType Type can be Budget or Perpetual
 * @param acceptedTermsId The SFDC id for the terms
 * @param billtoCompanyId The bill-to company id
 * @param billtoBusinessAddressId The bill-to business address id
 * @param billtoBillingAddressId The bill-to billing address id
 * @param currencyInfo 
 * @param endDate End date of time period. Format: YYYY-MM-DD
 * @param budgetAmount If Budget order line, the budget amount.
 * @param agencyLink URL link for agency
 * @param userEmail The email of user submitting the insertion order
 * @param acceptedTermsTime The UTC timestamp (to the nearest sec) of when terms were accepted
 * @param estimatedMonthlySpend If Ongoing (perpetual) order line, the estimated monthly spend
 */
data class SSIOCreateInsertionOrderRequest(

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @Schema(example = "2020-12-20", required = true, description = "Starting date of time period. Format: YYYY-MM-DD")
    @get:JsonProperty("start_date", required = true) val startDate: kotlin.String,

    @Schema(example = "null", required = true, description = "The po number")
    @get:JsonProperty("po_number", required = true) val poNumber: kotlin.String,

    @Schema(example = "null", required = true, description = "The billing contact first name")
    @get:JsonProperty("billing_contact_firstname", required = true) val billingContactFirstname: kotlin.String,

    @Schema(example = "null", required = true, description = "The billing contact last name")
    @get:JsonProperty("billing_contact_lastname", required = true) val billingContactLastname: kotlin.String,

    @Schema(example = "test@example", required = true, description = "The billing contact email")
    @get:JsonProperty("billing_contact_email", required = true) val billingContactEmail: kotlin.String,

    @Schema(example = "null", required = true, description = "The media contact first name")
    @get:JsonProperty("media_contact_firstname", required = true) val mediaContactFirstname: kotlin.String,

    @Schema(example = "null", required = true, description = "The media contact last name")
    @get:JsonProperty("media_contact_lastname", required = true) val mediaContactLastname: kotlin.String,

    @Schema(example = "test@example", required = true, description = "The media contact email")
    @get:JsonProperty("media_contact_email", required = true) val mediaContactEmail: kotlin.String,

    @Schema(example = "null", required = true, description = "The pmp id")
    @get:JsonProperty("pmp_id", required = true) val pmpId: kotlin.String,

    @Schema(example = "null", required = true, description = "The order name")
    @get:JsonProperty("order_name", required = true) val orderName: kotlin.String,

    @Schema(example = "null", required = true, description = "Type can be Budget or Perpetual")
    @get:JsonProperty("order_line_type", required = true) val orderLineType: SSIOCreateInsertionOrderRequest.OrderLineType,

    @Schema(example = "null", required = true, description = "The SFDC id for the terms")
    @get:JsonProperty("accepted_terms_id", required = true) val acceptedTermsId: kotlin.String,

    @Schema(example = "null", required = true, description = "The bill-to company id")
    @get:JsonProperty("billto_company_id", required = true) val billtoCompanyId: kotlin.String,

    @Schema(example = "null", required = true, description = "The bill-to business address id")
    @get:JsonProperty("billto_business_address_id", required = true) val billtoBusinessAddressId: kotlin.String,

    @Schema(example = "null", required = true, description = "The bill-to billing address id")
    @get:JsonProperty("billto_billing_address_id", required = true) val billtoBillingAddressId: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("currency_info", required = true) val currencyInfo: Currency,

    @get:Pattern(regexp="^(\\d{4})-(\\d{2})-(\\d{2})$")
    @Schema(example = "2020-12-20", description = "End date of time period. Format: YYYY-MM-DD")
    @get:JsonProperty("end_date") val endDate: kotlin.String? = null,

    @Schema(example = "5000000", description = "If Budget order line, the budget amount.")
    @get:JsonProperty("budget_amount") val budgetAmount: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "URL link for agency")
    @get:JsonProperty("agency_link") val agencyLink: kotlin.String? = null,

    @Schema(example = "test@example", description = "The email of user submitting the insertion order")
    @get:JsonProperty("user_email") val userEmail: kotlin.String? = null,

    @Schema(example = "null", description = "The UTC timestamp (to the nearest sec) of when terms were accepted")
    @get:JsonProperty("accepted_terms_time") val acceptedTermsTime: kotlin.Int? = null,

    @Schema(example = "null", description = "If Ongoing (perpetual) order line, the estimated monthly spend")
    @get:JsonProperty("estimated_monthly_spend") val estimatedMonthlySpend: java.math.BigDecimal? = null
) {

    /**
    * Type can be Budget or Perpetual
    * Values: BUDGET,PERPETUALS
    */
    enum class OrderLineType(val value: kotlin.String) {

        @JsonProperty("BUDGET") BUDGET("BUDGET"),
        @JsonProperty("PERPETUALS") PERPETUALS("PERPETUALS")
    }

}

