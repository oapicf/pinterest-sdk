@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdsCreditRedeem(
    @field:JsonProperty("errorCode")
    val errorCode: kotlin.Int? = null,

    @field:JsonProperty("errorMessage")
    val errorMessage: kotlin.String? = null,

    @field:JsonProperty("success")
    val success: kotlin.Boolean? = null,

)
