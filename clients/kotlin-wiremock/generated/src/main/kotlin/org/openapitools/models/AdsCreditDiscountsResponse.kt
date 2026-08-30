@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdsCreditDiscountsResponse(
    @field:JsonProperty("active")
    val active: kotlin.Boolean? = null,

    @field:JsonProperty("advertiser_id")
    val advertiserId: kotlin.String? = null,

    @field:JsonProperty("discountCurrency")
    val discountCurrency: kotlin.String? = null,

    @field:JsonProperty("discountInMicroCurrency")
    val discountInMicroCurrency: java.math.BigDecimal? = null,

    @field:JsonProperty("discountType")
    val discountType: AdsCreditDiscountType? = null,

    @field:JsonProperty("remainingDiscountInMicroCurrency")
    val remainingDiscountInMicroCurrency: java.math.BigDecimal? = null,

    @field:JsonProperty("title")
    val title: kotlin.String? = null,

)
