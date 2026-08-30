package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailFeedsCreateRequest._

case class CatalogsRetailFeedsCreateRequest (
  /* Catalog id pertaining to the feed. If not provided, feed will use a default catalog based on type. */
  catalogId: Option[String],
catalogType: CatalogType,
credentials: Option[CatalogsFeedCredentials],
defaultAvailability: Option[ProductAvailabilityType],
defaultCountry: Country,
defaultCurrency: Option[NullableCurrency],
defaultLocale: CatalogsCreativeAssetsFeedsCreateRequestDefaultLocale,
format: CatalogsFormat,
/* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
  location: String,
/* A human-friendly name associated to a given feed. */
  name: String,
preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
status: Option[CatalogsStatus])

object CatalogsRetailFeedsCreateRequest {
  import DateTimeCodecs._
  sealed trait CatalogType
  case object RETAIL extends CatalogType

  object CatalogType {
    def toCatalogType(s: String): Option[CatalogType] = s match {
      case "RETAIL" => Some(RETAIL)
      case _ => None
    }

    def fromCatalogType(x: CatalogType): String = x match {
      case RETAIL => "RETAIL"
    }
  }

  implicit val CatalogTypeEnumEncoder: EncodeJson[CatalogType] =
    EncodeJson[CatalogType](is => StringEncodeJson(CatalogType.fromCatalogType(is)))

  implicit val CatalogTypeEnumDecoder: DecodeJson[CatalogType] =
    DecodeJson.optionDecoder[CatalogType](n => n.string.flatMap(jStr => CatalogType.toCatalogType(jStr)), "CatalogType failed to de-serialize")

  implicit val CatalogsRetailFeedsCreateRequestCodecJson: CodecJson[CatalogsRetailFeedsCreateRequest] = CodecJson.derive[CatalogsRetailFeedsCreateRequest]
  implicit val CatalogsRetailFeedsCreateRequestDecoder: EntityDecoder[CatalogsRetailFeedsCreateRequest] = jsonOf[CatalogsRetailFeedsCreateRequest]
  implicit val CatalogsRetailFeedsCreateRequestEncoder: EntityEncoder[CatalogsRetailFeedsCreateRequest] = jsonEncoderOf[CatalogsRetailFeedsCreateRequest]
}
