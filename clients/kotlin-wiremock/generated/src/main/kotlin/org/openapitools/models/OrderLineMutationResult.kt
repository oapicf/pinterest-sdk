@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class OrderLineMutationResult(
    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<OrderLineMutationError>? = null,

    @field:JsonProperty("order_line")
    val orderLine: kotlin.collections.List<OrderLine>? = null,

)
