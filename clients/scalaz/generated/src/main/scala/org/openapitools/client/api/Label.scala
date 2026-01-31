package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Label._

case class Label (
  /* Label ID. */
  id: Option[String],
labelType: Option[LabelType],
/* Label parent entity ID. */
  parentId: Option[String],
/* Label parent entity type. */
  parentType: Option[ParentType],
status: Option[LabelStatus],
/* Label name. */
  value: Option[String])

object Label {
  import DateTimeCodecs._
  sealed trait ParentType
  case object CAMPAIGN extends ParentType

  object ParentType {
    def toParentType(s: String): Option[ParentType] = s match {
      case "CAMPAIGN" => Some(CAMPAIGN)
      case _ => None
    }

    def fromParentType(x: ParentType): String = x match {
      case CAMPAIGN => "CAMPAIGN"
    }
  }

  implicit val ParentTypeEnumEncoder: EncodeJson[ParentType] =
    EncodeJson[ParentType](is => StringEncodeJson(ParentType.fromParentType(is)))

  implicit val ParentTypeEnumDecoder: DecodeJson[ParentType] =
    DecodeJson.optionDecoder[ParentType](n => n.string.flatMap(jStr => ParentType.toParentType(jStr)), "ParentType failed to de-serialize")

  implicit val LabelCodecJson: CodecJson[Label] = CodecJson.derive[Label]
  implicit val LabelDecoder: EntityDecoder[Label] = jsonOf[Label]
  implicit val LabelEncoder: EntityEncoder[Label] = jsonEncoderOf[Label]
}
