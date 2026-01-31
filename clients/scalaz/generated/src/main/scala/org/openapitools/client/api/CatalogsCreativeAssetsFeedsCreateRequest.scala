package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsCreativeAssetsFeedsCreateRequest._

case class CatalogsCreativeAssetsFeedsCreateRequest (
  /* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. At the moment a catalog can not have multiple creative assets feeds but this will change in the future. */
  catalogId: Option[String],
catalogType: CatalogsType,
credentials: Option[CatalogsFeedCredentials],
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

object CatalogsCreativeAssetsFeedsCreateRequest {
  import DateTimeCodecs._

  implicit val CatalogsCreativeAssetsFeedsCreateRequestCodecJson: CodecJson[CatalogsCreativeAssetsFeedsCreateRequest] = CodecJson.derive[CatalogsCreativeAssetsFeedsCreateRequest]
  implicit val CatalogsCreativeAssetsFeedsCreateRequestDecoder: EntityDecoder[CatalogsCreativeAssetsFeedsCreateRequest] = jsonOf[CatalogsCreativeAssetsFeedsCreateRequest]
  implicit val CatalogsCreativeAssetsFeedsCreateRequestEncoder: EntityEncoder[CatalogsCreativeAssetsFeedsCreateRequest] = jsonEncoderOf[CatalogsCreativeAssetsFeedsCreateRequest]
}
