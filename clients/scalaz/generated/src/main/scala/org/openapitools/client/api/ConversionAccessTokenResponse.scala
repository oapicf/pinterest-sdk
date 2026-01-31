package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ConversionAccessTokenResponse._

case class ConversionAccessTokenResponse (
  accessToken: String,
tokenType: Option[String])

object ConversionAccessTokenResponse {
  import DateTimeCodecs._

  implicit val ConversionAccessTokenResponseCodecJson: CodecJson[ConversionAccessTokenResponse] = CodecJson.derive[ConversionAccessTokenResponse]
  implicit val ConversionAccessTokenResponseDecoder: EntityDecoder[ConversionAccessTokenResponse] = jsonOf[ConversionAccessTokenResponse]
  implicit val ConversionAccessTokenResponseEncoder: EntityEncoder[ConversionAccessTokenResponse] = jsonEncoderOf[ConversionAccessTokenResponse]
}
