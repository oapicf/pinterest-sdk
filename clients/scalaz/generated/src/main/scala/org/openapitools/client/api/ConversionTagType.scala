package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionTagType._

case class ConversionTagType (
  
object ConversionTagType {
  import DateTimeCodecs._

  implicit val ConversionTagTypeCodecJson: CodecJson[ConversionTagType] = CodecJson.derive[ConversionTagType]
  implicit val ConversionTagTypeDecoder: EntityDecoder[ConversionTagType] = jsonOf[ConversionTagType]
  implicit val ConversionTagTypeEncoder: EntityEncoder[ConversionTagType] = jsonEncoderOf[ConversionTagType]
}
