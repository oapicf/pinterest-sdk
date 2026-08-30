package org.openapitools.server.api.model

import org.openapitools.server.api.model.Currency
import org.openapitools.server.api.model.SSIOOrderLineType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SSIOInsertionOrderCreate(
    /** The SFDC id for the terms */
    val acceptedTermsId: kotlin.String,
    /** The billing contact email */
    val billingContactEmail: kotlin.String,
    /** The billing contact first name */
    val billingContactFirstname: kotlin.String,
    /** The billing contact last name */
    val billingContactLastname: kotlin.String,
    /** The bill-to billing address id */
    val billtoBillingAddressId: kotlin.String,
    /** The bill-to business address id */
    val billtoBusinessAddressId: kotlin.String,
    /** The bill-to company id */
    val billtoCompanyId: kotlin.String,
    val currencyInfo: Currency,
    /** The media contact email */
    val mediaContactEmail: kotlin.String,
    /** The media contact first name */
    val mediaContactFirstname: kotlin.String,
    /** The media contact last name */
    val mediaContactLastname: kotlin.String,
    /** Type can be Budget or Perpetual */
    val orderLineType: SSIOOrderLineType,
    /** The order name */
    val orderName: kotlin.String,
    /** The pmp id */
    val pmpId: kotlin.String,
    /** The po number */
    val poNumber: kotlin.String,
    /** Starting date of time period. Format: YYYY-MM-DD */
    val startDate: kotlin.String,
    /** The UTC timestamp (to the nearest sec) of when terms were accepted */
    val acceptedTermsTime: kotlin.Int? = null,
    /** URL link for agency */
    val agencyLink: kotlin.String? = null,
    /** If Budget order line, the budget amount. */
    val budgetAmount: kotlin.Double? = null,
    /** End date of time period. Format: YYYY-MM-DD */
    val endDate: kotlin.String? = null,
    /** If Ongoing (perpetual) order line, the estimated monthly spend */
    val estimatedMonthlySpend: kotlin.Double? = null,
    /** The email of user submitting the insertion order */
    val userEmail: kotlin.String? = null
)
