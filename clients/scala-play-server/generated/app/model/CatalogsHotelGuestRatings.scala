package model

import play.api.libs.json._

/**
  * If specified, you must provide all properties
  * @param score Your hotel's rating.
  * @param numberOfReviewers Total number of people who have rated this hotel.
  * @param maxScore Max value for the hotel rating score.
  * @param ratingSystem System you use for guest reviews.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CatalogsHotelGuestRatings(
  score: Option[BigDecimal],
  numberOfReviewers: Option[Int],
  maxScore: Option[BigDecimal],
  ratingSystem: Option[String]
)

object CatalogsHotelGuestRatings {
  implicit lazy val catalogsHotelGuestRatingsJsonFormat: Format[CatalogsHotelGuestRatings] = Json.format[CatalogsHotelGuestRatings]
}

