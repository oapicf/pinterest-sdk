@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BillingProfilesResponse(
    @field:JsonProperty("advertiser_id")
    val advertiserId: kotlin.String? = null,

    @field:JsonProperty("billing_type")
    val billingType: BillingType? = null,

    @field:JsonProperty("card_type")
    val cardType: BillingProfileCardType? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("payment_method_brand")
    val paymentMethodBrand: BillingProfilePaymentMethodBrand? = null,

    @field:JsonProperty("status")
    val status: BillingProfileStatus? = null,

)
