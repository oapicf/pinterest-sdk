package org.openapitools.server.api.model

import org.openapitools.server.api.model.Currency
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PromotionTemplateValue(
    /** Numeric value. */
    val amount: java.math.BigDecimal? = null,
    val currencyCode: Currency? = null,
    /** Custom text. */
    val customText: kotlin.String? = null,
    /** Percent value. */
    val percent: java.math.BigDecimal? = null
)
