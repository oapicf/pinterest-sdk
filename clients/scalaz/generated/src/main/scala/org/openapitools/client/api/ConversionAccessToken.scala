package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionAccessToken._

case class ConversionAccessToken (
  accessToken: String,
tokenType: Option[String])

object ConversionAccessToken {
  import DateTimeCodecs._

  implicit val ConversionAccessTokenCodecJson: CodecJson[ConversionAccessToken] = CodecJson.derive[ConversionAccessToken]
  implicit val ConversionAccessTokenDecoder: EntityDecoder[ConversionAccessToken] = jsonOf[ConversionAccessToken]
  implicit val ConversionAccessTokenEncoder: EntityEncoder[ConversionAccessToken] = jsonEncoderOf[ConversionAccessToken]
}
