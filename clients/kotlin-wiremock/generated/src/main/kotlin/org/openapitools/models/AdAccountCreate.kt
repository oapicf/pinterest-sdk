@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdAccountCreate(
    @field:JsonProperty("country")
    val country: Country? = null,

    @field:JsonProperty("currency")
    val currency: Currency? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("owner_user_id")
    val ownerUserId: kotlin.String? = null,

    @field:JsonProperty("time_zone")
    val timeZone: kotlin.String? = null,

)
