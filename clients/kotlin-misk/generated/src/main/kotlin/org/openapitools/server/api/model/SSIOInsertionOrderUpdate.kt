package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SSIOInsertionOrderUpdate(
    /** Ads manager OrderLineId */
    val adsManagerOrderLineId: kotlin.String? = null,
    /** URL link for agency */
    val agencyLink: kotlin.String? = null,
    /** The billing contact email */
    val billingContactEmail: kotlin.String? = null,
    /** The billing contact first name */
    val billingContactFirstname: kotlin.String? = null,
    /** The billing contact last name */
    val billingContactLastname: kotlin.String? = null,
    /** If Budget order line, the budget amount. */
    val budgetAmount: kotlin.Double? = null,
    /** End date of time period. Format: YYYY-MM-DD */
    val endDate: kotlin.String? = null,
    /** The media contact email */
    val mediaContactEmail: kotlin.String? = null,
    /** The media contact first name */
    val mediaContactFirstname: kotlin.String? = null,
    /** The media contact last name */
    val mediaContactLastname: kotlin.String? = null,
    /** LineId in the Oracle DB */
    val oracleLineId: kotlin.String? = null,
    /** The po number */
    val poNumber: kotlin.String? = null,
    /** OrderId in SFDC */
    val salesforceOrderId: kotlin.String? = null,
    /** OrderLineId in SFDC */
    val salesforceOrderLineId: kotlin.String? = null,
    /** Starting date of time period. Format: YYYY-MM-DD */
    val startDate: kotlin.String? = null,
    /** The email of user submitting the insertion order */
    val userEmail: kotlin.String? = null
)
