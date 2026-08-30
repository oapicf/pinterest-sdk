@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ProductGroupPromotionResponseItem(
    @field:JsonProperty("data")
    val `data`: ProductGroupPromotion? = null,

    @field:JsonProperty("exceptions")
    val exceptions: kotlin.collections.List<Exception>? = null,

)
