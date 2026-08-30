@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsHotelAddress(
    @field:JsonProperty("addr1")
    val addr1: kotlin.String? = null,

    @field:JsonProperty("city")
    val city: kotlin.String? = null,

    @field:JsonProperty("country")
    val country: kotlin.String? = null,

    @field:JsonProperty("postal_code")
    val postalCode: kotlin.String? = null,

    @field:JsonProperty("region")
    val region: kotlin.String? = null,

)
