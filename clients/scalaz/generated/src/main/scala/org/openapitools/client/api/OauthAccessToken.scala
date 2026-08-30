package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OauthAccessToken._

case class OauthAccessToken (
  accessToken: String,
expiresIn: Integer,
refreshToken: Option[String],
refreshTokenExpiresAt: Option[Integer],
refreshTokenExpiresIn: Option[Integer],
responseType: Option[TokenGrantType],
scope: Option[String],
tokenType: String)

object OauthAccessToken {
  import DateTimeCodecs._

  implicit val OauthAccessTokenCodecJson: CodecJson[OauthAccessToken] = CodecJson.derive[OauthAccessToken]
  implicit val OauthAccessTokenDecoder: EntityDecoder[OauthAccessToken] = jsonOf[OauthAccessToken]
  implicit val OauthAccessTokenEncoder: EntityEncoder[OauthAccessToken] = jsonEncoderOf[OauthAccessToken]
}
