package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelFeedsCreateRequest._

case class CatalogsHotelFeedsCreateRequest (
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
/* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple hotel feeds but this will change in the future. */
  catalogId: Option[String])

object CatalogsHotelFeedsCreateRequest {
  import DateTimeCodecs._

  implicit val CatalogsHotelFeedsCreateRequestCodecJson: CodecJson[CatalogsHotelFeedsCreateRequest] = CodecJson.derive[CatalogsHotelFeedsCreateRequest]
  implicit val CatalogsHotelFeedsCreateRequestDecoder: EntityDecoder[CatalogsHotelFeedsCreateRequest] = jsonOf[CatalogsHotelFeedsCreateRequest]
  implicit val CatalogsHotelFeedsCreateRequestEncoder: EntityEncoder[CatalogsHotelFeedsCreateRequest] = jsonEncoderOf[CatalogsHotelFeedsCreateRequest]
}
