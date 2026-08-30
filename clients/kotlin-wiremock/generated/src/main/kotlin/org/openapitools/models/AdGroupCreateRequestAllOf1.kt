@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdGroupCreateRequestAllOf1(
    @field:JsonProperty("auto_targeting_enabled")
    val autoTargetingEnabled: kotlin.Boolean? = null,

    @field:JsonProperty("bid_multiplier")
    val bidMultiplier: java.math.BigDecimal? = null,

    @field:JsonProperty("budget_type")
    val budgetType: BudgetType? = null,

    @field:JsonProperty("pacing_delivery_type")
    val pacingDeliveryType: PacingDeliveryType? = null,

)
