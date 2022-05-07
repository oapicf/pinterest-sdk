package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OauthAccessTokenRequestCodeAllOf._

case class OauthAccessTokenRequestCodeAllOf (
  code: String,
redirectUri: String)

object OauthAccessTokenRequestCodeAllOf {
  import DateTimeCodecs._

  implicit val OauthAccessTokenRequestCodeAllOfCodecJson: CodecJson[OauthAccessTokenRequestCodeAllOf] = CodecJson.derive[OauthAccessTokenRequestCodeAllOf]
  implicit val OauthAccessTokenRequestCodeAllOfDecoder: EntityDecoder[OauthAccessTokenRequestCodeAllOf] = jsonOf[OauthAccessTokenRequestCodeAllOf]
  implicit val OauthAccessTokenRequestCodeAllOfEncoder: EntityEncoder[OauthAccessTokenRequestCodeAllOf] = jsonEncoderOf[OauthAccessTokenRequestCodeAllOf]
}
