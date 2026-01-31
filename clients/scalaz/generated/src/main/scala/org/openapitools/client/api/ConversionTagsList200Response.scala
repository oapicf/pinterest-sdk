package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionTagsList200Response._

case class ConversionTagsList200Response (
  items: List[ConversionTag])

object ConversionTagsList200Response {
  import DateTimeCodecs._

  implicit val ConversionTagsList200ResponseCodecJson: CodecJson[ConversionTagsList200Response] = CodecJson.derive[ConversionTagsList200Response]
  implicit val ConversionTagsList200ResponseDecoder: EntityDecoder[ConversionTagsList200Response] = jsonOf[ConversionTagsList200Response]
  implicit val ConversionTagsList200ResponseEncoder: EntityEncoder[ConversionTagsList200Response] = jsonEncoderOf[ConversionTagsList200Response]
}
