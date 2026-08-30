package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecOperationLocation._

case class TargetingSpecOperationLocation (
  field: Field,
operation: TargetingSpecListOperation,
values: List[String])

object TargetingSpecOperationLocation {
  import DateTimeCodecs._
  sealed trait Field
  case object LOCATION extends Field

  object Field {
    def toField(s: String): Option[Field] = s match {
      case "LOCATION" => Some(LOCATION)
      case _ => None
    }

    def fromField(x: Field): String = x match {
      case LOCATION => "LOCATION"
    }
  }

  implicit val FieldEnumEncoder: EncodeJson[Field] =
    EncodeJson[Field](is => StringEncodeJson(Field.fromField(is)))

  implicit val FieldEnumDecoder: DecodeJson[Field] =
    DecodeJson.optionDecoder[Field](n => n.string.flatMap(jStr => Field.toField(jStr)), "Field failed to de-serialize")

  implicit val TargetingSpecOperationLocationCodecJson: CodecJson[TargetingSpecOperationLocation] = CodecJson.derive[TargetingSpecOperationLocation]
  implicit val TargetingSpecOperationLocationDecoder: EntityDecoder[TargetingSpecOperationLocation] = jsonOf[TargetingSpecOperationLocation]
  implicit val TargetingSpecOperationLocationEncoder: EntityEncoder[TargetingSpecOperationLocation] = jsonEncoderOf[TargetingSpecOperationLocation]
}
