package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.time.OffsetDateTime

import CatalogsRetailFeed._

case class CatalogsRetailFeed (
  catalogType: CatalogType,
createdAt: OffsetDateTime,
credentials: Option[CatalogsFeedCredentials],
defaultAvailability: Option[ProductAvailabilityType],
defaultCountry: Country,
defaultCurrency: Option[NullableCurrency],
/* The locale used within a feed for product descriptions. */
  defaultLocale: String,
format: CatalogsFormat,
/* ID of the feed entity. */
  id: String,
/* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
  location: String,
/* A human-friendly name associated to a given feed. This value is currently nullable due to historical reasons. It is expected to become non-nullable in the future. */
  name: String,
preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
status: CatalogsStatus,
updatedAt: OffsetDateTime)

object CatalogsRetailFeed {
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

  implicit val CatalogsRetailFeedCodecJson: CodecJson[CatalogsRetailFeed] = CodecJson.derive[CatalogsRetailFeed]
  implicit val CatalogsRetailFeedDecoder: EntityDecoder[CatalogsRetailFeed] = jsonOf[CatalogsRetailFeed]
  implicit val CatalogsRetailFeedEncoder: EntityEncoder[CatalogsRetailFeed] = jsonEncoderOf[CatalogsRetailFeed]
}
