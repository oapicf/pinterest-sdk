@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdvancedAuctionOperationError(
    @field:JsonProperty("code")
    val code: kotlin.Int? = null,

    @field:JsonProperty("message")
    val message: kotlin.String? = null,

)
