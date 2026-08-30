package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import TargetingSpecOperationGeo._

case class TargetingSpecOperationGeo (
  field: Field,
operation: TargetingSpecListOperation,
values: List[String])

object TargetingSpecOperationGeo {
  import DateTimeCodecs._
  sealed trait Field
  case object GEO extends Field

  object Field {
    def toField(s: String): Option[Field] = s match {
      case "GEO" => Some(GEO)
      case _ => None
    }

    def fromField(x: Field): String = x match {
      case GEO => "GEO"
    }
  }

  implicit val FieldEnumEncoder: EncodeJson[Field] =
    EncodeJson[Field](is => StringEncodeJson(Field.fromField(is)))

  implicit val FieldEnumDecoder: DecodeJson[Field] =
    DecodeJson.optionDecoder[Field](n => n.string.flatMap(jStr => Field.toField(jStr)), "Field failed to de-serialize")

  implicit val TargetingSpecOperationGeoCodecJson: CodecJson[TargetingSpecOperationGeo] = CodecJson.derive[TargetingSpecOperationGeo]
  implicit val TargetingSpecOperationGeoDecoder: EntityDecoder[TargetingSpecOperationGeo] = jsonOf[TargetingSpecOperationGeo]
  implicit val TargetingSpecOperationGeoEncoder: EntityEncoder[TargetingSpecOperationGeo] = jsonEncoderOf[TargetingSpecOperationGeo]
}
