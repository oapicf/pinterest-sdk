package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecOperationLocale._

case class TargetingSpecOperationLocale (
  field: Field,
operation: TargetingSpecListOperation,
values: List[String])

object TargetingSpecOperationLocale {
  import DateTimeCodecs._
  sealed trait Field
  case object LOCALE extends Field

  object Field {
    def toField(s: String): Option[Field] = s match {
      case "LOCALE" => Some(LOCALE)
      case _ => None
    }

    def fromField(x: Field): String = x match {
      case LOCALE => "LOCALE"
    }
  }

  implicit val FieldEnumEncoder: EncodeJson[Field] =
    EncodeJson[Field](is => StringEncodeJson(Field.fromField(is)))

  implicit val FieldEnumDecoder: DecodeJson[Field] =
    DecodeJson.optionDecoder[Field](n => n.string.flatMap(jStr => Field.toField(jStr)), "Field failed to de-serialize")

  implicit val TargetingSpecOperationLocaleCodecJson: CodecJson[TargetingSpecOperationLocale] = CodecJson.derive[TargetingSpecOperationLocale]
  implicit val TargetingSpecOperationLocaleDecoder: EntityDecoder[TargetingSpecOperationLocale] = jsonOf[TargetingSpecOperationLocale]
  implicit val TargetingSpecOperationLocaleEncoder: EntityEncoder[TargetingSpecOperationLocale] = jsonEncoderOf[TargetingSpecOperationLocale]
}
