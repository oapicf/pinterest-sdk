package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionObjectiveType._

case class ConversionObjectiveType (
  
object ConversionObjectiveType {
  import DateTimeCodecs._

  implicit val ConversionObjectiveTypeCodecJson: CodecJson[ConversionObjectiveType] = CodecJson.derive[ConversionObjectiveType]
  implicit val ConversionObjectiveTypeDecoder: EntityDecoder[ConversionObjectiveType] = jsonOf[ConversionObjectiveType]
  implicit val ConversionObjectiveTypeEncoder: EntityEncoder[ConversionObjectiveType] = jsonEncoderOf[ConversionObjectiveType]
}
