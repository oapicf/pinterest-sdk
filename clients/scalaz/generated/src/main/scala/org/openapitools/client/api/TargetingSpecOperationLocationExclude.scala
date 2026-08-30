package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecOperationLocationExclude._

case class TargetingSpecOperationLocationExclude (
  field: Field,
operation: TargetingSpecListOperation,
values: List[String])

object TargetingSpecOperationLocationExclude {
  import DateTimeCodecs._
  sealed trait Field
  case object LOCATIONEXCLUDE extends Field

  object Field {
    def toField(s: String): Option[Field] = s match {
      case "LOCATIONEXCLUDE" => Some(LOCATIONEXCLUDE)
      case _ => None
    }

    def fromField(x: Field): String = x match {
      case LOCATIONEXCLUDE => "LOCATIONEXCLUDE"
    }
  }

  implicit val FieldEnumEncoder: EncodeJson[Field] =
    EncodeJson[Field](is => StringEncodeJson(Field.fromField(is)))

  implicit val FieldEnumDecoder: DecodeJson[Field] =
    DecodeJson.optionDecoder[Field](n => n.string.flatMap(jStr => Field.toField(jStr)), "Field failed to de-serialize")

  implicit val TargetingSpecOperationLocationExcludeCodecJson: CodecJson[TargetingSpecOperationLocationExclude] = CodecJson.derive[TargetingSpecOperationLocationExclude]
  implicit val TargetingSpecOperationLocationExcludeDecoder: EntityDecoder[TargetingSpecOperationLocationExclude] = jsonOf[TargetingSpecOperationLocationExclude]
  implicit val TargetingSpecOperationLocationExcludeEncoder: EntityEncoder[TargetingSpecOperationLocationExclude] = jsonEncoderOf[TargetingSpecOperationLocationExclude]
}
