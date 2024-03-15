package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsHotelProductGroupCreateRequest._

case class CatalogsHotelProductGroupCreateRequest (
  catalogType: CatalogType,
name: String,
description: Option[String],
filters: CatalogsHotelProductGroupFilters,
/* Catalog id pertaining to the hotel product group. */
  catalogId: String)

object CatalogsHotelProductGroupCreateRequest {
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

  implicit val CatalogsHotelProductGroupCreateRequestCodecJson: CodecJson[CatalogsHotelProductGroupCreateRequest] = CodecJson.derive[CatalogsHotelProductGroupCreateRequest]
  implicit val CatalogsHotelProductGroupCreateRequestDecoder: EntityDecoder[CatalogsHotelProductGroupCreateRequest] = jsonOf[CatalogsHotelProductGroupCreateRequest]
  implicit val CatalogsHotelProductGroupCreateRequestEncoder: EntityEncoder[CatalogsHotelProductGroupCreateRequest] = jsonEncoderOf[CatalogsHotelProductGroupCreateRequest]
}
