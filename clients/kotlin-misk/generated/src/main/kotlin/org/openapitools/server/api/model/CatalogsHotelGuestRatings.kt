package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelGuestRatings(
    /** Max value for the hotel rating score. */
    val maxScore: java.math.BigDecimal? = null,
    /** Total number of people who have rated this hotel. */
    val numberOfReviewers: kotlin.Int? = null,
    /** System you use for guest reviews. */
    val ratingSystem: kotlin.String? = null,
    /** Your hotel&#39;s rating. */
    val score: java.math.BigDecimal? = null
)
