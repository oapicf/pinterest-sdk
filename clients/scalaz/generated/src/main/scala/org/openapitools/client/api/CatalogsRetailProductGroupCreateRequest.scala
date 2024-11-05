package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailProductGroupCreateRequest._

case class CatalogsRetailProductGroupCreateRequest (
  /* Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one. */
  catalogType: CatalogType,
name: String,
description: Option[String],
filters: CatalogsProductGroupFiltersRequest,
/* Catalog id pertaining to the retail product group. */
  catalogId: String,
country: Country,
locale: CatalogsLocale)

object CatalogsRetailProductGroupCreateRequest {
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

  implicit val CatalogsRetailProductGroupCreateRequestCodecJson: CodecJson[CatalogsRetailProductGroupCreateRequest] = CodecJson.derive[CatalogsRetailProductGroupCreateRequest]
  implicit val CatalogsRetailProductGroupCreateRequestDecoder: EntityDecoder[CatalogsRetailProductGroupCreateRequest] = jsonOf[CatalogsRetailProductGroupCreateRequest]
  implicit val CatalogsRetailProductGroupCreateRequestEncoder: EntityEncoder[CatalogsRetailProductGroupCreateRequest] = jsonEncoderOf[CatalogsRetailProductGroupCreateRequest]
}
