@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PromotionsResponse(
    @field:JsonProperty("promotions")
    val promotions: kotlin.collections.List<PromotionArrayElement>? = null,

)
