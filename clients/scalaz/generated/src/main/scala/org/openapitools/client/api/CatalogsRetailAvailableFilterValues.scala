package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsRetailAvailableFilterValues._

case class CatalogsRetailAvailableFilterValues (
  catalogType: CatalogType,
filterValues: CatalogsRetailFilterValuesMap)

object CatalogsRetailAvailableFilterValues {
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

  implicit val CatalogsRetailAvailableFilterValuesCodecJson: CodecJson[CatalogsRetailAvailableFilterValues] = CodecJson.derive[CatalogsRetailAvailableFilterValues]
  implicit val CatalogsRetailAvailableFilterValuesDecoder: EntityDecoder[CatalogsRetailAvailableFilterValues] = jsonOf[CatalogsRetailAvailableFilterValues]
  implicit val CatalogsRetailAvailableFilterValuesEncoder: EntityEncoder[CatalogsRetailAvailableFilterValues] = jsonEncoderOf[CatalogsRetailAvailableFilterValues]
}
