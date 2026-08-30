@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CartingRetailer(
    @field:JsonProperty("retailer_id")
    val retailerId: kotlin.String,

    @field:JsonProperty("retailer_name")
    val retailerName: kotlin.String,

)
