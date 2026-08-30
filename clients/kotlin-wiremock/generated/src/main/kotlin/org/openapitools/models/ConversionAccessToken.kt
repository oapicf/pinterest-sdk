@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class ConversionAccessToken(
    @field:JsonProperty("access_token")
    val accessToken: kotlin.String,

    @field:JsonProperty("token_type")
    val tokenType: kotlin.String? = "conversion",

)
