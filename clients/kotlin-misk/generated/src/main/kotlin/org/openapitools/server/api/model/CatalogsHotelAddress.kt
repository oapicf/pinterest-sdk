package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelAddress(
    /** Primary street address of hotel. */
    val addr1: kotlin.String? = null,
    /** City where the hotel is located. */
    val city: kotlin.String? = null,
    /** Country where the hotel is located. */
    val country: kotlin.String? = null,
    /** Required for countries with a postal code system. Postal or zip code of the hotel. */
    val postalCode: kotlin.String? = null,
    /** State, county, province, where the hotel is located. */
    val region: kotlin.String? = null
)
