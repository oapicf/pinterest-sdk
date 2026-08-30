@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PromotionTemplateValue(
    @field:JsonProperty("amount")
    val amount: java.math.BigDecimal? = null,

    @field:JsonProperty("currency_code")
    val currencyCode: Currency? = null,

    @field:JsonProperty("custom_text")
    val customText: kotlin.String? = null,

    @field:JsonProperty("percent")
    val percent: java.math.BigDecimal? = null,

)
