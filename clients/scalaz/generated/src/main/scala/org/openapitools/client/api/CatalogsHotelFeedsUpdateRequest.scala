package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelFeedsUpdateRequest._

case class CatalogsHotelFeedsUpdateRequest (
  catalogType: CatalogType,
credentials: Option[CatalogsFeedCredentials],
defaultCurrency: Option[NullableCurrency],
format: Option[CatalogsFormat],
/* The URL where a feed is available for download. This URL is what Pinterest will use to download a feed for processing. */
  location: Option[String],
/* A human-friendly name associated to a given feed. */
  name: Option[String],
preferredProcessingSchedule: Option[CatalogsFeedProcessingSchedule],
status: Option[CatalogsStatus])

object CatalogsHotelFeedsUpdateRequest {
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

  implicit val CatalogsHotelFeedsUpdateRequestCodecJson: CodecJson[CatalogsHotelFeedsUpdateRequest] = CodecJson.derive[CatalogsHotelFeedsUpdateRequest]
  implicit val CatalogsHotelFeedsUpdateRequestDecoder: EntityDecoder[CatalogsHotelFeedsUpdateRequest] = jsonOf[CatalogsHotelFeedsUpdateRequest]
  implicit val CatalogsHotelFeedsUpdateRequestEncoder: EntityEncoder[CatalogsHotelFeedsUpdateRequest] = jsonEncoderOf[CatalogsHotelFeedsUpdateRequest]
}
