@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdAccountsCountry(
    @field:JsonProperty("code")
    val code: Country,

    @field:JsonProperty("currency")
    val currency: kotlin.String,

    @field:JsonProperty("index")
    val index: java.math.BigDecimal,

    @field:JsonProperty("name")
    val name: kotlin.String,

)
