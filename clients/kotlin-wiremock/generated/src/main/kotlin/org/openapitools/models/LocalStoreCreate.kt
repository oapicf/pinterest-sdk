@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocalStoreCreate(
    @field:JsonProperty("country")
    val country: Country,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("store_code")
    val storeCode: kotlin.String,

    @field:JsonProperty("address_primary")
    val addressPrimary: kotlin.String? = null,

    @field:JsonProperty("address_secondary")
    val addressSecondary: kotlin.String? = null,

    @field:JsonProperty("city")
    val city: kotlin.String? = null,

    @field:JsonProperty("latitude")
    val latitude: kotlin.Float? = null,

    @field:JsonProperty("longitude")
    val longitude: kotlin.Float? = null,

    @field:JsonProperty("postal_code")
    val postalCode: kotlin.String? = null,

    @field:JsonProperty("region")
    val region: kotlin.String? = null,

)
