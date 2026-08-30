@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsUpdatableHotelAttributes(
    @field:JsonProperty("address")
    val address: CatalogsHotelAddress? = null,

    @field:JsonProperty("base_price")
    val basePrice: kotlin.String? = null,

    @field:JsonProperty("brand")
    val brand: kotlin.String? = null,

    @field:JsonProperty("category")
    val category: kotlin.String? = null,

    @field:JsonProperty("custom_label_0")
    val customLabel0: kotlin.String? = null,

    @field:JsonProperty("custom_label_1")
    val customLabel1: kotlin.String? = null,

    @field:JsonProperty("custom_label_2")
    val customLabel2: kotlin.String? = null,

    @field:JsonProperty("custom_label_3")
    val customLabel3: kotlin.String? = null,

    @field:JsonProperty("custom_label_4")
    val customLabel4: kotlin.String? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("guest_ratings")
    val guestRatings: CatalogsHotelGuestRatings? = null,

    @field:JsonProperty("latitude")
    val latitude: java.math.BigDecimal? = null,

    @field:JsonProperty("link")
    val link: kotlin.String? = null,

    @field:JsonProperty("longitude")
    val longitude: java.math.BigDecimal? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("neighborhood")
    val neighborhood: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("sale_price")
    val salePrice: kotlin.String? = null,

)
