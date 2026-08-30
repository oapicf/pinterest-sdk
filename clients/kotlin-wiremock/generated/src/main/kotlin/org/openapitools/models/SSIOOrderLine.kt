@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SSIOOrderLine(
    @field:JsonProperty("accepted_terms_id")
    val acceptedTermsId: kotlin.String? = null,

    @field:JsonProperty("accepted_terms_time")
    val acceptedTermsTime: kotlin.String? = null,

    @field:JsonProperty("ads_manager_order_line_id")
    val adsManagerOrderLineId: kotlin.String? = null,

    @field:JsonProperty("agency_link")
    val agencyLink: kotlin.String? = null,

    @field:JsonProperty("bill_to_company_name")
    val billToCompanyName: kotlin.String? = null,

    @field:JsonProperty("billing_contact_email")
    val billingContactEmail: kotlin.String? = null,

    @field:JsonProperty("billing_contact_firstname")
    val billingContactFirstname: kotlin.String? = null,

    @field:JsonProperty("billing_contact_lastname")
    val billingContactLastname: kotlin.String? = null,

    @field:JsonProperty("budget_amount")
    val budgetAmount: java.math.BigDecimal? = null,

    @field:JsonProperty("currency_info")
    val currencyInfo: Currency? = null,

    @field:JsonProperty("end_date")
    val endDate: java.time.LocalDate? = null,

    @field:JsonProperty("estimated_monthly_spend")
    val estimatedMonthlySpend: java.math.BigDecimal? = null,

    @field:JsonProperty("last_modified_date_time")
    val lastModifiedDateTime: kotlin.String? = null,

    @field:JsonProperty("media_contact_email")
    val mediaContactEmail: kotlin.String? = null,

    @field:JsonProperty("media_contact_firstname")
    val mediaContactFirstname: kotlin.String? = null,

    @field:JsonProperty("media_contact_lastname")
    val mediaContactLastname: kotlin.String? = null,

    @field:JsonProperty("order_name")
    val orderName: kotlin.String? = null,

    @field:JsonProperty("pin_order_id")
    val pinOrderId: kotlin.String? = null,

    @field:JsonProperty("pmp_name")
    val pmpName: kotlin.String? = null,

    @field:JsonProperty("po_number")
    val poNumber: kotlin.String? = null,

    @field:JsonProperty("salesforce_order_line_id")
    val salesforceOrderLineId: kotlin.String? = null,

    @field:JsonProperty("start_date")
    val startDate: java.time.LocalDate? = null,

)
