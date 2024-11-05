package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailProductGroupUpdateRequest._

case class CatalogsRetailProductGroupUpdateRequest (
  /* Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. */
  catalogType: Option[CatalogType],
name: Option[String],
description: Option[String],
filters: Option[CatalogsProductGroupFiltersRequest],
country: Option[Country],
locale: Option[CatalogsLocale])

object CatalogsRetailProductGroupUpdateRequest {
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

  implicit val CatalogsRetailProductGroupUpdateRequestCodecJson: CodecJson[CatalogsRetailProductGroupUpdateRequest] = CodecJson.derive[CatalogsRetailProductGroupUpdateRequest]
  implicit val CatalogsRetailProductGroupUpdateRequestDecoder: EntityDecoder[CatalogsRetailProductGroupUpdateRequest] = jsonOf[CatalogsRetailProductGroupUpdateRequest]
  implicit val CatalogsRetailProductGroupUpdateRequestEncoder: EntityEncoder[CatalogsRetailProductGroupUpdateRequest] = jsonEncoderOf[CatalogsRetailProductGroupUpdateRequest]
}
