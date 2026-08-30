package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecOperationAudienceInclude._

case class TargetingSpecOperationAudienceInclude (
  field: Field,
operation: TargetingSpecListOperation,
values: List[String])

object TargetingSpecOperationAudienceInclude {
  import DateTimeCodecs._
  sealed trait Field
  case object AUDIENCEINCLUDE extends Field

  object Field {
    def toField(s: String): Option[Field] = s match {
      case "AUDIENCEINCLUDE" => Some(AUDIENCEINCLUDE)
      case _ => None
    }

    def fromField(x: Field): String = x match {
      case AUDIENCEINCLUDE => "AUDIENCEINCLUDE"
    }
  }

  implicit val FieldEnumEncoder: EncodeJson[Field] =
    EncodeJson[Field](is => StringEncodeJson(Field.fromField(is)))

  implicit val FieldEnumDecoder: DecodeJson[Field] =
    DecodeJson.optionDecoder[Field](n => n.string.flatMap(jStr => Field.toField(jStr)), "Field failed to de-serialize")

  implicit val TargetingSpecOperationAudienceIncludeCodecJson: CodecJson[TargetingSpecOperationAudienceInclude] = CodecJson.derive[TargetingSpecOperationAudienceInclude]
  implicit val TargetingSpecOperationAudienceIncludeDecoder: EntityDecoder[TargetingSpecOperationAudienceInclude] = jsonOf[TargetingSpecOperationAudienceInclude]
  implicit val TargetingSpecOperationAudienceIncludeEncoder: EntityEncoder[TargetingSpecOperationAudienceInclude] = jsonEncoderOf[TargetingSpecOperationAudienceInclude]
}
