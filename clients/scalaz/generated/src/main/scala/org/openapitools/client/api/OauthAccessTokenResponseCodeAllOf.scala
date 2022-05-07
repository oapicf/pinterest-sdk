package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OauthAccessTokenResponseCodeAllOf._

case class OauthAccessTokenResponseCodeAllOf (
  refreshToken: String,
refreshTokenExpiresIn: Integer)

object OauthAccessTokenResponseCodeAllOf {
  import DateTimeCodecs._

  implicit val OauthAccessTokenResponseCodeAllOfCodecJson: CodecJson[OauthAccessTokenResponseCodeAllOf] = CodecJson.derive[OauthAccessTokenResponseCodeAllOf]
  implicit val OauthAccessTokenResponseCodeAllOfDecoder: EntityDecoder[OauthAccessTokenResponseCodeAllOf] = jsonOf[OauthAccessTokenResponseCodeAllOf]
  implicit val OauthAccessTokenResponseCodeAllOfEncoder: EntityEncoder[OauthAccessTokenResponseCodeAllOf] = jsonEncoderOf[OauthAccessTokenResponseCodeAllOf]
}
