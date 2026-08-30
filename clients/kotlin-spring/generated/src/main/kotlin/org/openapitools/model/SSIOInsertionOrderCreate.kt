package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.Currency
import org.openapitools.model.SSIOOrderLineType
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
 * Resource create operation model.
 * @param acceptedTermsId The SFDC id for the terms
 * @param billingContactEmail The billing contact email
 * @param billingContactFirstname The billing contact first name
 * @param billingContactLastname The billing contact last name
 * @param billtoBillingAddressId The bill-to billing address id
 * @param billtoBusinessAddressId The bill-to business address id
 * @param billtoCompanyId The bill-to company id
 * @param currencyInfo 
 * @param mediaContactEmail The media contact email
 * @param mediaContactFirstname The media contact first name
 * @param mediaContactLastname The media contact last name
 * @param orderLineType Type can be Budget or Perpetual
 * @param orderName The order name
 * @param pmpId The pmp id
 * @param poNumber The po number
 * @param startDate Starting date of time period. Format: YYYY-MM-DD
 * @param acceptedTermsTime The UTC timestamp (to the nearest sec) of when terms were accepted
 * @param agencyLink URL link for agency
 * @param budgetAmount If Budget order line, the budget amount.
 * @param endDate End date of time period. Format: YYYY-MM-DD
 * @param estimatedMonthlySpend If Ongoing (perpetual) order line, the estimated monthly spend
 * @param userEmail The email of user submitting the insertion order
 */
data class SSIOInsertionOrderCreate(

    @Schema(required = true, description = "The SFDC id for the terms")
    @param:JsonProperty("accepted_terms_id")
    @get:JsonProperty("accepted_terms_id", required = true) val acceptedTermsId: kotlin.String,

    @Schema(required = true, description = "The billing contact email")
    @param:JsonProperty("billing_contact_email")
    @get:JsonProperty("billing_contact_email", required = true) val billingContactEmail: kotlin.String,

    @Schema(required = true, description = "The billing contact first name")
    @param:JsonProperty("billing_contact_firstname")
    @get:JsonProperty("billing_contact_firstname", required = true) val billingContactFirstname: kotlin.String,

    @Schema(required = true, description = "The billing contact last name")
    @param:JsonProperty("billing_contact_lastname")
    @get:JsonProperty("billing_contact_lastname", required = true) val billingContactLastname: kotlin.String,

    @Schema(required = true, description = "The bill-to billing address id")
    @param:JsonProperty("billto_billing_address_id")
    @get:JsonProperty("billto_billing_address_id", required = true) val billtoBillingAddressId: kotlin.String,

    @Schema(required = true, description = "The bill-to business address id")
    @param:JsonProperty("billto_business_address_id")
    @get:JsonProperty("billto_business_address_id", required = true) val billtoBusinessAddressId: kotlin.String,

    @Schema(required = true, description = "The bill-to company id")
    @param:JsonProperty("billto_company_id")
    @get:JsonProperty("billto_company_id", required = true) val billtoCompanyId: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("currency_info")
    @get:JsonProperty("currency_info", required = true) val currencyInfo: Currency,

    @Schema(required = true, description = "The media contact email")
    @param:JsonProperty("media_contact_email")
    @get:JsonProperty("media_contact_email", required = true) val mediaContactEmail: kotlin.String,

    @Schema(required = true, description = "The media contact first name")
    @param:JsonProperty("media_contact_firstname")
    @get:JsonProperty("media_contact_firstname", required = true) val mediaContactFirstname: kotlin.String,

    @Schema(required = true, description = "The media contact last name")
    @param:JsonProperty("media_contact_lastname")
    @get:JsonProperty("media_contact_lastname", required = true) val mediaContactLastname: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "Type can be Budget or Perpetual")
    @param:JsonProperty("order_line_type")
    @get:JsonProperty("order_line_type", required = true) val orderLineType: SSIOOrderLineType,

    @Schema(required = true, description = "The order name")
    @param:JsonProperty("order_name")
    @get:JsonProperty("order_name", required = true) val orderName: kotlin.String,

    @Schema(required = true, description = "The pmp id")
    @param:JsonProperty("pmp_id")
    @get:JsonProperty("pmp_id", required = true) val pmpId: kotlin.String,

    @Schema(required = true, description = "The po number")
    @param:JsonProperty("po_number")
    @get:JsonProperty("po_number", required = true) val poNumber: kotlin.String,

    @get:Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")
    @Schema(required = true, description = "Starting date of time period. Format: YYYY-MM-DD")
    @param:JsonProperty("start_date")
    @get:JsonProperty("start_date", required = true) val startDate: kotlin.String,

    @Schema(description = "The UTC timestamp (to the nearest sec) of when terms were accepted")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("accepted_terms_time")
    @get:JsonProperty("accepted_terms_time") val acceptedTermsTime: kotlin.Int? = null,

    @Schema(description = "URL link for agency")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("agency_link")
    @get:JsonProperty("agency_link") val agencyLink: kotlin.String? = null,

    @Schema(description = "If Budget order line, the budget amount.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("budget_amount")
    @get:JsonProperty("budget_amount") val budgetAmount: kotlin.Double? = null,

    @get:Pattern(regexp="^\\d{4}-\\d{2}-\\d{2}$")
    @Schema(description = "End date of time period. Format: YYYY-MM-DD")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("end_date")
    @get:JsonProperty("end_date") val endDate: kotlin.String? = null,

    @Schema(description = "If Ongoing (perpetual) order line, the estimated monthly spend")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("estimated_monthly_spend")
    @get:JsonProperty("estimated_monthly_spend") val estimatedMonthlySpend: kotlin.Double? = null,

    @Schema(description = "The email of user submitting the insertion order")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("user_email")
    @get:JsonProperty("user_email") val userEmail: kotlin.String? = null
) {

}

