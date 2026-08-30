@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdAccount(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("country")
    val country: Country? = null,

    @field:JsonProperty("created_time")
    val createdTime: kotlin.Int? = null,

    @field:JsonProperty("currency")
    val currency: Currency? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("owner")
    val owner: AdAccountOwner? = null,

    @field:JsonProperty("permissions")
    val permissions: kotlin.collections.List<BusinessAccessRole>? = null,

    @field:JsonProperty("time_zone")
    val timeZone: kotlin.String? = null,

    @field:JsonProperty("updated_time")
    val updatedTime: kotlin.Int? = null,

)
