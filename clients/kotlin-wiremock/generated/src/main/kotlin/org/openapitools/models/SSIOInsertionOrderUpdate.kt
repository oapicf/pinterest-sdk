@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SSIOInsertionOrderUpdate(
    @field:JsonProperty("ads_manager_order_line_id")
    val adsManagerOrderLineId: kotlin.String? = null,

    @field:JsonProperty("agency_link")
    val agencyLink: kotlin.String? = null,

    @field:JsonProperty("billing_contact_email")
    val billingContactEmail: kotlin.String? = null,

    @field:JsonProperty("billing_contact_firstname")
    val billingContactFirstname: kotlin.String? = null,

    @field:JsonProperty("billing_contact_lastname")
    val billingContactLastname: kotlin.String? = null,

    @field:JsonProperty("budget_amount")
    val budgetAmount: kotlin.Double? = null,

    @field:JsonProperty("end_date")
    val endDate: kotlin.String? = null,

    @field:JsonProperty("media_contact_email")
    val mediaContactEmail: kotlin.String? = null,

    @field:JsonProperty("media_contact_firstname")
    val mediaContactFirstname: kotlin.String? = null,

    @field:JsonProperty("media_contact_lastname")
    val mediaContactLastname: kotlin.String? = null,

    @field:JsonProperty("oracle_line_id")
    val oracleLineId: kotlin.String? = null,

    @field:JsonProperty("po_number")
    val poNumber: kotlin.String? = null,

    @field:JsonProperty("salesforce_order_id")
    val salesforceOrderId: kotlin.String? = null,

    @field:JsonProperty("salesforce_order_line_id")
    val salesforceOrderLineId: kotlin.String? = null,

    @field:JsonProperty("start_date")
    val startDate: kotlin.String? = null,

    @field:JsonProperty("user_email")
    val userEmail: kotlin.String? = null,

)
