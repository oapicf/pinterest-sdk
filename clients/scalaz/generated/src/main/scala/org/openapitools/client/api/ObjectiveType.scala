package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ObjectiveType._

case class ObjectiveType (
  
object ObjectiveType {
  import DateTimeCodecs._

  implicit val ObjectiveTypeCodecJson: CodecJson[ObjectiveType] = CodecJson.derive[ObjectiveType]
  implicit val ObjectiveTypeDecoder: EntityDecoder[ObjectiveType] = jsonOf[ObjectiveType]
  implicit val ObjectiveTypeEncoder: EntityEncoder[ObjectiveType] = jsonEncoderOf[ObjectiveType]
}
