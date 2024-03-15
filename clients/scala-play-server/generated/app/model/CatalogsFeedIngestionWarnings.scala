package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CatalogsFeedIngestionWarnings.
  * @param ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours.
  * @param ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE Additional image files are unreadable. Please upload new files to continue.
  * @param ADDITIONAL_IMAGE_MALFORMED_URL Additional image files are unreadable. Please check your link and upload new files to continue.
  * @param ADDITIONAL_IMAGE_FILE_NOT_FOUND Additional image files are unreadable. Please upload new files to continue.
  * @param ADDITIONAL_IMAGE_INVALID_FILE Additional image files are unreadable. Please upload new files to continue.
  * @param HOTEL_PRICE_HEADER_IS_PRESENT price is not a supported column. Use base_price and sale_price instead.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class CatalogsFeedIngestionWarnings(
  ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR: Option[Int],
  ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE: Option[Int],
  ADDITIONAL_IMAGE_MALFORMED_URL: Option[Int],
  ADDITIONAL_IMAGE_FILE_NOT_FOUND: Option[Int],
  ADDITIONAL_IMAGE_INVALID_FILE: Option[Int],
  HOTEL_PRICE_HEADER_IS_PRESENT: Option[Int]
)

object CatalogsFeedIngestionWarnings {
  implicit lazy val catalogsFeedIngestionWarningsJsonFormat: Format[CatalogsFeedIngestionWarnings] = Json.format[CatalogsFeedIngestionWarnings]
}

