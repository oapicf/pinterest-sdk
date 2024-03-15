package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedIngestionWarnings._

case class CatalogsFeedIngestionWarnings (
  /* We experienced a technical difficulty and were unable to download some additional images. The next download attempt will happen in 24 hours. */
  ADDITIONAL_IMAGE_LEVEL_INTERNAL_ERROR: Option[Integer],
/* Additional image files are unreadable. Please upload new files to continue. */
  ADDITIONAL_IMAGE_FILE_NOT_ACCESSIBLE: Option[Integer],
/* Additional image files are unreadable. Please check your link and upload new files to continue. */
  ADDITIONAL_IMAGE_MALFORMED_URL: Option[Integer],
/* Additional image files are unreadable. Please upload new files to continue. */
  ADDITIONAL_IMAGE_FILE_NOT_FOUND: Option[Integer],
/* Additional image files are unreadable. Please upload new files to continue. */
  ADDITIONAL_IMAGE_INVALID_FILE: Option[Integer],
/* price is not a supported column. Use base_price and sale_price instead. */
  HOTEL_PRICE_HEADER_IS_PRESENT: Option[Integer])

object CatalogsFeedIngestionWarnings {
  import DateTimeCodecs._

  implicit val CatalogsFeedIngestionWarningsCodecJson: CodecJson[CatalogsFeedIngestionWarnings] = CodecJson.derive[CatalogsFeedIngestionWarnings]
  implicit val CatalogsFeedIngestionWarningsDecoder: EntityDecoder[CatalogsFeedIngestionWarnings] = jsonOf[CatalogsFeedIngestionWarnings]
  implicit val CatalogsFeedIngestionWarningsEncoder: EntityEncoder[CatalogsFeedIngestionWarnings] = jsonEncoderOf[CatalogsFeedIngestionWarnings]
}
