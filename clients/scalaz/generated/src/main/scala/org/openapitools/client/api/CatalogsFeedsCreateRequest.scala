package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedsCreateRequest._

case class CatalogsFeedsCreateRequest (
  defaultCountry: Option[Country],
defaultAvailability: Option[ProductAvailabilityType],
defaultCurrency: Option[NullableCurrency],
/* A human-friendly name associated to a given feed. */
  name: String,
format: CatalogsFormat,
/* The locale used within a feed for product descriptions. */
  defaultLocale: Option[String],
credentials: Option[CatalogsFeedCredentials],
/* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
  location: String,
preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule])

object CatalogsFeedsCreateRequest {
  import DateTimeCodecs._

  implicit val CatalogsFeedsCreateRequestCodecJson: CodecJson[CatalogsFeedsCreateRequest] = CodecJson.derive[CatalogsFeedsCreateRequest]
  implicit val CatalogsFeedsCreateRequestDecoder: EntityDecoder[CatalogsFeedsCreateRequest] = jsonOf[CatalogsFeedsCreateRequest]
  implicit val CatalogsFeedsCreateRequestEncoder: EntityEncoder[CatalogsFeedsCreateRequest] = jsonEncoderOf[CatalogsFeedsCreateRequest]
}
