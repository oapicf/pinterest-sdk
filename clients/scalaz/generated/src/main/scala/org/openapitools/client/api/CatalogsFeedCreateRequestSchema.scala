package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsFeedCreateRequestSchema._

case class CatalogsFeedCreateRequestSchema (
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

object CatalogsFeedCreateRequestSchema {
  import DateTimeCodecs._
  sealed trait CatalogType
  case object CREATIVEASSETS extends CatalogType

  object CatalogType {
    def toCatalogType(s: String): Option[CatalogType] = s match {
      case "CREATIVEASSETS" => Some(CREATIVEASSETS)
      case _ => None
    }

    def fromCatalogType(x: CatalogType): String = x match {
      case CREATIVEASSETS => "CREATIVEASSETS"
    }
  }

  implicit val CatalogTypeEnumEncoder: EncodeJson[CatalogType] =
    EncodeJson[CatalogType](is => StringEncodeJson(CatalogType.fromCatalogType(is)))

  implicit val CatalogTypeEnumDecoder: DecodeJson[CatalogType] =
    DecodeJson.optionDecoder[CatalogType](n => n.string.flatMap(jStr => CatalogType.toCatalogType(jStr)), "CatalogType failed to de-serialize")

  implicit val CatalogsFeedCreateRequestSchemaCodecJson: CodecJson[CatalogsFeedCreateRequestSchema] = CodecJson.derive[CatalogsFeedCreateRequestSchema]
  implicit val CatalogsFeedCreateRequestSchemaDecoder: EntityDecoder[CatalogsFeedCreateRequestSchema] = jsonOf[CatalogsFeedCreateRequestSchema]
  implicit val CatalogsFeedCreateRequestSchemaEncoder: EntityEncoder[CatalogsFeedCreateRequestSchema] = jsonEncoderOf[CatalogsFeedCreateRequestSchema]
}
