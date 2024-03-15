package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelProductGroupUpdateRequest._

case class CatalogsHotelProductGroupUpdateRequest (
  catalogType: Option[CatalogType],
name: Option[String],
description: Option[String],
filters: Option[CatalogsHotelProductGroupFilters])

object CatalogsHotelProductGroupUpdateRequest {
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

  implicit val CatalogsHotelProductGroupUpdateRequestCodecJson: CodecJson[CatalogsHotelProductGroupUpdateRequest] = CodecJson.derive[CatalogsHotelProductGroupUpdateRequest]
  implicit val CatalogsHotelProductGroupUpdateRequestDecoder: EntityDecoder[CatalogsHotelProductGroupUpdateRequest] = jsonOf[CatalogsHotelProductGroupUpdateRequest]
  implicit val CatalogsHotelProductGroupUpdateRequestEncoder: EntityEncoder[CatalogsHotelProductGroupUpdateRequest] = jsonEncoderOf[CatalogsHotelProductGroupUpdateRequest]
}
