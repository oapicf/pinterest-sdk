@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class PinterestLibError(
    @field:JsonProperty("code")
    val code: kotlin.Int,

    @field:JsonProperty("message")
    val message: kotlin.String,

)
