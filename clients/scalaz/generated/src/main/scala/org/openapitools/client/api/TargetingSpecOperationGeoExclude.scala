package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecOperationGeoExclude._

case class TargetingSpecOperationGeoExclude (
  field: Field,
operation: TargetingSpecListOperation,
values: List[String])

object TargetingSpecOperationGeoExclude {
  import DateTimeCodecs._
  sealed trait Field
  case object GEOEXCLUDE extends Field

  object Field {
    def toField(s: String): Option[Field] = s match {
      case "GEOEXCLUDE" => Some(GEOEXCLUDE)
      case _ => None
    }

    def fromField(x: Field): String = x match {
      case GEOEXCLUDE => "GEOEXCLUDE"
    }
  }

  implicit val FieldEnumEncoder: EncodeJson[Field] =
    EncodeJson[Field](is => StringEncodeJson(Field.fromField(is)))

  implicit val FieldEnumDecoder: DecodeJson[Field] =
    DecodeJson.optionDecoder[Field](n => n.string.flatMap(jStr => Field.toField(jStr)), "Field failed to de-serialize")

  implicit val TargetingSpecOperationGeoExcludeCodecJson: CodecJson[TargetingSpecOperationGeoExclude] = CodecJson.derive[TargetingSpecOperationGeoExclude]
  implicit val TargetingSpecOperationGeoExcludeDecoder: EntityDecoder[TargetingSpecOperationGeoExclude] = jsonOf[TargetingSpecOperationGeoExclude]
  implicit val TargetingSpecOperationGeoExcludeEncoder: EntityEncoder[TargetingSpecOperationGeoExclude] = jsonEncoderOf[TargetingSpecOperationGeoExclude]
}
