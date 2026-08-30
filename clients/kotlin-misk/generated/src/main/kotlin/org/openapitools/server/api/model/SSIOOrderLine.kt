package org.openapitools.server.api.model

import org.openapitools.server.api.model.Currency
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SSIOOrderLine(
    /** The SFDC id for the terms */
    val acceptedTermsId: kotlin.String? = null,
    /** The UTC timestamp (to the nearest second) when terms were accepted. */
    val acceptedTermsTime: kotlin.String? = null,
    /** Ads manager order line id */
    val adsManagerOrderLineId: kotlin.String? = null,
    /** Agency link */
    val agencyLink: kotlin.String? = null,
    /** Bill-to company name */
    val billToCompanyName: kotlin.String? = null,
    /** Billing contact email */
    val billingContactEmail: kotlin.String? = null,
    /** Billing contact first name */
    val billingContactFirstname: kotlin.String? = null,
    /** Billing contact last name */
    val billingContactLastname: kotlin.String? = null,
    /** If budget order line, the budget amount. */
    val budgetAmount: java.math.BigDecimal? = null,
    val currencyInfo: Currency? = null,
    /** End date of the order line. */
    val endDate: java.time.LocalDate? = null,
    /** If ongoing (perpetual) order line, the estimated monthly spend. */
    val estimatedMonthlySpend: java.math.BigDecimal? = null,
    /** Last modified date. */
    val lastModifiedDateTime: kotlin.String? = null,
    /** Billing media email */
    val mediaContactEmail: kotlin.String? = null,
    /** Billing media contact first name */
    val mediaContactFirstname: kotlin.String? = null,
    /** Billing media contact last name */
    val mediaContactLastname: kotlin.String? = null,
    /** The order name */
    val orderName: kotlin.String? = null,
    /** The pin order id associated with the order line in SFDC */
    val pinOrderId: kotlin.String? = null,
    /** The Pinterest marketing partner name */
    val pmpName: kotlin.String? = null,
    /** The PO number */
    val poNumber: kotlin.String? = null,
    /** Order line id in SFDC */
    val salesforceOrderLineId: kotlin.String? = null,
    /** Start date of the order line. */
    val startDate: java.time.LocalDate? = null
)
