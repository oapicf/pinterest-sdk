package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelGuestRatings._

case class CatalogsHotelGuestRatings (
  /* Max value for the hotel rating score. */
  maxScore: Option[BigDecimal],
/* Total number of people who have rated this hotel. */
  numberOfReviewers: Option[Integer],
/* System you use for guest reviews. */
  ratingSystem: Option[String],
/* Your hotel's rating. */
  score: Option[BigDecimal])

object CatalogsHotelGuestRatings {
  import DateTimeCodecs._

  implicit val CatalogsHotelGuestRatingsCodecJson: CodecJson[CatalogsHotelGuestRatings] = CodecJson.derive[CatalogsHotelGuestRatings]
  implicit val CatalogsHotelGuestRatingsDecoder: EntityDecoder[CatalogsHotelGuestRatings] = jsonOf[CatalogsHotelGuestRatings]
  implicit val CatalogsHotelGuestRatingsEncoder: EntityEncoder[CatalogsHotelGuestRatings] = jsonEncoderOf[CatalogsHotelGuestRatings]
}
