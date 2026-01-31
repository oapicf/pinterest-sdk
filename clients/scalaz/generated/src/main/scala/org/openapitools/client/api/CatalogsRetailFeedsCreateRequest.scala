package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailFeedsCreateRequest._

case class CatalogsRetailFeedsCreateRequest (
  /* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. Currently, this field has no effect. */
  catalogId: Option[String],
catalogType: CatalogsType,
credentials: Option[CatalogsFeedCredentials],
defaultAvailability: Option[ProductAvailabilityType],
defaultCountry: Country,
defaultCurrency: Option[NullableCurrency],
defaultLocale: CatalogsFeedsCreateRequestDefaultLocale,
format: CatalogsFormat,
/* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
  location: String,
/* A human-friendly name associated to a given feed. */
  name: String,
preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
status: Option[CatalogsStatus])

object CatalogsRetailFeedsCreateRequest {
  import DateTimeCodecs._

  implicit val CatalogsRetailFeedsCreateRequestCodecJson: CodecJson[CatalogsRetailFeedsCreateRequest] = CodecJson.derive[CatalogsRetailFeedsCreateRequest]
  implicit val CatalogsRetailFeedsCreateRequestDecoder: EntityDecoder[CatalogsRetailFeedsCreateRequest] = jsonOf[CatalogsRetailFeedsCreateRequest]
  implicit val CatalogsRetailFeedsCreateRequestEncoder: EntityEncoder[CatalogsRetailFeedsCreateRequest] = jsonEncoderOf[CatalogsRetailFeedsCreateRequest]
}
