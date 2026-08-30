@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SSIOInsertionOrderCreate(
    @field:JsonProperty("accepted_terms_id")
    val acceptedTermsId: kotlin.String,

    @field:JsonProperty("billing_contact_email")
    val billingContactEmail: kotlin.String,

    @field:JsonProperty("billing_contact_firstname")
    val billingContactFirstname: kotlin.String,

    @field:JsonProperty("billing_contact_lastname")
    val billingContactLastname: kotlin.String,

    @field:JsonProperty("billto_billing_address_id")
    val billtoBillingAddressId: kotlin.String,

    @field:JsonProperty("billto_business_address_id")
    val billtoBusinessAddressId: kotlin.String,

    @field:JsonProperty("billto_company_id")
    val billtoCompanyId: kotlin.String,

    @field:JsonProperty("currency_info")
    val currencyInfo: Currency,

    @field:JsonProperty("media_contact_email")
    val mediaContactEmail: kotlin.String,

    @field:JsonProperty("media_contact_firstname")
    val mediaContactFirstname: kotlin.String,

    @field:JsonProperty("media_contact_lastname")
    val mediaContactLastname: kotlin.String,

    @field:JsonProperty("order_line_type")
    val orderLineType: SSIOOrderLineType,

    @field:JsonProperty("order_name")
    val orderName: kotlin.String,

    @field:JsonProperty("pmp_id")
    val pmpId: kotlin.String,

    @field:JsonProperty("po_number")
    val poNumber: kotlin.String,

    @field:JsonProperty("start_date")
    val startDate: kotlin.String,

    @field:JsonProperty("accepted_terms_time")
    val acceptedTermsTime: kotlin.Int? = null,

    @field:JsonProperty("agency_link")
    val agencyLink: kotlin.String? = null,

    @field:JsonProperty("budget_amount")
    val budgetAmount: kotlin.Double? = null,

    @field:JsonProperty("end_date")
    val endDate: kotlin.String? = null,

    @field:JsonProperty("estimated_monthly_spend")
    val estimatedMonthlySpend: kotlin.Double? = null,

    @field:JsonProperty("user_email")
    val userEmail: kotlin.String? = null,

)
