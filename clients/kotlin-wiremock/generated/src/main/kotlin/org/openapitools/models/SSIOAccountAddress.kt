@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SSIOAccountAddress(
    @field:JsonProperty("address_id")
    val addressId: kotlin.String? = null,

    @field:JsonProperty("display")
    val display: kotlin.String? = null,

    @field:JsonProperty("order_legal_entity")
    val orderLegalEntity: kotlin.String? = null,

    @field:JsonProperty("purpose")
    val purpose: kotlin.String? = null,

)
