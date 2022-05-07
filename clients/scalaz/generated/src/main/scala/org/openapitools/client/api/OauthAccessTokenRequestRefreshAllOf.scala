package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OauthAccessTokenRequestRefreshAllOf._

case class OauthAccessTokenRequestRefreshAllOf (
  refreshToken: String,
scope: Option[String])

object OauthAccessTokenRequestRefreshAllOf {
  import DateTimeCodecs._

  implicit val OauthAccessTokenRequestRefreshAllOfCodecJson: CodecJson[OauthAccessTokenRequestRefreshAllOf] = CodecJson.derive[OauthAccessTokenRequestRefreshAllOf]
  implicit val OauthAccessTokenRequestRefreshAllOfDecoder: EntityDecoder[OauthAccessTokenRequestRefreshAllOf] = jsonOf[OauthAccessTokenRequestRefreshAllOf]
  implicit val OauthAccessTokenRequestRefreshAllOfEncoder: EntityEncoder[OauthAccessTokenRequestRefreshAllOf] = jsonEncoderOf[OauthAccessTokenRequestRefreshAllOf]
}
