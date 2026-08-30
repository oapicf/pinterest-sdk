package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdsCreditDiscountType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdsCreditDiscountsResponse(
    /** True if the offer code is currently active. */
    val active: kotlin.Boolean? = null,
    /** Advertiser ID the offer was applied to. */
    val advertiserId: kotlin.String? = null,
    /** Currency value for the discount. */
    val discountCurrency: kotlin.String? = null,
    /** The discount applied in the offer&#39;s currency value. */
    val discountInMicroCurrency: java.math.BigDecimal? = null,
    /** The type of discount of this credit */
    val discountType: AdsCreditDiscountType? = null,
    /** The credits left to spend. */
    val remainingDiscountInMicroCurrency: java.math.BigDecimal? = null,
    /** Human readable title of the offer code. */
    val title: kotlin.String? = null
)
