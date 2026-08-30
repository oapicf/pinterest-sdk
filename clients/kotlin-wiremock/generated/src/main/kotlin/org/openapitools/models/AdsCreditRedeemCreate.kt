@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdsCreditRedeemCreate(
    @field:JsonProperty("offerCodeHash")
    val offerCodeHash: kotlin.String,

    @field:JsonProperty("validateOnly")
    val validateOnly: kotlin.Boolean,

)
