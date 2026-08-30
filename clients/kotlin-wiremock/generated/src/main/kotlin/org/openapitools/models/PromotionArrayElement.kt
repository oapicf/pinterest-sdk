@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PromotionArrayElement(
    @field:JsonProperty("data")
    val `data`: Promotion? = null,

    @field:JsonProperty("exception")
    val exception: Exception? = null,

)
