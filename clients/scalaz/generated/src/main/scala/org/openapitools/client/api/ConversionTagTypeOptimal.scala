package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionTagTypeOptimal._

case class ConversionTagTypeOptimal (
  
object ConversionTagTypeOptimal {
  import DateTimeCodecs._

  implicit val ConversionTagTypeOptimalCodecJson: CodecJson[ConversionTagTypeOptimal] = CodecJson.derive[ConversionTagTypeOptimal]
  implicit val ConversionTagTypeOptimalDecoder: EntityDecoder[ConversionTagTypeOptimal] = jsonOf[ConversionTagTypeOptimal]
  implicit val ConversionTagTypeOptimalEncoder: EntityEncoder[ConversionTagTypeOptimal] = jsonEncoderOf[ConversionTagTypeOptimal]
}
