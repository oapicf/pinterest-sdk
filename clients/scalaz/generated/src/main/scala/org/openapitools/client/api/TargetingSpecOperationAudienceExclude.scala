package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecOperationAudienceExclude._

case class TargetingSpecOperationAudienceExclude (
  field: Field,
operation: TargetingSpecListOperation,
values: List[String])

object TargetingSpecOperationAudienceExclude {
  import DateTimeCodecs._
  sealed trait Field
  case object AUDIENCEEXCLUDE extends Field

  object Field {
    def toField(s: String): Option[Field] = s match {
      case "AUDIENCEEXCLUDE" => Some(AUDIENCEEXCLUDE)
      case _ => None
    }

    def fromField(x: Field): String = x match {
      case AUDIENCEEXCLUDE => "AUDIENCEEXCLUDE"
    }
  }

  implicit val FieldEnumEncoder: EncodeJson[Field] =
    EncodeJson[Field](is => StringEncodeJson(Field.fromField(is)))

  implicit val FieldEnumDecoder: DecodeJson[Field] =
    DecodeJson.optionDecoder[Field](n => n.string.flatMap(jStr => Field.toField(jStr)), "Field failed to de-serialize")

  implicit val TargetingSpecOperationAudienceExcludeCodecJson: CodecJson[TargetingSpecOperationAudienceExclude] = CodecJson.derive[TargetingSpecOperationAudienceExclude]
  implicit val TargetingSpecOperationAudienceExcludeDecoder: EntityDecoder[TargetingSpecOperationAudienceExclude] = jsonOf[TargetingSpecOperationAudienceExclude]
  implicit val TargetingSpecOperationAudienceExcludeEncoder: EntityEncoder[TargetingSpecOperationAudienceExclude] = jsonEncoderOf[TargetingSpecOperationAudienceExclude]
}
