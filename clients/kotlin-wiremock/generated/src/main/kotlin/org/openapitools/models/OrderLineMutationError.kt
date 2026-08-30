@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderLineMutationError(
    @field:JsonProperty("data")
    val `data`: OrderLine? = null,

    @field:JsonProperty("error_messages")
    val errorMessages: kotlin.collections.List<kotlin.String>? = null,

)
