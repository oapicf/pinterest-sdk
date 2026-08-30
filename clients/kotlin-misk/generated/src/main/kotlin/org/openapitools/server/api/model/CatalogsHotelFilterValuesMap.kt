package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelFilterValuesMap(
    val brand: kotlin.collections.List<kotlin.String>? = null,
    val customLabel0: kotlin.collections.List<kotlin.String>? = null,
    val customLabel1: kotlin.collections.List<kotlin.String>? = null,
    val customLabel2: kotlin.collections.List<kotlin.String>? = null,
    val customLabel3: kotlin.collections.List<kotlin.String>? = null,
    val customLabel4: kotlin.collections.List<kotlin.String>? = null
)
