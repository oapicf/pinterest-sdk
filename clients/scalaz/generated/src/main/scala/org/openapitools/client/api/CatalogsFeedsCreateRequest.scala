package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedsCreateRequest._

case class CatalogsFeedsCreateRequest (
  defaultCurrency: Option[NullableCurrency],
/* A human-friendly name associated to a given feed. */
  name: String,
format: CatalogsFormat,
defaultLocale: Option[CatalogsFeedsCreateRequestDefaultLocale],
credentials: Option[CatalogsFeedCredentials],
/* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
  location: String,
preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
defaultCountry: Option[Country],
defaultAvailability: Option[ProductAvailabilityType])

object CatalogsFeedsCreateRequest {
  import DateTimeCodecs._

  implicit val CatalogsFeedsCreateRequestCodecJson: CodecJson[CatalogsFeedsCreateRequest] = CodecJson.derive[CatalogsFeedsCreateRequest]
  implicit val CatalogsFeedsCreateRequestDecoder: EntityDecoder[CatalogsFeedsCreateRequest] = jsonOf[CatalogsFeedsCreateRequest]
  implicit val CatalogsFeedsCreateRequestEncoder: EntityEncoder[CatalogsFeedsCreateRequest] = jsonEncoderOf[CatalogsFeedsCreateRequest]
}
