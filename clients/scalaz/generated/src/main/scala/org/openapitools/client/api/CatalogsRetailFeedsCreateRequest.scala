package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailFeedsCreateRequest._

case class CatalogsRetailFeedsCreateRequest (
  defaultCurrency: Option[NullableCurrency],
/* A human-friendly name associated to a given feed. */
  name: String,
format: CatalogsFormat,
defaultLocale: CatalogsFeedsCreateRequestDefaultLocale,
credentials: Option[CatalogsFeedCredentials],
/* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
  location: String,
preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
catalogType: CatalogsType,
defaultCountry: Country,
defaultAvailability: Option[ProductAvailabilityType])

object CatalogsRetailFeedsCreateRequest {
  import DateTimeCodecs._

  implicit val CatalogsRetailFeedsCreateRequestCodecJson: CodecJson[CatalogsRetailFeedsCreateRequest] = CodecJson.derive[CatalogsRetailFeedsCreateRequest]
  implicit val CatalogsRetailFeedsCreateRequestDecoder: EntityDecoder[CatalogsRetailFeedsCreateRequest] = jsonOf[CatalogsRetailFeedsCreateRequest]
  implicit val CatalogsRetailFeedsCreateRequestEncoder: EntityEncoder[CatalogsRetailFeedsCreateRequest] = jsonEncoderOf[CatalogsRetailFeedsCreateRequest]
}
