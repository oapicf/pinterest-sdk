package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CatalogsProductGroupUint32Criteria._

case class CatalogsProductGroupUint32Criteria (
  negated: Option[Boolean],
operator: Operator,
value: Integer)

object CatalogsProductGroupUint32Criteria {
  import DateTimeCodecs._
  sealed trait Operator
  case object GREATERTHAN extends Operator
  case object GREATERTHANOREQUALS extends Operator
  case object LESSTHAN extends Operator
  case object LESSTHANOREQUALS extends Operator

  object Operator {
    def toOperator(s: String): Option[Operator] = s match {
      case "GREATERTHAN" => Some(GREATERTHAN)
      case "GREATERTHANOREQUALS" => Some(GREATERTHANOREQUALS)
      case "LESSTHAN" => Some(LESSTHAN)
      case "LESSTHANOREQUALS" => Some(LESSTHANOREQUALS)
      case _ => None
    }

    def fromOperator(x: Operator): String = x match {
      case GREATERTHAN => "GREATERTHAN"
      case GREATERTHANOREQUALS => "GREATERTHANOREQUALS"
      case LESSTHAN => "LESSTHAN"
      case LESSTHANOREQUALS => "LESSTHANOREQUALS"
    }
  }

  implicit val OperatorEnumEncoder: EncodeJson[Operator] =
    EncodeJson[Operator](is => StringEncodeJson(Operator.fromOperator(is)))

  implicit val OperatorEnumDecoder: DecodeJson[Operator] =
    DecodeJson.optionDecoder[Operator](n => n.string.flatMap(jStr => Operator.toOperator(jStr)), "Operator failed to de-serialize")

  implicit val CatalogsProductGroupUint32CriteriaCodecJson: CodecJson[CatalogsProductGroupUint32Criteria] = CodecJson.derive[CatalogsProductGroupUint32Criteria]
  implicit val CatalogsProductGroupUint32CriteriaDecoder: EntityDecoder[CatalogsProductGroupUint32Criteria] = jsonOf[CatalogsProductGroupUint32Criteria]
  implicit val CatalogsProductGroupUint32CriteriaEncoder: EntityEncoder[CatalogsProductGroupUint32Criteria] = jsonEncoderOf[CatalogsProductGroupUint32Criteria]
}
