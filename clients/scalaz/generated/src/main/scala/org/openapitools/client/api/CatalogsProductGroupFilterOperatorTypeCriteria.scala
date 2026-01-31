package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupFilterOperatorTypeCriteria._

case class CatalogsProductGroupFilterOperatorTypeCriteria (
  filterOperatorType: Option[FilterOperatorType],
negated: Option[Boolean],
values: List[String])

object CatalogsProductGroupFilterOperatorTypeCriteria {
  import DateTimeCodecs._
  sealed trait FilterOperatorType
  case object IS extends FilterOperatorType
  case object CONTAINS extends FilterOperatorType

  object FilterOperatorType {
    def toFilterOperatorType(s: String): Option[FilterOperatorType] = s match {
      case "IS" => Some(IS)
      case "CONTAINS" => Some(CONTAINS)
      case _ => None
    }

    def fromFilterOperatorType(x: FilterOperatorType): String = x match {
      case IS => "IS"
      case CONTAINS => "CONTAINS"
    }
  }

  implicit val FilterOperatorTypeEnumEncoder: EncodeJson[FilterOperatorType] =
    EncodeJson[FilterOperatorType](is => StringEncodeJson(FilterOperatorType.fromFilterOperatorType(is)))

  implicit val FilterOperatorTypeEnumDecoder: DecodeJson[FilterOperatorType] =
    DecodeJson.optionDecoder[FilterOperatorType](n => n.string.flatMap(jStr => FilterOperatorType.toFilterOperatorType(jStr)), "FilterOperatorType failed to de-serialize")

  implicit val CatalogsProductGroupFilterOperatorTypeCriteriaCodecJson: CodecJson[CatalogsProductGroupFilterOperatorTypeCriteria] = CodecJson.derive[CatalogsProductGroupFilterOperatorTypeCriteria]
  implicit val CatalogsProductGroupFilterOperatorTypeCriteriaDecoder: EntityDecoder[CatalogsProductGroupFilterOperatorTypeCriteria] = jsonOf[CatalogsProductGroupFilterOperatorTypeCriteria]
  implicit val CatalogsProductGroupFilterOperatorTypeCriteriaEncoder: EntityEncoder[CatalogsProductGroupFilterOperatorTypeCriteria] = jsonEncoderOf[CatalogsProductGroupFilterOperatorTypeCriteria]
}
