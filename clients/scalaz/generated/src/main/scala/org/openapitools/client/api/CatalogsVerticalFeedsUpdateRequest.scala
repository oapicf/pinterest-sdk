package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsVerticalFeedsUpdateRequest._

case class CatalogsVerticalFeedsUpdateRequest (
  catalogType: CatalogType,
credentials: Option[CatalogsFeedCredentials],
defaultAvailability: Option[ProductAvailabilityType],
defaultCurrency: Option[NullableCurrency],
format: Option[CatalogsFormat],
/* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
  location: Option[String],
/* A human-friendly name associated to a given feed. */
  name: Option[String],
preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
status: Option[CatalogsStatus])

object CatalogsVerticalFeedsUpdateRequest {
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

  implicit val CatalogsVerticalFeedsUpdateRequestCodecJson: CodecJson[CatalogsVerticalFeedsUpdateRequest] = CodecJson.derive[CatalogsVerticalFeedsUpdateRequest]
  implicit val CatalogsVerticalFeedsUpdateRequestDecoder: EntityDecoder[CatalogsVerticalFeedsUpdateRequest] = jsonOf[CatalogsVerticalFeedsUpdateRequest]
  implicit val CatalogsVerticalFeedsUpdateRequestEncoder: EntityEncoder[CatalogsVerticalFeedsUpdateRequest] = jsonEncoderOf[CatalogsVerticalFeedsUpdateRequest]
}
