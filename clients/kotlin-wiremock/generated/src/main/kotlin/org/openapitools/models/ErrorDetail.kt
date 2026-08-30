@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ErrorDetail(
    @field:JsonProperty("count")
    val count: kotlin.Int,

    @field:JsonProperty("error_code")
    val errorCode: kotlin.Int,

    @field:JsonProperty("message")
    val message: kotlin.String,

)
