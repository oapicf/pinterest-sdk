/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package org.openapitools.client.models


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * If specified, you must provide all properties
 *
 * @param score Your hotel's rating.
 * @param numberOfReviewers Total number of people who have rated this hotel.
 * @param maxScore Max value for the hotel rating score.
 * @param ratingSystem System you use for guest reviews.
 */


data class CatalogsHotelGuestRatings (

    /* Your hotel's rating. */
    @Json(name = "score")
    val score: java.math.BigDecimal? = null,

    /* Total number of people who have rated this hotel. */
    @Json(name = "number_of_reviewers")
    val numberOfReviewers: kotlin.Int? = null,

    /* Max value for the hotel rating score. */
    @Json(name = "max_score")
    val maxScore: java.math.BigDecimal? = null,

    /* System you use for guest reviews. */
    @Json(name = "rating_system")
    val ratingSystem: kotlin.String? = null

)
