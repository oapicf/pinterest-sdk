package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CarouselSlot(
    /** Carousel Pin slot description. */
    val description: kotlin.String? = null,
    /** Carousel Pin slot link. */
    val link: kotlin.String? = null,
    /** Carousel Pin slot title. */
    val title: kotlin.String? = null
)
