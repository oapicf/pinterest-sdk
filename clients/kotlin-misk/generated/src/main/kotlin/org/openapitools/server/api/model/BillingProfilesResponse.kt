package org.openapitools.server.api.model

import org.openapitools.server.api.model.BillingProfileCardType
import org.openapitools.server.api.model.BillingProfilePaymentMethodBrand
import org.openapitools.server.api.model.BillingProfileStatus
import org.openapitools.server.api.model.BillingType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BillingProfilesResponse(
    /** Advertiser ID of the billing. */
    val advertiserId: kotlin.String? = null,
    /** Billing type of the advertiser */
    val billingType: BillingType? = null,
    /** Type of the card. */
    val cardType: BillingProfileCardType? = null,
    /** Billing ID. */
    val id: kotlin.String? = null,
    /** Brand of the payment method. */
    val paymentMethodBrand: BillingProfilePaymentMethodBrand? = null,
    /** Status of the billing. */
    val status: BillingProfileStatus? = null
)
