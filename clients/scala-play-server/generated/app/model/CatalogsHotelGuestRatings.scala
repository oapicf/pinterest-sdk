package model

import play.api.libs.json._

/**
  * If specified, you must provide all properties
  * @param maxScore Max value for the hotel rating score.
  * @param numberOfReviewers Total number of people who have rated this hotel.
  * @param ratingSystem System you use for guest reviews.
  * @param score Your hotel's rating.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CatalogsHotelGuestRatings(
  maxScore: Option[BigDecimal],
  numberOfReviewers: Option[Int],
  ratingSystem: Option[String],
  score: Option[BigDecimal]
)

object CatalogsHotelGuestRatings {
  implicit lazy val catalogsHotelGuestRatingsJsonFormat: Format[CatalogsHotelGuestRatings] = Json.format[CatalogsHotelGuestRatings]
}

