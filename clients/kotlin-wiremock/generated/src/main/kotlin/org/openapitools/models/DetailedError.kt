@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DetailedError(
    @field:JsonProperty("code")
    val code: kotlin.Int,

    @field:JsonProperty("details")
    val details: kotlin.Any,

    @field:JsonProperty("message")
    val message: kotlin.String,

)
