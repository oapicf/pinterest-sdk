package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * If specified, you must provide all properties
 * @param maxUnderscorescore Max value for the hotel rating score.
 * @param numberUnderscoreofUnderscorereviewers Total number of people who have rated this hotel.
 * @param ratingUnderscoresystem System you use for guest reviews.
 * @param score Your hotel's rating.
 */
case class CatalogsHotelGuestRatings(maxUnderscorescore: Option[BigDecimal],
                numberUnderscoreofUnderscorereviewers: Option[Int],
                ratingUnderscoresystem: Option[String],
                score: Option[BigDecimal]
                )

object CatalogsHotelGuestRatings {
    /**
     * Creates the codec for converting CatalogsHotelGuestRatings from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelGuestRatings] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelGuestRatings] = deriveEncoder
}
