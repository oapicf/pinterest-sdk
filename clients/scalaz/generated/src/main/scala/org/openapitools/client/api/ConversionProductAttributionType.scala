package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionProductAttributionType._

case class ConversionProductAttributionType (
  
object ConversionProductAttributionType {
  import DateTimeCodecs._

  implicit val ConversionProductAttributionTypeCodecJson: CodecJson[ConversionProductAttributionType] = CodecJson.derive[ConversionProductAttributionType]
  implicit val ConversionProductAttributionTypeDecoder: EntityDecoder[ConversionProductAttributionType] = jsonOf[ConversionProductAttributionType]
  implicit val ConversionProductAttributionTypeEncoder: EntityEncoder[ConversionProductAttributionType] = jsonEncoderOf[ConversionProductAttributionType]
}
