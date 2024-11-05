package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailProductGroupProductCounts._

case class CatalogsRetailProductGroupProductCounts (
  catalogType: CatalogType,
inStock: BigDecimal,
outOfStock: BigDecimal,
preorder: BigDecimal,
total: BigDecimal,
videos: Option[BigDecimal])

object CatalogsRetailProductGroupProductCounts {
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

  implicit val CatalogsRetailProductGroupProductCountsCodecJson: CodecJson[CatalogsRetailProductGroupProductCounts] = CodecJson.derive[CatalogsRetailProductGroupProductCounts]
  implicit val CatalogsRetailProductGroupProductCountsDecoder: EntityDecoder[CatalogsRetailProductGroupProductCounts] = jsonOf[CatalogsRetailProductGroupProductCounts]
  implicit val CatalogsRetailProductGroupProductCountsEncoder: EntityEncoder[CatalogsRetailProductGroupProductCounts] = jsonEncoderOf[CatalogsRetailProductGroupProductCounts]
}
