@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ItemValidationEvent(
    @field:JsonProperty("attribute")
    val attribute: kotlin.String? = null,

    @field:JsonProperty("code")
    val code: kotlin.Int? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

)
