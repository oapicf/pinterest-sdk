@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class SSIOInsertionOrderStatus(
    @field:JsonProperty("creation_time")
    val creationTime: kotlin.String? = null,

    @field:JsonProperty("pin_order_id")
    val pinOrderId: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: kotlin.String? = null,

)
