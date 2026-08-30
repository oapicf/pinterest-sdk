package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelFeedsCreateRequest._

case class CatalogsHotelFeedsCreateRequest (
  /* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. */
  catalogId: Option[String],
catalogType: CatalogType,
credentials: Option[CatalogsFeedCredentials],
defaultCurrency: Option[NullableCurrency],
defaultLocale: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale,
format: CatalogsFormat,
/* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
  location: String,
/* A human-friendly name associated to a given feed. */
  name: String,
preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
status: Option[CatalogsStatus])

object CatalogsHotelFeedsCreateRequest {
  import DateTimeCodecs._
  sealed trait CatalogType
  case object HOTEL extends CatalogType

  object CatalogType {
    def toCatalogType(s: String): Option[CatalogType] = s match {
      case "HOTEL" => Some(HOTEL)
      case _ => None
    }

    def fromCatalogType(x: CatalogType): String = x match {
      case HOTEL => "HOTEL"
    }
  }

  implicit val CatalogTypeEnumEncoder: EncodeJson[CatalogType] =
    EncodeJson[CatalogType](is => StringEncodeJson(CatalogType.fromCatalogType(is)))

  implicit val CatalogTypeEnumDecoder: DecodeJson[CatalogType] =
    DecodeJson.optionDecoder[CatalogType](n => n.string.flatMap(jStr => CatalogType.toCatalogType(jStr)), "CatalogType failed to de-serialize")

  implicit val CatalogsHotelFeedsCreateRequestCodecJson: CodecJson[CatalogsHotelFeedsCreateRequest] = CodecJson.derive[CatalogsHotelFeedsCreateRequest]
  implicit val CatalogsHotelFeedsCreateRequestDecoder: EntityDecoder[CatalogsHotelFeedsCreateRequest] = jsonOf[CatalogsHotelFeedsCreateRequest]
  implicit val CatalogsHotelFeedsCreateRequestEncoder: EntityEncoder[CatalogsHotelFeedsCreateRequest] = jsonEncoderOf[CatalogsHotelFeedsCreateRequest]
}
