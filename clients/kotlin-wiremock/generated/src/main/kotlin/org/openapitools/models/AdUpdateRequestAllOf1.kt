@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdUpdateRequestAllOf1(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("pin_id")
    val pinId: kotlin.String? = null,

)
